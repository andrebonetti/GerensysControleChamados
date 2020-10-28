package message.component;

import message.domain.ErrorResponse;
import message.domain.ErrorResponseDetail;
import message.domain.FieldError;
import message.domain.Response;
import message.exception.ConflictException;
import message.exception.NotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.HttpStatus.*;

@RestControllerAdvice
public class MyRestControllerAdvice {

    private static final Logger LOG = LoggerFactory.getLogger( MyRestControllerAdvice.class);
    private static final String GENERIC_ERROR = "messages.generic.error";
    private static final String FIELDS_VALIDATION_ERROR = "messages.fields.validation.error";
    private static final String HANDLING_MESSAGE_TO_ERROR = "Handling message to error: {}";
    private final MyMessageSourceAccessor accessor;

    public MyRestControllerAdvice(MyMessageSourceAccessor accessor) {
        this.accessor = accessor;
    }

    @ExceptionHandler(Throwable.class)
    private ResponseEntity<Response> error(Throwable exception) {
        LOG.error(HANDLING_MESSAGE_TO_ERROR, exception.getMessage(), exception);
        return ResponseEntity.status(INTERNAL_SERVER_ERROR)
                .body((ErrorResponse) () -> ErrorResponseDetail.builder()
                        .withDescription(accessor.get(GENERIC_ERROR))
                        .withError(GENERIC_ERROR)
                        .withStatus(INTERNAL_SERVER_ERROR.value())
                        .build());
    }

    @ExceptionHandler(ConflictException.class)
    private ResponseEntity<Response> conflict(Throwable exception) {
        return handleError(CONFLICT, exception);
    }

    @ExceptionHandler(NotFoundException.class)
    private ResponseEntity<Response> notFound(Throwable exception) {
        return handleError(NOT_FOUND, exception);
    }

    @ExceptionHandler({IllegalArgumentException.class, IllegalStateException.class})
    private ResponseEntity<Response> badRequest(Throwable exception) {
        return handleError(BAD_REQUEST, exception);
    }

    private ResponseEntity<Response> handleError(HttpStatus status, Throwable exception) {
        LOG.error(HANDLING_MESSAGE_TO_ERROR, exception.getMessage(), exception);
        String message = accessor.get(exception.getMessage());
        return ResponseEntity.status(status)
                .body((ErrorResponse) () -> ErrorResponseDetail.builder()
                        .withDescription(message)
                        .withError(exception.getMessage())
                        .withStatus(status.value())
                        .build());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Response> fieldValidator(MethodArgumentNotValidException exception) {
        LOG.error(HANDLING_MESSAGE_TO_ERROR, FIELDS_VALIDATION_ERROR, exception);
        List<FieldError> fieldErrors = toFieldErrors(exception);
        return ResponseEntity.status(UNPROCESSABLE_ENTITY)
                .body((ErrorResponse) () -> ErrorResponseDetail.builder()
                        .withDescription(accessor.get(FIELDS_VALIDATION_ERROR))
                        .withError(FIELDS_VALIDATION_ERROR)
                        .withFields(fieldErrors)
                        .withStatus(UNPROCESSABLE_ENTITY.value())
                        .build());
    }

    private List<FieldError> toFieldErrors(MethodArgumentNotValidException ex) {
        return ex.getBindingResult().getFieldErrors().stream().map(this::toFieldError)
                .collect(Collectors.toList());
    }

    private FieldError toFieldError(org.springframework.validation.FieldError fieldError) {
        String message = accessor.get(fieldError.getDefaultMessage());
        return new FieldError(fieldError.getField(), message);
    }

}

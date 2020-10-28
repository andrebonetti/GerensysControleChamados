package message.domain;

public interface ErrorResponse<T extends ErrorResponseDetail> extends Response {
    T getError();
}

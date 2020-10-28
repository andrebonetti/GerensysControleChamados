package config;

import com.controlefinanceiro.commons.MyRestControllerAdvice;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@Component
public class RestMockMvc {

    private static final Logger LOG = LoggerFactory.getLogger(RestMockMvc.class);

    @Autowired
    private MyRestControllerAdvice restControllerAdvice;

    private ObjectMapper objectMapper = new ObjectMapper();

    private MockMvc mockMvc;

    public void standaloneSetup(Object controller) {
        mockMvc = MockMvcBuilders.standaloneSetup(controller)
                .setMessageConverters(new MappingJackson2HttpMessageConverter())
                .setControllerAdvice(restControllerAdvice)
                .setCustomArgumentResolvers(new PageableHandlerMethodArgumentResolver())
                .build();
    }

    public ResultActions perform(RequestBuilder requestBuilder) throws Exception {
        return mockMvc.perform(requestBuilder);
    }

    public String toJson(Object object) {
        try {
            String json = objectMapper.writeValueAsString(object);
            LOG.info("Converted json {} ", json);
            return json;
        } catch (JsonProcessingException ex) {
            LOG.error("Error to convert object, return an empty object", ex);
            return "{}";
        }
    }

}

package message.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:message-application.properties")
@EnableConfigurationProperties({LocaleProperties.class})
public class MessagesConfiguration {
}
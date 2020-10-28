package message.component;

import message.config.LocaleProperties;
import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MyMessageSourceAccessor {

    private final LocaleProperties localeProperties;
    private final MessageSourceAccessor accessor;

    public MyMessageSourceAccessor(LocaleProperties localeProperties, MessageSource accessor) {
        this.localeProperties = localeProperties;
        this.accessor = new MessageSourceAccessor(accessor);
    }

    public String get(String code) {
        Locale locale = localeProperties.locale();
        return accessor.getMessage(code, locale);
    }

}

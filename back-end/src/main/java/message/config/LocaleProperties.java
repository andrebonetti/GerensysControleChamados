package message.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Locale;

@ConfigurationProperties(prefix = "locale", ignoreUnknownFields = false)
public class LocaleProperties {

    private String language;
    private String country;

    public Locale locale() {
        return new Locale(language, country);
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}

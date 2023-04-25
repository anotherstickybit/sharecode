package ru.puppeteers.sharecode.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.puppeteers.sharecode.util.UuidIdentifiedEntityEventListener;

@Configuration
public class AppConfig {

    @Bean
    public UuidIdentifiedEntityEventListener uuidIdentifiedEntityEventListener() {
        return new UuidIdentifiedEntityEventListener();
    }
}

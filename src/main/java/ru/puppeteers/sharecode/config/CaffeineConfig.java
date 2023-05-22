package ru.puppeteers.sharecode.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@EnableCaching
@Configuration
public class CaffeineConfig {


    public class CaffeineConfiguration {
        @Bean
        public Caffeine caffeineConfig() {
            return Caffeine.newBuilder()
                    .expireAfterWrite(3, TimeUnit.DAYS);
        }

        @Bean
        public CacheManager cacheManager(Caffeine caffeine) {
            CaffeineCacheManager caffeineCacheManager = new CaffeineCacheManager();
            caffeineCacheManager.getCache("formats");
            caffeineCacheManager.setCaffeine(caffeine);
            return caffeineCacheManager;
        }
    }
}

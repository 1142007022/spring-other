package com.kaishengit.config;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {
    private Map<String, Long> expires;

    public void setExpires(Map<String, Long> expires) {
        this.expires = expires;
    }

    public Map<String, Long> getExpires() {
        return expires;
    }
}

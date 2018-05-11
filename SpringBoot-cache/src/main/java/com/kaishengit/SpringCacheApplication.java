package com.kaishengit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCacheApplication {

   /* @Bean
    public CacheManager cacheManager() {
        return new EhCacheCacheManager();
    }*/
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCacheApplication.class, args);
	}
}



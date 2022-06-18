package com.jkx.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * {@code @ClassName} ApplicationContextConfig
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/16 16:52
 * {@code @Version} 1.0
 **/
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
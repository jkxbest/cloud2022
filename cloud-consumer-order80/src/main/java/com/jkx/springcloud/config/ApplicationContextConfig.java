package com.jkx.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * {@code @name} ApplicationContextConfig
 * {@code @description} //TODO 配置类
 * {@code @author}  jkx
 * {@code @time} 2022/5/25 23:57
 * {@code @version}  1.0
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
//    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}

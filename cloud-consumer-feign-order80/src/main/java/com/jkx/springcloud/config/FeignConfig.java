package com.jkx.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@code @ClassName} FeignConfig
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/12 11:18
 * {@code @Version} 1.0
 */
@Configuration
public class FeignConfig {

    /**
     * Feign logger level logger . level.
     * 日志增强
     *
     * @return the logger . level
     */
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}

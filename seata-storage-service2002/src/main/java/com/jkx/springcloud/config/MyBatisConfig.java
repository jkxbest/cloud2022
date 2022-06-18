package com.jkx.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * {@code @ClassName} MyBatisConfig
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/16 21:03
 * {@code @Version} 1.0
 **/
@Configuration
@MapperScan("com.jkx.springcloud.dao")
public class MyBatisConfig {
}

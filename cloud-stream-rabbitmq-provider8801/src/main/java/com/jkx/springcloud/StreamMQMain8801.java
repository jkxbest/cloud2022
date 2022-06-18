package com.jkx.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * {@code @ClassName} StreamMQMain8801
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/14 19:53
 * {@code @Version} 1.0
 **/
@SpringBootApplication
@Slf4j
public class StreamMQMain8801 {

    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8801.class, args);
        log.info("cloud-stream-provider8801 启动成功");
    }
}

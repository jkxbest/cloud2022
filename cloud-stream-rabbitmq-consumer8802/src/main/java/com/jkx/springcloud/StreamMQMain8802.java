package com.jkx.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * {@code @ClassName} StreamMQMain8802
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/14 20:26
 * {@code @Version} 1.0
 **/
@SpringBootApplication
@Slf4j
public class StreamMQMain8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8802.class,args);
        log.info("cloud-stream-provider8802 启动成功");
    }
}

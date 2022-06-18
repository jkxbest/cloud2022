package com.jkx.springcloud.service;

import com.jkx.springcloud.util.IdGeneratorSnowflake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * {@code @ClassName} OrderService
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/17 15:04
 * {@code @Version} 1.0
 **/
@Service
public class OrderService {

    @Autowired
    private IdGeneratorSnowflake idGenerator;

    public String getIDBySnowflake() {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        int count =20;
        for (int i = 0; i < count; i++) {
            threadPool.submit(()->{
                System.out.println(idGenerator.snowflakeId());
            });
        }
        threadPool.shutdown();
        return "hello world";
    }
}

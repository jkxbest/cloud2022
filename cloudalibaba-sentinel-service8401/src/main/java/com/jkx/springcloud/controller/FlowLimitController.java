package com.jkx.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * {@code @ClassName} FlowLimitController
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/16 11:30
 * {@code @Version} 1.0
 **/
@RestController
@Slf4j
public class FlowLimitController {

    @SneakyThrows
    @GetMapping("/testA")
    public String testA() {
// TimeUnit.MILLISECONDS.sleep 包装了 Thread.sleep方法
        TimeUnit.MILLISECONDS.sleep(800);
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "------testB";
    }

    @GetMapping("/testC")
    public String testC() {
        log.info("testC 异常比例");
        int age = 10 / 0;
        return "------testC";
    }

    @SneakyThrows
    @GetMapping("/testD")
    public String testD() {
        TimeUnit.SECONDS.sleep(1);
        log.info("testD 测试RT");
        return "------testD";
    }

    @GetMapping("/testE")
    public String testE() {
        log.info("testE 测试异常数");
        int age = 10 / 0;
        return "------testE 测试异常数";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "del_testHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2) {
        int age = 10 / 0;
        return "--------testHotKey";
    }

    public String del_testHotKey(String p1, String p2, BlockException e) {
        return "--------del_testHotKey{smile}";
    }
}

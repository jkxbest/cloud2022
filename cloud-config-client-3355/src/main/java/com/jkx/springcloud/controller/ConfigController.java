package com.jkx.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @ClassName} ConfigController
 * {@code @Description} //TODO  @RefreshScope 实现热加载 自动获取刷新内容
 * {@code @Author} jkx
 * {@code @Data} 2022/6/14 17:16
 * {@code @Version} 1.0
 **/
@RestController
@RefreshScope
public class ConfigController {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configinfo")
    public String getConfigInfo() {
        return configInfo;
    }
}

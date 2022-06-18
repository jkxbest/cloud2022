package com.jkx.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @ClassName} ConfigClientController
 * {@code @Description} //TODO  @RefreshScope 支持Nacos的动态刷新功能。
 * {@code @Author} jkx
 * {@code @Data} 2022/6/15 16:26
 * {@code @Version} 1.0
 **/
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}
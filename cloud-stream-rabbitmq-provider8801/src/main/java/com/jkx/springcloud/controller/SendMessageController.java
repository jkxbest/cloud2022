package com.jkx.springcloud.controller;

import com.jkx.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * {@code @ClassName} SendMessageController
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/14 20:02
 * {@code @Version} 1.0
 **/
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return messageProvider.send();
    }

}

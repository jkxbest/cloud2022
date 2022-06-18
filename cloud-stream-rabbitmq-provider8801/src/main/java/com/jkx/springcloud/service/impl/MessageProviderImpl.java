package com.jkx.springcloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.jkx.springcloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

/**
 * {@code @ClassName} MessageProviderImpl
 * {@code @Description} //TODO  @EnableBinding(Source.class) 定义消息的推送管道 将Channel和Exchanges绑定在一起
 * {@code @Author} jkx
 * {@code @Data} 2022/6/14 19:56
 * {@code @Version} 1.0
 */
@EnableBinding(Source.class)
@Slf4j
public class MessageProviderImpl implements IMessageProvider {
    //消息发送管道/信道
    @Autowired
    private MessageChannel output;

    @Override
    public String send() {
        String serial = IdUtil.simpleUUID();
        Message<String> stringMessage = MessageBuilder.withPayload(serial).build();
        output.send(stringMessage);
        log.info("*****serial: " + serial);
        return serial;
    }
}

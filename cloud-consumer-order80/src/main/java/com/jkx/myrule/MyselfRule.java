package com.jkx.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@code @ClassName} MyselfRule
 * {@code @Description} //TODO 规则 ribbon客服端负载均衡
 * {@code @Author} jkx
 * {@code @Data} 2022/6/11 20:20
 * {@code @Version} 1.0
 **/
@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}

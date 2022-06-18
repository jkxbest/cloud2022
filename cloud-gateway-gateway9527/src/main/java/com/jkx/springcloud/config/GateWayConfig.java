package com.jkx.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@code @ClassName} GateWayConfig
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/13 20:36
 * {@code @Version} 1.0
 **/
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("news_china_routh",r->r.path("/guonei").uri("https://news.baidu.com")).build();
        return routes.build();
    }
}

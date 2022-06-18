package com.jkx.springcloud.controller;

import com.jkx.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code @ClassName} OrderController
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/17 15:05
 * {@code @Version} 1.0
 **/
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/snowflake")
    public String snowflake(){
        return orderService.getIDBySnowflake();
    }
}

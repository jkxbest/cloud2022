package com.jkx.springcloud.service;

import com.jkx.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@FeignClient(value = "seata-account-service")
public interface AccountService {
    /**
     * {@code @Author} jkx
     * {@code @Description} //TODO
     * {@code @Date} 13:19 2022/6/17
     * {@code @Param} [userId, money]
     * {@code @Return} com.jkx.springcloud.domain.CommonResult
     **/
    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);

}
package com.jkx.springcloud.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * The interface Account service.
 */
public interface AccountService {
    /**
     * {@code @Author} jkx
     * {@code @Description} //TODO 扣减账户余额
     * {@code @Date} 22:01 2022/6/16
     * {@code @Param} [userId, money]
     * {@code @Return} void
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}

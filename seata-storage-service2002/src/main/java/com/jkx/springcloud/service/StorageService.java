package com.jkx.springcloud.service;

public interface StorageService {
    /**
     * {@code @Author} jkx
     * {@code @Description} //TODO  扣减库存
     * {@code @Date} 12:05 2022/6/17
     * {@code @Param} [productId, count]
     * {@code @Return} void
     **/
    void decrease(Long productId, Integer count);
}
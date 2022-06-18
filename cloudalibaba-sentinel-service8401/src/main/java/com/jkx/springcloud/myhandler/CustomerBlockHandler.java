package com.jkx.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.jkx.springcloud.entities.CommonResult;

/**
 * {@code @ClassName} CustomerBlockHandler
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/16 16:27
 * {@code @Version} 1.0
 **/
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----1");
    }


    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客戶自定义,global handlerException----2");
    }
}

package com.jkx.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * {@code @name} CommonResult
 * {@code @description} //TODO 传给前端数据结果
 * {@code @author}  jkx
 * {@code @time} 2022/5/25 20:31
 * {@code @version}  1.0
 *
 * @param <T> the type parameter
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    /**
     * Instantiates a new Common result.
     *
     * @param code    the code
     * @param message the message
     */
    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}

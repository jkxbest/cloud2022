package com.jkx.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * {@code @name} Payment
 * {@code @description} //TODO 支付实体类
 * {@code @author}  jkx
 * {@code @time} 2022/5/25 20:26
 * {@code @version}  1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private static final long serialVersionUID = 6918140131770711189L;
    private Long id;
    private String serial;
}

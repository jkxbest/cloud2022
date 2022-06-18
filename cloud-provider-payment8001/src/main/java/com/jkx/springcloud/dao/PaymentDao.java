package com.jkx.springcloud.dao;

import com.jkx.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * {@code @author}  jkx
 * {@code @description} //TODO
 * {@code @time} 20:37 2022/5/25
 * {@code @params}
 * {@code @return}
 **/
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}

package com.jkx.springcloud.service.impl;

import com.jkx.springcloud.dao.PaymentDao;
import com.jkx.springcloud.entities.Payment;
import com.jkx.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * {@code @name} PaymentServiceImpl
 * {@code @description} //TODO   Payment业务层实现类
 * {@code @author}  jkx
 * {@code @time} 2022/5/25 20:57
 * {@code @version}  1.0
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource()
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}

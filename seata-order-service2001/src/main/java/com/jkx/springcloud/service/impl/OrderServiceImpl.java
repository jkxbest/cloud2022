package com.jkx.springcloud.service.impl;

import com.jkx.springcloud.dao.OrderDao;
import com.jkx.springcloud.domain.Order;
import com.jkx.springcloud.service.AccountService;
import com.jkx.springcloud.service.OrderService;
import com.jkx.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * {@code @ClassName} OrderServiceImpl
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/16 20:42
 * {@code @Version} 1.0
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Autowired
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    /**
     * {@code @Author} jkx
     * {@code @Description} //TODO  创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     * * 简单说：下订单->扣库存->减余额->改状态
     * * 注释掉 @GlobalTransactional 的时候，需要注意下方这个方法里面手动模拟了延时，也需要注释掉
     * {@code @Date} 20:58 2022/6/16
     * {@code @Param} [order]
     * {@code @Return} void
     **/
    @Override
    @GlobalTransactional(name = "cloud-create-order",rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("------->开始新建订单-------");
        orderDao.create(order);
        log.info("------->订单微服务开始调用库存，做扣减count------");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("------->订单微服务开始调用库存，做扣减结束-------");

        log.info("------->订单微服务开始调用账户，做扣减money-------");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("------->订单微服务开始调用账户，做扣减结束-------");

        //4 修改订单状态，从零到1,1代表已经完成
        log.info("-------->修改订单状态开始-----------------------");
        orderDao.update(order.getUserId(), 0);
        log.info("-------->修改订单状态结束------------------------");

        log.info("--------->下订单结束了，O(∩_∩)O哈哈~--------------");
    }
}

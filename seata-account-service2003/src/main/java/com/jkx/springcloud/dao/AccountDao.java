package com.jkx.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * The interface Account dao.
 */
@Mapper
public interface AccountDao {
    /**
     * {@code @Author} jkx
     * {@code @Description} //TODO  扣减账户余额
     * {@code @Date} 21:52 2022/6/16
     * {@code @Param} [userId, money]
     * {@code @Return} void
     */
    void decrease(@Param("userId") Long userId,
                  @Param("money") BigDecimal money);
}

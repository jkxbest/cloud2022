package com.jkx.springcloud.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * {@code @ClassName} StorageDao
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/16 22:41
 * {@code @Version} 1.0
 **/

@Mapper
public interface StorageDao {

    //扣减库存
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}

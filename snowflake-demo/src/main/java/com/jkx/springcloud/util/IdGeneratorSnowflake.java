package com.jkx.springcloud.util;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.IdUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * {@code @ClassName} IdGeneratorSnowflake
 * {@code @Description} //TODO
 * {@code @Author} jkx
 * {@code @Data} 2022/6/17 15:09
 * {@code @Version} 1.0
 **/
@Slf4j
@Component
public class IdGeneratorSnowflake {
    private long workerId = 0;
    private long datacenterId = 1;
    private Snowflake snowflake = IdUtil.getSnowflake(workerId, datacenterId);

    @PostConstruct
    public void init() {
        try {
            workerId = NetUtil.ipv4ToLong(NetUtil.getLocalhostStr());
            log.info("当前机器的workerId:{}", workerId);
        } catch (Exception e) {
            log.warn("当前机器的workerId获取失败，", e.getMessage());
            workerId = NetUtil.getLocalhostStr().hashCode();
        }
    }

    public synchronized long snowflakeId() {
        return snowflake.nextId();
    }

    public synchronized long snowflakeId(long workerId, long dataCenterId) {
        Snowflake snowflake = IdUtil.getSnowflake(workerId, dataCenterId);
        return snowflake.nextId();
    }

    public static void main(String[] args) {
        long snowflakeId = new IdGeneratorSnowflake().snowflakeId();
        System.out.println(snowflakeId);
    }
}


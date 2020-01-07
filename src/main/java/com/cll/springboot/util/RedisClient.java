package com.cll.springboot.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @ClassName RedisClient
 * @Description 操作redis的客户端
 * @Author cll
 * @Date 2020-01-06 22:06
 * @Version 1.0
 **/
@Component
public class RedisClient {

    @Autowired
    StringRedisTemplate template;

    public boolean set(String key, String value){
        try{
            template.opsForValue().set(key,value);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public String get(String key){
        return template.opsForValue().get(key);
    }
}

package com.cll.springboot.controller;

import com.cll.springboot.domain.User;
import com.cll.springboot.util.JsonUtils;
import com.cll.springboot.util.RedisClient;
import com.cll.springboot.util.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ReidsController
 * @Description TODO
 * @Author cll
 * @Date 2020-01-06 21:52
 * @Version 1.0
 **/
@RestController
@RequestMapping("redis")
public class ReidsController {

    @Autowired
    StringRedisTemplate redisTemplate;

    @RequestMapping("add")
    public Object add(){
        redisTemplate.opsForValue().set("name","cll");
        return ResultData.success();
    }

    @RequestMapping("get")
    public Object get(){
        String value = redisTemplate.opsForValue().get("name");
        return ResultData.success(value);
    }

    @Autowired
    RedisClient client;

    @RequestMapping("save")
    public Object save(){
        User user = new User(1,"cll","chenleilei_92@163.com");
        String userStr = JsonUtils.object2String(user);
        boolean flag = client.set("user:cll:1",userStr);
        return ResultData.success();
    }

    @RequestMapping("find")
    public Object find(){
        String info = client.get("user:cll:1");
        User user = JsonUtils.string2Object(info,User.class);
        return ResultData.success(user);
    }

}

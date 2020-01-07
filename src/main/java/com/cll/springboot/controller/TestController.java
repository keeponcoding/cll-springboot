package com.cll.springboot.controller;

import com.cll.springboot.domain.People;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author cll
 * @Date 2020-01-06 20:30
 * @Version 1.0
 **/
@RestController
public class TestController {

    @GetMapping("json")
    public People json(){
        return new People("张三",null, "123456", new Date());
    }

    @GetMapping("/{gradeId}/{classId}") // 路径参数
    public Object get(@PathVariable String gradeId, @PathVariable String classId){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("gradeId",gradeId);
        map.put("classId",classId);
        return map;
    }

    @GetMapping("/query")
    public Object query(int from, int size){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("from",from);
        map.put("size",size);
        return map;
    }

    @GetMapping("/query2")
    public Object query2(@RequestParam(defaultValue = "10", name = "page") int from, int size){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("from",from);
        map.put("size",size);
        return map;
    }

    @GetMapping("/header") // 头信息
    public Object header(@RequestHeader("token") String token, int id){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("token",token);
        map.put("id",id);
        return map;
    }
}

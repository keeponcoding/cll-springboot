package com.cll.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloSB
 * @Description 测试类
 * @Author cll
 * @Date 2020-01-05 10:02
 * @Version 1.0
 **/
@RestController
@Controller
public class HelloSB {

    @RequestMapping("hello")
    public String hello(){
        return "hello devtools";
    }

}

package com.cll.springboot.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName SchedulerTest
 * @Description TODO
 * @Author cll
 * @Date 2020-01-06 22:31
 * @Version 1.0
 **/
@Component
public class SchedulerTest {

    @Scheduled(fixedRate = 2000)
    public void test(){
        System.out.println("当前时间："+ new Date());
    }

}

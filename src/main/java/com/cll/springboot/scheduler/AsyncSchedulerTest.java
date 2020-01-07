package com.cll.springboot.scheduler;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @ClassName AsyncSchedulerTest
 * @Description TODO
 * @Author cll
 * @Date 2020-01-06 22:39
 * @Version 1.0
 **/
@Component
@Async // 开启异步
public class AsyncSchedulerTest {

    public void step1() throws Exception{
        Long start = System.currentTimeMillis();
        Thread.sleep(1000);
        System.out.println("step1:" + (System.currentTimeMillis()-start));
    }

    public void step2() throws Exception{
        Long start = System.currentTimeMillis();
        Thread.sleep(2000);
        System.out.println("step2:" + (System.currentTimeMillis()-start));
    }

    public void step3() throws Exception{
        Long start = System.currentTimeMillis();
        Thread.sleep(3000);
        System.out.println("step3:" + (System.currentTimeMillis()-start));
    }

    // 获取异步结果
    public Future<String> step4() throws Exception{
        Long start = System.currentTimeMillis();
        Thread.sleep(4000);
        System.out.println("step4:" + (System.currentTimeMillis()-start));
        return new AsyncResult<>("step4");
    }
}

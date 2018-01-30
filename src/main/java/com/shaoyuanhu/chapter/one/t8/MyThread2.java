package com.shaoyuanhu.chapter.one.t8;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: ShaoYuanHu
 * @Description: sleep()方法的作用是在指定的时间内，让当前线程休眠，sleep方法不会释放所资源
 * @Date: Create in 2018-01-29 11:07
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        try {
            long start = System.currentTimeMillis();
            System.out.println("run threadName --- " + this.currentThread().getName() + " --- begin --- " + start);
            //sleep()方法的作用是在指定的时间内，让当前线程休眠，sleep方法不会释放所资源
            Thread.sleep(2000);
            long end = System.currentTimeMillis();
            System.out.println("run threadName --- " + this.currentThread().getName() + " --- end --- " + end);
            System.out.println("run threadName 耗时 --- " + (end - start));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

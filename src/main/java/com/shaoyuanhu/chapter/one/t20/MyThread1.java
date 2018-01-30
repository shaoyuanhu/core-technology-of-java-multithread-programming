package com.shaoyuanhu.chapter.one.t20;

import java.util.Random;

/**
 * @Author: ShaoYuanHu
 * @Description: 线程的优先级具有随机性，也就是优先级高的线程并不一定每次都先执行完。
 * @Date: Create in 2018-01-30 10:00
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int j = 0; j < 1000; j++) {
            Random random = new Random();
            random.nextInt();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("MyThread1 use time = " + (endTime-beginTime));
    }
}

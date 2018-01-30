package com.shaoyuanhu.chapter.one.t19;

import java.util.Random;

/**
 * @Author: ShaoYuanHu
 * @Description: 线程的优先级具有一定的规则性，也就是cpu会尽量将资源让给优先级比较高的线程。
 * @Date: Create in 2018-01-30 10:00
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50000; j++) {
                Random random = new Random();
                random.nextInt();
                addResult += j;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("MyThread2 use time = " + (endTime-beginTime));
    }
}

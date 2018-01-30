package com.shaoyuanhu.chapter.one.t17;

/**
 * @Author: ShaoYuanHu
 * @Description: yield()方法的作用是放弃当前的cpu资源，将它让给其他的任务去竞争。但是放弃的时间不确定，可能刚刚放弃，又再次获取cpu时间片。
 * @Date: Create in 2018-01-29 17:56
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 50000000; i++) {
            Thread.yield();
            count += i + 1;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时 " + (endTime-beginTime) + " 毫秒。");
    }
}

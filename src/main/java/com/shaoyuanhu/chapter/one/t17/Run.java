package com.shaoyuanhu.chapter.one.t17;

/**
 * @Author: ShaoYuanHu
 * @Description: yield()方法的作用是放弃当前的cpu资源，将它让给其他的任务去竞争。但是放弃的时间不确定，可能刚刚放弃，又再次获取cpu时间片。
 * @Date: Create in 2018-01-29 18:00
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

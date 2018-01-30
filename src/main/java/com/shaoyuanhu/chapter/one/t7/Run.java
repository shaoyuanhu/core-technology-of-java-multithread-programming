package com.shaoyuanhu.chapter.one.t7;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: ShaoYuanHu
 * @Description: isAlive()方法，功能是判断当前的线程是否处于活动状态，活动状态就是线程已经启动且尚未终止；
 * @Date: Create in 2018-01-23 18:25
 */
public class Run {
    /**
     * isAlive()方法，功能是判断当前的线程是否处于活动状态，活动状态就是线程已经启动且尚未终止；
     * 线程处于正在运行或者准备开始运行的状态，就认为线程是存活的
     */
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("begin="+myThread.isAlive());
        myThread.start();
        //此时打印的值是不确定的，因为线程调度的随机性，不确定此时run方法是否已运行完毕，如果未运行完毕，为true，否则为false
//        Thread.sleep(1000);
        System.out.println("end="+myThread.isAlive());

    }
}

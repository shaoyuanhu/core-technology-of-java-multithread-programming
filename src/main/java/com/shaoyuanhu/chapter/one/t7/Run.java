package com.shaoyuanhu.chapter.one.t7;

/**
 * @Author: ShaoYuanHu
 * @Description:
 * @Date: Create in 2018-01-23 18:25
 */
public class Run {
    /**
     * isAlive()方法，功能是判断当前的线程是否处于活动状态，活动状态就是线程已经启动且尚未终止；
     * 线程处于正在运行或者准备开始运行的状态，就认为线程是存活的
     */
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("begin="+myThread.isAlive());
        myThread.start();
        System.out.println("end="+myThread.isAlive());
    }
}

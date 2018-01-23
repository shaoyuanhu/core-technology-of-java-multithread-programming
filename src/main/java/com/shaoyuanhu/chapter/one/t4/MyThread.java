package com.shaoyuanhu.chapter.one.t4;

/**
 * @Author: ShaoYuanHu
 * @Description: 通过继承Thread类创建线程，因为java是单继承的，所以这种方法有局限性
 * @Date: Create in 2018-01-23 16:58
 */
public class MyThread extends Thread {
    private int count = 5;

    /**
     * 在一些JVM实现中，i--操作要分成3步
     * 1、获取i现在的值
     * 2、计算i-1后的值
     * 3、将第二步计算出的值，赋值给i变量
     * 如果有多个线程同时访问，很可能出现非线程安全问题(非线程安全主要是指多个线程对同一个对象中的同一个实例变量进行操作时，会出现值被更改、值不同步的情况，进而影响程序的执行流程，出现未知的结果。)
     * 如果在run方法上加上synchronized关键字，表示该方法是需要同步的，多个线程会排队执行
     */
    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("由"+Thread.currentThread().getName()+"计算，count="+count);
    }

}

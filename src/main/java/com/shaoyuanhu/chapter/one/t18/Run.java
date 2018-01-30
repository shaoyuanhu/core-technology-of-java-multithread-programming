package com.shaoyuanhu.chapter.one.t18;

/**
 * @Author: ShaoYuanHu
 * @Description: java中，线程的优先级具有继承性，比如A线程启动了B线程，那么B线程的优先级与A一致。
 * @Date: Create in 2018-01-30 09:53
 */
public class Run {

    public static void main(String[] args) {
        System.out.println("main thread begin priority = " + Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority = " + Thread.currentThread().getPriority());
        //这里main线程优先级默认为5，而myThread1线程未自己设定优先级的话，他的优先级将继承main。
        MyThread1 myThread1 = new MyThread1();
//        myThread1.setPriority(8);
        myThread1.start();

    }

}

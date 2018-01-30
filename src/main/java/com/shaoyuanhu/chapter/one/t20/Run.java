package com.shaoyuanhu.chapter.one.t20;

/**
 * @Author: ShaoYuanHu
 * @Description: 线程的优先级具有随机性，也就是优先级高的线程并不一定每次都先执行完。
 * @Date: Create in 2018-01-30 10:16
 */
public class Run {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 myThread1 = new MyThread1();
            myThread1.setPriority(5);
            myThread1.start();
            MyThread2 myThread2 = new MyThread2();
            myThread2.setPriority(6);
            myThread2.start();
        }
    }

}

package com.shaoyuanhu.chapter.one.t19;

/**
 * @Author: ShaoYuanHu
 * @Description: 线程的优先级具有一定的规则性，也就是cpu会尽量将资源让给优先级比较高的线程。
 * @Date: Create in 2018-01-30 10:16
 */
public class Run {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread1 myThread1 = new MyThread1();
            myThread1.setPriority(1);
            myThread1.start();
            MyThread2 myThread2 = new MyThread2();
            myThread2.setPriority(10);
            myThread2.start();
        }
    }

}

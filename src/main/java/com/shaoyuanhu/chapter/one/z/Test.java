package com.shaoyuanhu.chapter.one.z;

/**
 * @Author: ShaoYuanHu
 * @Description: 测试MyThread2
 * @Date: Create in 2018-01-23 17:08
 */
public class Test {

    public static void main(String[] args) {
        randomThread();
    }

    /**
     * 同时创建10个MyThread2线程，顺序调用start方法，结果是无序的，从而表现出CPU执行哪个线程具有不确定性
     */
    private static void randomThread() {
        MyThread t01 = new MyThread(1);
        MyThread t02 = new MyThread(2);
        MyThread t03 = new MyThread(3);
        MyThread t04 = new MyThread(4);
        MyThread t05 = new MyThread(5);
        MyThread t06 = new MyThread(6);
        MyThread t07 = new MyThread(7);
        MyThread t08 = new MyThread(8);
        MyThread t09 = new MyThread(9);
        MyThread t10 = new MyThread(10);
        MyThread t11 = new MyThread(11);
        t01.start();
        t02.start();
        t03.start();
        t04.start();
        t05.start();
        t06.start();
        t07.start();
        t08.start();
        t09.start();
        t10.start();
        t11.start();
    }

}

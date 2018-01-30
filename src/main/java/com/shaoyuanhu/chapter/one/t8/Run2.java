package com.shaoyuanhu.chapter.one.t8;

/**
 * @Author: ShaoYuanHu
 * @Description:
 * @Date: Create in 2018-01-29 11:35
 */
public class Run2 {

    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        long start = System.currentTimeMillis();
        System.out.println("begin --- " + start);
        myThread2.start();
        long end = System.currentTimeMillis();
        System.out.println("end --- " + end);
        System.out.println("耗时 --- " + (end - start));
    }
}

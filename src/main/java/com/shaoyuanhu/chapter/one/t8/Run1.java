package com.shaoyuanhu.chapter.one.t8;

/**
 * @Author: ShaoYuanHu
 * @Description:
 * @Date: Create in 2018-01-29 11:35
 */
public class Run1 {

    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        long start = System.currentTimeMillis();
        System.out.println("begin --- " + start);
        myThread1.run();
        long end = System.currentTimeMillis();
        System.out.println("end --- " + end);
        System.out.println("耗时 --- " + (end - start));
    }
}

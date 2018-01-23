package com.shaoyuanhu.chapter.one.mainThread;

/**
 * @Author: ShaoYuanHu
 * @Description: Java多线程编程核心技术 第一章
 * @Date: Create in 2018-01-23 16:54
 */
public class Test {

    public static void main(String[] args) {
        //打印当前线程的线程名称，这里打印主线程main
        System.out.println(Thread.currentThread().getName());
    }

}

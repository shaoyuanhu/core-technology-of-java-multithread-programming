package com.shaoyuanhu.chapter.one.t6;

/**
 * @Author: ShaoYuanHu
 * @Description:
 * @Date: Create in 2018-01-23 18:12
 */
public class MyThread extends Thread {

    public MyThread(){
        System.out.println("MyThread构造方法："+Thread.currentThread().getName());
    }

    @Override
    public void run(){
        System.out.println("run方法："+Thread.currentThread().getName());
    }

}

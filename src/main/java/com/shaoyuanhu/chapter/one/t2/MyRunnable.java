package com.shaoyuanhu.chapter.one.t2;

/**
 * @Author: ShaoYuanHu
 * @Description: 通过实现Runnable接口创建线程，java支持多实现，所以这种方法比较好，并且Thread类也实现了Runnable接口
 * @Date: Create in 2018-01-23 17:19
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("this is MyRunnable");
    }
}

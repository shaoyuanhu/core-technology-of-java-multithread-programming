package com.shaoyuanhu.chapter.one.t2;

/**
 * @Author: ShaoYuanHu
 * @Description: 测试MyRunnable
 * @Date: Create in 2018-01-23 17:29
 */
public class Run {

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println("运行结束");
    }

}

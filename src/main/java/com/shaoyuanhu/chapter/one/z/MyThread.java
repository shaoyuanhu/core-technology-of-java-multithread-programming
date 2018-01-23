package com.shaoyuanhu.chapter.one.z;

/**
 * @Author: ShaoYuanHu
 * @Description: 通过继承Thread类创建线程，表现线程的随机性
 * @Date: Create in 2018-01-23 16:58
 */
public class MyThread extends Thread {
    private int num;

    public MyThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println(num);
    }

}

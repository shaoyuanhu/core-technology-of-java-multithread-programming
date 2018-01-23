package com.shaoyuanhu.chapter.one.t3;

/**
 * @Author: ShaoYuanHu
 * @Description: 通过继承Thread类创建线程，因为java是单继承的，所以这种方法有局限性
 * @Date: Create in 2018-01-23 16:58
 */
public class MyThread extends Thread {
    private int count = 5;

    public MyThread(String name){
        this.setName(name);
    }

    @Override
    synchronized public void run() {
        super.run();
        while (count>0){
            count--;
            System.out.println("由"+Thread.currentThread().getName()+"计算，count="+count);
        }
    }

}

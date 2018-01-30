package com.shaoyuanhu.chapter.one.t7;

/**
 * @Author: ShaoYuanHu
 * @Description: isAlive()方法，功能是判断当前的线程是否处于活动状态，活动状态就是线程已经启动且尚未终止；
 * @Date: Create in 2018-01-23 18:24
 */
public class MyThread extends Thread {

    /**
     * isAlive()方法，功能是判断当前的线程是否处于活动状态
     */
    @Override
    public void run(){
        System.out.println("run="+this.isAlive());
    }


}

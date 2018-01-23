package com.shaoyuanhu.chapter.one.currentThreadExt;

/**
 * @Author: ShaoYuanHu
 * @Description:
 * @Date: Create in 2018-01-23 18:17
 */
public class CountOperate extends Thread {

    public CountOperate(){
        System.out.println("CountOperate method ==== begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("CountOperate method ==== end");
    }

    @Override
    public void run(){
        System.out.println("run method ==== begin");
        System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
        System.out.println("this.getName()="+this.getName());
        System.out.println("run method ==== end");
    }


}

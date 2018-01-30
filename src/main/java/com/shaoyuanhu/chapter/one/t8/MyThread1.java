package com.shaoyuanhu.chapter.one.t8;

/**
 * @Author: ShaoYuanHu
 * @Description: sleep()方法的作用是在指定的时间内，让当前线程休眠，sleep方法不会释放所资源
 * @Date: Create in 2018-01-29 11:07
 */
public class MyThread1 extends Thread {

    /**
     * sleep()方法的作用是在指定的时间内，让当前线程休眠，sleep方法不会释放所资源
     */
    @Override
    public void run() {
        try {
            System.out.println("run threadName --- " + this.currentThread().getName() + " --- begin");
            //sleep()方法的作用是在指定的时间内，让当前线程休眠，sleep方法不会释放所资源
            Thread.sleep(2000);
            System.out.println("run threadName --- " + this.currentThread().getName() + " --- end");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

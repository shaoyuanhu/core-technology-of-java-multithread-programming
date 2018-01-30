package com.shaoyuanhu.chapter.one.t18;

/**
 * @Author: ShaoYuanHu
 * @Description: java中，线程的优先级具有继承性，比如A线程启动了B线程，那么B线程的优先级与A一致。
 * @Date: Create in 2018-01-30 09:52
 */
public class MyThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread1 run priority = " + this.getPriority());
        //这里myThread2线程未自己设置优先级，所以他的优先级与MyThread1的优先级一致。
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }
}

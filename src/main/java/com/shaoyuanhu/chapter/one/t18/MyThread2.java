package com.shaoyuanhu.chapter.one.t18;

/**
 * @Author: ShaoYuanHu
 * @Description: java中，线程的优先级具有继承性，比如A线程启动了B线程，那么B线程的优先级与A一致。
 * @Date: Create in 2018-01-30 09:52
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread2 run priority = " + this.getPriority());
    }
}

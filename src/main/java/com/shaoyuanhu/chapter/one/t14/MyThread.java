package com.shaoyuanhu.chapter.one.t14;

/**
 * @Author: ShaoYuanHu
 * @Description: 使用interrupt()方法停止正在休眠的线程，会清除中断状态标记，并抛出异常java.lang.InterruptedException: sleep interrupted
 * @Date: Create in 2018-01-29 16:30
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("run method begin");

            Thread.sleep(200000);
            System.out.println("run method end");
        } catch (InterruptedException e) {
            System.out.println("在休眠状态被中断，进入catch代码块！ --- " + this.isInterrupted());
            e.printStackTrace();
        }
    }
}

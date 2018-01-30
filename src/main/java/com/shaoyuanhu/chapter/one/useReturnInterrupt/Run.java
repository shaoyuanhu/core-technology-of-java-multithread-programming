package com.shaoyuanhu.chapter.one.useReturnInterrupt;

/**
 * @Author: ShaoYuanHu
 * @Description: 使用interrupt()方法和return配合实现停止线程的效果。
 * @Date: Create in 2018-01-29 17:16
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

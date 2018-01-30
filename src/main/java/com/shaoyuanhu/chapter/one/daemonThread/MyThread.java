package com.shaoyuanhu.chapter.one.daemonThread;

/**
 * @Author: ShaoYuanHu
 * @Description:
 * @Date: Create in 2018-01-30 14:17
 */
public class MyThread extends Thread {

    private int i = 0;

    /**
     * java中线程分为两种，一种是用户线程，一种是守护线程。
     * 守护线程是一种特殊的线程，他的特殊有陪伴的意义，当进程中不存在非守护线程时，则守护线程自动销毁。
     * 典型的守护线程就是垃圾回收线程，当进程中没有非守护线程了，则垃圾回收线程也就没有存在的必要了，自动销毁。
     * Deamon的作用是为其他线程的运行提供便利服务，守护线程最典型的应用就是GC，他是一个很称职的守护者。
     */
    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i = " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

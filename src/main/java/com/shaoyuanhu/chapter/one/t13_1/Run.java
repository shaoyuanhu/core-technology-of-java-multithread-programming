package com.shaoyuanhu.chapter.one.t13_1;

/**
 * @Author: ShaoYuanHu
 * @Description: 使用interrupt()方法停止线程。
 * @Date: Create in 2018-01-29 15:41
 */
public class Run {
    /**
     * interrupted()方法是静态的。
     * interrupted()方法，功能是测试当前线程是否已经中断，当前线程是指运行该方法的线程。
     * interrupted()方法除了测试当前线程是否已中断，还会清除当前线程的中断状态标记。
     * @param args
     */
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
        }catch (Exception e){
            System.out.println("main catch ");
            e.printStackTrace();
        }
        System.out.println("end!!!!!!!");
    }
}

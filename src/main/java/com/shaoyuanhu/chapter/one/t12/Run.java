package com.shaoyuanhu.chapter.one.t12;

/**
 * @Author: ShaoYuanHu
 * @Description: interrupted()方法获取线程中断状态
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
            Thread.sleep(1000);
            myThread.interrupt();
            //这里myThread.interrupted()是由main线程运行的，所以返回的是main线程是否中断的结果，显然，main线程从未中断。
            System.out.println("线程是否停止？ --- " + myThread.interrupted());
            System.out.println("线程是否停止？ --- " + myThread.interrupted());
        }catch (Exception e){
            System.out.println("main catch ");
            e.printStackTrace();
        }
        System.out.println("end!!!!!!!");
    }
}

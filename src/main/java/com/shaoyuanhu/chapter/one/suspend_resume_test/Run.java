package com.shaoyuanhu.chapter.one.suspend_resume_test;

/**
 * @Author: ShaoYuanHu
 * @Description: suspend()方法可以暂停线程，resume()方法可以重新启动暂停的线程。但不建议使用，都已被废弃。
 * @Date: Create in 2018-01-29 17:23
 */
public class Run {

    /**
     * suspend暂停方法不会释放锁资源。
     * @param args
     */
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(5000);

            myThread.suspend();
            System.out.println("A= " + System.currentTimeMillis() + " i= " + myThread.getI());
            Thread.sleep(5000);
            System.out.println("A= " + System.currentTimeMillis() + " i= " + myThread.getI());

            myThread.resume();
            Thread.sleep(5000);

            myThread.suspend();
            System.out.println("B= " + System.currentTimeMillis() + " i= " + myThread.getI());
            Thread.sleep(5000);
            System.out.println("B= " + System.currentTimeMillis() + " i= " + myThread.getI());

            myThread.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

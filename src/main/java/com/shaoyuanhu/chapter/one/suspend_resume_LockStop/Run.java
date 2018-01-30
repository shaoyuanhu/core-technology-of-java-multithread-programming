package com.shaoyuanhu.chapter.one.suspend_resume_LockStop;

/**
 * @Author: ShaoYuanHu
 * @Description:
 * @Date: Create in 2018-01-29 17:42
 */
public class Run {

    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.suspend();
            /**
             * println方法内部实现是一个同步代码块，当程序运行到该同步代码块内部时，suspend停止了，同步锁不会被释放，则其他所有打印都将等待锁。
             */
            System.out.println("main end!!!!!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

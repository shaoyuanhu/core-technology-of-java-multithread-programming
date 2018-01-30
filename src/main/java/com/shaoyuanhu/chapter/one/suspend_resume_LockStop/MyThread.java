package com.shaoyuanhu.chapter.one.suspend_resume_LockStop;

/**
 * @Author: ShaoYuanHu
 * @Description:
 * @Date: Create in 2018-01-29 17:41
 */
public class MyThread extends Thread {

    private long i = 0;

    /**
     * println方法内部实现是一个同步代码块，当程序运行到该同步代码块内部时，suspend停止了，同步锁不会被释放，则其他所有打印都将等待锁。
     */
    @Override
    public void run() {
        while (true) {
            i++;
            System.out.println(i);
        }
    }
}

package com.shaoyuanhu.chapter.one.suspend_resume_test;

/**
 * @Author: ShaoYuanHu
 * @Description:
 * @Date: Create in 2018-01-29 17:22
 */
public class MyThread extends Thread {
    private long i = 0;

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }
}

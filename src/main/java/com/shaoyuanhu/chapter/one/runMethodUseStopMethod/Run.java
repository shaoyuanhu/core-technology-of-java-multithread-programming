package com.shaoyuanhu.chapter.one.runMethodUseStopMethod;

/**
 * @Author: ShaoYuanHu
 * @Description: 调用stop()方法会抛出java.lang.ThreadDeath错误，但通常情况下，此错误不需要显式地捕捉。
 * @Date: Create in 2018-01-29 16:53
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}

package com.shaoyuanhu.chapter.one.useStopMethodThreadTest;

/**
 * @Author: ShaoYuanHu
 * @Description: 使用stop()方法暴力停止线程，该方法已被废弃，不建议使用。
 * @Date: Create in 2018-01-29 16:46
 */
public class Run {
    /**
     * 使用stop()方法暴力停止线程的可能造成的问题：
     *      1、强制停止线程可能造成一些释放资源的操作得不到执行。
     *      2、对锁定的对象进行了解锁，可能导致数据得不到同步处理，出现数据不一致。示例在stopThrowLock
     * 调用stop()方法会抛出java.lang.ThreadDeath错误，但通常情况下，此错误不需要显式地捕捉。
     * @param args
     */
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(8000);
            myThread.stop();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}

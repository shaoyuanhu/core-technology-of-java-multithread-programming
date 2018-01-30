package com.shaoyuanhu.chapter.one.stopThrowLock;

/**
 * @Author: ShaoYuanHu
 * @Description: 使用stop()方法暴力停止线程，对锁定的对象进行了解锁，导致数据得不到同步处理，出现数据不一致。
 * @Date: Create in 2018-01-29 17:03
 */
public class MyThread extends Thread {

    private SynchronizedObject object;

    public MyThread(SynchronizedObject object) {
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b","bb");
    }
}

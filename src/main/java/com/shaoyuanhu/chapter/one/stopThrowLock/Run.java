package com.shaoyuanhu.chapter.one.stopThrowLock;

/**
 * @Author: ShaoYuanHu
 * @Description: 使用stop()方法暴力停止线程，对锁定的对象进行了解锁，导致数据得不到同步处理，出现数据不一致。
 * @Date: Create in 2018-01-29 17:05
 */
public class Run {
    public static void main(String[] args) {
        try {
            SynchronizedObject object = new SynchronizedObject();
            MyThread myThread = new MyThread(object);
            myThread.start();
            Thread.sleep(500);
//            myThread.stop();
            System.out.println(object.getUsername() + " -- " + object.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

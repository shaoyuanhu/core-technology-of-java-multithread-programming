package com.shaoyuanhu.chapter.one.t1;

/**
 * @Author: ShaoYuanHu
 * @Description: 通过继承Thread类创建线程，因为java是单继承的，所以这种方法有局限性
 * @Date: Create in 2018-01-23 16:58
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("this is MyThread");
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        /**
         * start方法不能重复调用，否则会抛出异常java.lang.IllegalThreadStateException
         * 调用线程的start方法，只是让线程处于准备运行状态，并不一定会立即执行，什么时候执行，取决于CPU
         * 因此，两条打印语句执行的先后顺序是随机的
         */
        myThread.start();
        System.out.println("main method 运行结束");
    }
}

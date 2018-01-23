package com.shaoyuanhu.chapter.one.sameNum;

/**
 * @Author: ShaoYuanHu
 * @Description: 测试MyThread
 * @Date: Create in 2018-01-23 17:33
 */
public class Run {

    public static void main(String[] args) {
        shardVariable();
    }

    /**
     * 创建1个线程对象，将这个MyThread对象作为参数传递给五个Thread的构造，并分配不通的线程名称
     * 因为只有一个MyThread对象，所以count变量对5个Thread线程是共享的
     */
    private static void shardVariable() {
        MyThread thread = new MyThread();

        Thread a = new Thread(thread,"A");
        Thread b = new Thread(thread,"B");
        Thread c = new Thread(thread,"C");
        Thread d = new Thread(thread,"D");
        Thread e = new Thread(thread,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }

}

package com.shaoyuanhu.chapter.one.t3;

/**
 * @Author: ShaoYuanHu
 * @Description: 测试MyThread
 * @Date: Create in 2018-01-23 17:33
 */
public class Run {

    public static void main(String[] args) {
        unShardVariable();
    }

    /**
     * 创建5个线程对象，每个对象都有自己的count变量，所以变量的不共享的
     */
    private static void unShardVariable() {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");
        a.start();
        b.start();
        c.start();
    }

}

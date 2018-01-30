package com.shaoyuanhu.chapter.one.runThread;

/**
 * @Author: ShaoYuanHu
 * @Description: getId()方法的作用是取的线程的唯一标识。
 * @Date: Create in 2018-01-29 15:01
 */
public class Test {

    /**
     * getId()方法的作用是取的线程的唯一标识。
     * @param args
     */
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + " --- " + thread.getId());
    }
}

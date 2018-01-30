package com.shaoyuanhu.chapter.one.suspend_resume_deal_lock;

/**
 * @Author: ShaoYuanHu
 * @Description:
 * @Date: Create in 2018-01-29 17:01
 */
public class SynchronizedObject {

    synchronized public void printString(){
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("a线程永远被暂停suspend了");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}

package com.shaoyuanhu.chapter.one.isaliveOtherTest;

/**
 * @Author: ShaoYuanHu
 * @Description:
 * @Date: Create in 2018-01-29 10:54
 */
public class Run {
    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        Thread thread = new Thread(countOperate);
        System.out.println("main begin thread isAlive --- " + thread.isAlive());
        thread.setName("AAA");
        thread.start();
        System.out.println("main end thread isAlive --- " + thread.isAlive());
    }
}

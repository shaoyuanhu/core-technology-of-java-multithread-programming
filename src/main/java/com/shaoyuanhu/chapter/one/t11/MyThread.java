package com.shaoyuanhu.chapter.one.t11;

/**
 * @Author: ShaoYuanHu
 * @Description:
 * @Date: Create in 2018-01-29 15:07
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 500000; i++) {
            System.out.println("i = " + (i+1));
        }
    }
}

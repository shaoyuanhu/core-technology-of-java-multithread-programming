package com.shaoyuanhu.chapter.one.useStopMethodThreadTest;

/**
 * @Author: ShaoYuanHu
 * @Description: 使用stop()方法暴力停止线程，该方法已被废弃，不建议使用。
 * @Date: Create in 2018-01-29 16:44
 */
public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i = " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

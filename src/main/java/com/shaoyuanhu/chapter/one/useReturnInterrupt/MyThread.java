package com.shaoyuanhu.chapter.one.useReturnInterrupt;

/**
 * @Author: ShaoYuanHu
 * @Description: 使用interrupt()方法和return配合实现停止线程的效果。
 * @Date: Create in 2018-01-29 17:15
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                if (this.isInterrupted()) {
                    System.out.println("线程已中断");
                    return;
                }
                System.out.println("time = " + System.currentTimeMillis());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

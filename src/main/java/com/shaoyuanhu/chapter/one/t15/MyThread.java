package com.shaoyuanhu.chapter.one.t15;

/**
 * @Author: ShaoYuanHu
 * @Description: 使用interrupt()方法停止后，调用sleep()方法，会清除中断状态标记，并抛出异常java.lang.InterruptedException: sleep interrupted
 * @Date: Create in 2018-01-29 16:30
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("run method begin");
            for (int i = 0; i < 100000; i++) {
                System.out.println("i = " + (i+1));
            }
            Thread.sleep(200000);
            System.out.println("run method end");
        } catch (InterruptedException e) {
            System.out.println("先中断，再遇到sleep，进入catch代码块！ --- " + this.isInterrupted());
            e.printStackTrace();
        }
    }
}

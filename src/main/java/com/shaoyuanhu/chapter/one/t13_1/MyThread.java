package com.shaoyuanhu.chapter.one.t13_1;

/**
 * @Author: ShaoYuanHu
 * @Description: 使用interrupt()方法停止线程。
 * @Date: Create in 2018-01-29 16:06
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 500000; i++) {
                /**
                 * 这里使用this.interrupted()获取当前线程的中断状态，如果已中断，退出for循环。
                 * 问题：如果for循环后还有代码，那么当前线程只是退出了for循环，线程会继续运行下面的代码，并不会停止。
                 * 解决方法：
                 *      1、可以通过将break改为return来解决。
                 *      2、还可以使用抛出异常的方法实现。比如throw new InterruptedException();
                 * 如果需要将线程停止的事件得到传播，那么只能使用抛异常的方式。
                 */
                if (this.interrupted()){
                    System.out.println("该线程已经是停止状态了，退出运行！！！");
                    throw new InterruptedException();
                }
                System.out.println("i = " + (i+1));
            }
            System.out.println("中断上面的for循环后输出。。。。");
        } catch (Exception e) {
            System.out.println("进入MyThread类的run方法的catch代码块了！！！！！！！");
            e.printStackTrace();
        }
    }
}

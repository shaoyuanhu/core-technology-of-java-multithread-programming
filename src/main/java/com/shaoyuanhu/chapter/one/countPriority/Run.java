package com.shaoyuanhu.chapter.one.countPriority;

/**
 * @Author: ShaoYuanHu
 * @Description: 优先级高的线程运行的更快
 * @Date: Create in 2018-01-30 14:09
 */
public class Run {

    public static void main(String[] args) {
        try {
            ThreadA threadA = new ThreadA();
            threadA.setPriority(Thread.NORM_PRIORITY-3);
            threadA.start();

            ThreadB threadB = new ThreadB();
            threadB.setPriority(Thread.NORM_PRIORITY+3);
            threadB.start();

            Thread.sleep(20000);
            threadA.stop();
            threadB.stop();

            System.out.println("a = " + threadA.getCount());
            System.out.println("b = " + threadB.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

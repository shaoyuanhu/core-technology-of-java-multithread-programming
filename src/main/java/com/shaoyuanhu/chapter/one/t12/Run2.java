package com.shaoyuanhu.chapter.one.t12;

/**
 * @Author: ShaoYuanHu
 * @Description:
 * @Date: Create in 2018-01-29 15:53
 */
public class Run2 {
    /**
     * interrupted()方法是静态的。
     * interrupted()方法，功能是测试当前线程是否已经中断，当前线程是指运行该方法的线程。
     * interrupted()方法除了测试当前线程是否已中断，还会清除当前线程的中断状态标记。
     * @param args
     */
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        /**
         * 这里Thread.interrupted()是由main方法运行的，而main方法由于Thread.currentThread().interrupt();的执行，已经处于中断状态。
         * 所以第一次调用interrupted()方法，返回为true。
         * 由于第一次调用interrupted()方法时清除了main线程的中断状态，所以第二次调用时，返回false。
         */
        System.out.println("线程是否停止？ --- " + Thread.interrupted());
        //第一次调用清除了main的中断状态，如果这里再次调用interrupt()方法，那么下面的interrupted()方法还是会返回true。
//        Thread.currentThread().interrupt();
        System.out.println("线程是否停止？ --- " + Thread.interrupted());
        System.out.println("end!!!!");
    }
}

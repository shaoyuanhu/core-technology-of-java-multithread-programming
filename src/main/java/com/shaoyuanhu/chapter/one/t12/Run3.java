package com.shaoyuanhu.chapter.one.t12;

/**
 * @Author: ShaoYuanHu
 * @Description: isInterrupted()方法获取线程中断状态
 * @Date: Create in 2018-01-29 16:00
 */
public class Run3 {
    /**
     * isInterrupted()方法是非静态的。
     * isInterrupted()方法的作用是测试Thread对象线程是否已经是中断状态，但是不会清除中断状态标记。
     * @param args
     */
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
            /**
             * 这里myThread.isInterrupted()是测试myThread对象线程的中断状态，因为上面执行了myThread.interrupt()，并且isInterrupted()方法不会清除中断状态标记，所以这里两次都返回true。
             */
            System.out.println("线程是否停止？ --- " + myThread.isInterrupted());
            System.out.println("线程是否停止？ --- " + myThread.isInterrupted());
        }catch (Exception e){
            System.out.println("main catch ");
            e.printStackTrace();
        }
        System.out.println("end!!!!!!!");
    }
}

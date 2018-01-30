package com.shaoyuanhu.chapter.one.t11;

/**
 * @Author: ShaoYuanHu
 * @Description:
 * @Date: Create in 2018-01-29 15:34
 */
public class Run {

    /**
     * 调用interrupt()并不会立刻停止正在运行的线程，该方法仅仅是在当前线程中打了一个停止的标记。
     * @param args
     */
    public static void main(String[] args) {
        try {
            MyThread myThread = new MyThread();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();
            System.out.println("调用了interrupt()");
            myThread.interrupt();
            System.out.println("调用了interrupt()");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

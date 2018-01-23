package com.shaoyuanhu.chapter.one.randomThread;

/**
 * @Author: ShaoYuanHu
 * @Description: 测试MyThread
 * @Date: Create in 2018-01-23 17:08
 */
public class Test {

    public static void main(String[] args) {
        randomThread();
    }

    /**
     * 利用sleep方法和随机数，使线程挂起随机时间，从而表现出CPU执行哪个线程具有不确定性
     */
    private static void randomThread() {
        try {
            MyThread myThread = new MyThread();
            myThread.setName("myThread");
            myThread.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName());
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

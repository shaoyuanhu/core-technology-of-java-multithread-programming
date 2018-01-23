package com.shaoyuanhu.chapter.one.randomThread;

/**
 * @Author: ShaoYuanHu
 * @Description: 通过继承Thread类创建线程，表现线程的随机性
 * @Date: Create in 2018-01-23 16:58
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random()*1000);
                Thread.sleep(time);
                System.out.println("run="+Thread.currentThread().getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

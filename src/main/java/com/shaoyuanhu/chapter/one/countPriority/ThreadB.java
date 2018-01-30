package com.shaoyuanhu.chapter.one.countPriority;

/**
 * @Author: ShaoYuanHu
 * @Description: 优先级高的线程运行的更快
 * @Date: Create in 2018-01-30 14:07
 */
public class ThreadB extends Thread {

    private int count = 0;

    public int getCount(){
        return count;
    }

    @Override
    public void run() {
        while (true) {
            count++;
        }
    }
}

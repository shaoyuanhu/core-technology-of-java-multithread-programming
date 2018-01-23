package com.shaoyuanhu.chapter.one.t6;

/**
 * @Author: ShaoYuanHu
 * @Description:
 * @Date: Create in 2018-01-23 18:13
 */
public class Run2 {

    public static void main(String[] args) {
        //main调用MyThread的构造方法
        MyThread myThread = new MyThread();
        //main调用MyThread的start方法后，执行run方法的是myThread自己，不是main
        myThread.start();
        //main直接调用MyThread的run方法
//        myThread.run();
    }

}

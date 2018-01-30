package com.shaoyuanhu.chapter.one.isaliveOtherTest;

/**
 * @Author: ShaoYuanHu
 * @Description:
 * @Date: Create in 2018-01-29 10:50
 */
public class CountOperate extends Thread {

    public CountOperate (){
        System.out.println("CountOperate --- begin");
        System.out.println("Thread.currentThread().getName() --- " + Thread.currentThread().getName());
        //调用CountOperate构造的线程此时是isAlive的，所以为true
        System.out.println("Thread.currentThread().isAlive() --- " + Thread.currentThread().isAlive());
        /*System.out.println("this.currentThread().getName() --- " + this.currentThread().getName());
        //调用CountOperate构造的线程此时是isAlive的，所以为true
        System.out.println("this.currentThread().isAlive() --- " + this.currentThread().isAlive());*/
        System.out.println("this.getName() --- " + this.getName());
        //这里this代表CountOperate对象线程本身，构造时并没有start，所以为false
        System.out.println("this.isAlive() --- " + this.isAlive());
        System.out.println("CountOperate --- end");
    }

    @Override
    public void run(){
        System.out.println("run --- begin");
        System.out.println("Thread.currentThread().getName() --- " + Thread.currentThread().getName());
        //执行CountOperate对象线程的线程此时是isAlive的，所以为true
        System.out.println("Thread.currentThread().isAlive() --- " + Thread.currentThread().isAlive());
        /*System.out.println("this.currentThread().getName() --- " + this.currentThread().getName());
        //调用CountOperate构造的线程此时是isAlive的，所以为true
        System.out.println("this.currentThread().isAlive() --- " + this.currentThread().isAlive());*/
        System.out.println("this.getName() --- " + this.getName());
        //这里this代表CountOperate对象线程本身，如果是CountOperate对象自己调用start，则这里为true，如果是将CountOperate对象交给其他线程去执行，则CountOperate对象线程本身不是活跃的，这里是false
        System.out.println("this.isAlive() --- " + this.isAlive());
        System.out.println("run --- end");
    }

}

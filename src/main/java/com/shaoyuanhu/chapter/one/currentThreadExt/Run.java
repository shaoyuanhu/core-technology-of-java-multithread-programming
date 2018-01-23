package com.shaoyuanhu.chapter.one.currentThreadExt;

/**
 * @Author: ShaoYuanHu
 * @Description:
 * @Date: Create in 2018-01-23 18:19
 */
public class Run {

    /**
     * new CountOperate()执行时，当前线程是main，this线程是CountOperate线程自己
     * thread.start()执行后，run方法执行时，当前线程是AAA线程，this线程是CountOperate线程自己
     */
    public static void main(String[] args) {
        CountOperate countOperate = new CountOperate();
        Thread thread = new Thread(countOperate);
        thread.setName("AAA");
        thread.start();
    }

}

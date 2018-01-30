package com.shaoyuanhu.chapter.one.suspend_resume_nosameValue;

/**
 * @Author: ShaoYuanHu
 * @Description: 使用suspend和resume方法时也容易出现因为线程暂停而导致数据不同步的情况。
 * @Date: Create in 2018-01-29 17:51
 */
public class Run {
    public static void main(String[] args) {
        try {
            final MyObject object = new MyObject();
            Thread t1 = new Thread() {
                @Override
                public void run() {
                    object.setValue("a", "aa");
                }
            };
            t1.setName("a");
            t1.start();
            Thread.sleep(500);

            Thread t2 = new Thread() {
                @Override
                public void run() {
                    object.print();
                }
            };
            t2.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

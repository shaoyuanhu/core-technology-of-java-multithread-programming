package com.shaoyuanhu.chapter.one.suspend_resume_deal_lock;

/**
 * @Author: ShaoYuanHu
 * @Description: 使用suspend和resume方法时，如果使用不当，极易造成公共的同步对象的独占，使得其他线程无法访问公共同步对象。
 * @Date: Create in 2018-01-29 17:34
 */
public class Run {
    /**
     * suspend暂停方法不会释放锁资源。
     * @param args
     */
    public static void main(String[] args) {
        try {
            final SynchronizedObject object = new SynchronizedObject();
            Thread t1 = new Thread() {
                @Override
                public void run() {
                    object.printString();
                }
            };
            t1.setName("a");
            t1.start();
            Thread.sleep(1000);

            Thread t2 = new Thread() {
                @Override
                public void run() {
                    System.out.println("t2线程启动了，但是进入不了printString()方法。");
                    System.out.println("因为printString()方法被a线程锁定并且永远的suspend暂停了。");
                    object.printString();
                }
            };
            t2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

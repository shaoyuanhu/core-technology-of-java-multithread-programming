package com.shaoyuanhu.chapter.one.suspend_resume_nosameValue;

/**
 * @Author: ShaoYuanHu
 * @Description: 使用suspend和resume方法时也容易出现因为线程暂停而导致数据不同步的情况。
 * @Date: Create in 2018-01-29 17:49
 */
public class MyObject {

    private String username = "1";
    private String password = "11";

    public void setValue(String username, String password) {
        this.username = username;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("停止a线程");
            Thread.currentThread().suspend();
        }
        this.password = password;
    }

    public void print(){
        System.out.println(username + " --- " + password);
    }

}

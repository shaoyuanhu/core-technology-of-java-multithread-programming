package com.shaoyuanhu.chapter.one.stopThrowLock;

/**
 * @Author: ShaoYuanHu
 * @Description: 使用stop()方法暴力停止线程，对锁定的对象进行了解锁，导致数据得不到同步处理，出现数据不一致。
 * @Date: Create in 2018-01-29 17:01
 */
public class SynchronizedObject {

    private String username = "a";
    private String password = "aa";

    synchronized public void printString(String username, String password){
        try {
            this.username = username;
            Thread.sleep(100000);
            this.password = password;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

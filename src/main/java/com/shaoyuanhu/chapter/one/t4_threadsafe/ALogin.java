package com.shaoyuanhu.chapter.one.t4_threadsafe;

/**
 * @Author: ShaoYuanHu
 * @Description: A登录类
 * @Date: Create in 2018-01-23 17:59
 */
public class ALogin extends Thread{

    @Override
    public void run(){
        LoginServlet.doPost("a","aa");
    }

}

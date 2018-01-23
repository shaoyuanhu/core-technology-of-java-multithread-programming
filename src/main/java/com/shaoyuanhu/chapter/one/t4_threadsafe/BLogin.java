package com.shaoyuanhu.chapter.one.t4_threadsafe;

/**
 * @Author: ShaoYuanHu
 * @Description: B登录类
 * @Date: Create in 2018-01-23 17:59
 */
public class BLogin extends Thread{

    @Override
    public void run(){
        LoginServlet.doPost("b","bb");
    }

}

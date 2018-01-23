package com.shaoyuanhu.chapter.one.t4_threadsafe;

/**
 * @Author: ShaoYuanHu
 * @Description: 测试运行类
 * @Date: Create in 2018-01-23 18:01
 */
public class Run {

    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }

}

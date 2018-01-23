package com.shaoyuanhu.chapter.one.t4_threadsafe;

/**
 * @Author: ShaoYuanHu
 * @Description: 模拟一个servlet组件
 * @Date: Create in 2018-01-23 17:56
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;

    /**
     * a线程执行完给usernameRef=a赋值，然后睡眠，这时b线程执行usernameRef=b、passwordRef=bb赋值并打印
     * 5秒后，a线程继续执行passwordRef=aa，这时usernameRef=b，所以打印结果并不是a的用户名。
     * 如果使用synchronized关键字，可以保证线程顺序执行，但是效率低下
     * @param username
     * @param password
     */
    synchronized public static void doPost(String username, String password){
        try {
            usernameRef = username;
            if (username.equals("a")){
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username="+usernameRef+", password="+password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }



}

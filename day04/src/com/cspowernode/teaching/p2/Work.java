package com.cspowernode.teaching.p2;

import java.util.Scanner;

/**
 * @author 汪洋
 * @Date 2023/3/7 14:37
 * @Description
 */
public class Work {
    public static void main(String[] args) {
        work1();
        work2();
    }

    private static void work2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        System.out.println((year%4==0&&year%100!=0||year%400==0)?"是闰年":"不是闰年");
    }

    private static void work1() {
        //1.定义一个用户名和密码作为已经注册好的信息
        String localUsername = "root";
        String localPassword = "root123";
        //2.构建Scanner用来输入用户名和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String inputUsername = sc.next();
        System.out.println("请输入密码：");
        String inputPassword = sc.next();
        //3.进行判定
        if(localUsername.equals(inputUsername)&&localPassword.equals(inputPassword)){
            System.out.println("登录成功");
        }else{
            System.out.println("用户名或密码不正确");
        }
    }
}

package com.cspowernode.practice;

import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/8 14:16
 * @Description
 */
public class Test4 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("输入一个1到1000数:");
        int n = sc.nextInt();*/

        work1();
        work2();
        //work3();

    }

    private static void work2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个年份：");
        int year = sc.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println(year+"年是闰年");
        }
        else{
            System.out.println(year+"年不是闰年");
        }
    }

    private static void work1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名：");
        String ID = sc.next();
        System.out.println("输入密码：");
        String paswrd = sc.next();
        String userID = "abcdefg";
        String Password = "123456";
        if (userID.equals(ID) && paswrd.equals(Password)){
            System.out.println("登陆成功!");
        }
        else {
            System.out.println("用户名或密码错误");
        }
    }
}

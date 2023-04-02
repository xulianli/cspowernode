package com.cspowernode.practice;

/**
 * @Author 徐联理
 * @Date 2023/3/8 14:10
 * @Description
 */
public class Practice {
    public static void main (String [] args){
        System.out.println("\tHelloWorld!");
        System.out.println("\t主\t菜\t单");
        System.out.println("\t1.注册");
        System.out.println("\t2.登录");
        System.out.println("\t3.帮助信息");
        System.out.println("请选择:");
        int a = 12;
        System.out.println("MAX VALUE="+a);
//        System.out.println("MAX VALUE="+a);
        int i=987;
        System.out.println("hundred="+i/100);
        System.out.println("ten="+(i-(i/100)*100)/10);
        System.out.println("one="+((i-(i/100)*100)-((i-(i/100)*100)/10)*10));
        int num=5;
        num=++num;
        System.out.println(num);
        System.out.println(1+1);
    }
}

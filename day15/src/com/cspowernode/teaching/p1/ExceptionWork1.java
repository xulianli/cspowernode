package com.cspowernode.teaching.p1;

import java.util.Scanner;

/**
 * @Author 汪洋
 * @Date 2023/3/23 16:07
 * @Description
 * 写一个方法void isTriangle(int a,int b,int c)，判断三个参数是否能构成一个三角形，
 * 如果不能则抛出异常IllegalArgumentException，显示异常信息 “a,b,c不能构成三角形”，
 * 如果可以构成则显示三角形三个边长，在主方法中得到命令行输入的三个整数，调用此方法，并捕获异常
 */
public class ExceptionWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三角形的三个边：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        try {
            isTriangle(a,b,c);
        }catch (Exception e) {
            System.out.println(e.toString());
            return;
        }
        System.out.println("三角形的三个边边长分别是："+a+","+b+","+c);
    }

    private static void isTriangle(int a,int b,int c){
        if(a+b<c||a+c<b||b+c<a){
            throw new IllegalArgumentException("a,b,c不能构成三角形");
        }
    }

}

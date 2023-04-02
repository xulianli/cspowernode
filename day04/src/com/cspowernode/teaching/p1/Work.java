package com.cspowernode.teaching.p1;

/**
 * @author 汪洋
 * @Date 2023/3/7 11:29
 * @Description
 */
public class Work {
    public static void main(String[] args) {
//        work1();
        work2();
    }

    private static void work2() {
        int num1 = 30;
        int num2 = 40;
        int num3 = 5;
        System.out.println((num1>num2?num1:num2)+"大");
        System.out.println(Math.max(num1,num2)+"大");
        System.out.println(num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3)+"大");
        System.out.println(Math.max(num1,Math.max(num2,num3)));
    }

    private static void work1() {
        int num = 3;
        System.out.println(num%2==0?num+"是偶数":num+"是奇数");
    }
}

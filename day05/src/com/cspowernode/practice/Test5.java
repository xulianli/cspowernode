package com.cspowernode.practice;

import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/8 15:56
 * @Description
 * 1、输出1到1000之间既能被5整除又能被3整除的数，并且每行输出5个
 * 2、输入一个正整数n，如果该n是偶数的话，那么计算1-2+3-4+5-6+…+(n-1)-n的和，如果n是奇数的话，
 * 那么计算1-2+3-4+5-6+…-(n-1)+n的和
 * 3、输入一个正整数n，计算1+2+3+…+n的和
 */
public class Test5 {
    public static void main(String[] args) {
        work1();
        work2();
        work3();
    }

    private static void work3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个正整数：");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=0;i<=n;i++){
            sum += i;
        }
        System.out.println("sum="+sum);
    }

    private static void work2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个正整数：");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1;i<=n;i++){
            sum= i%2==0? sum-i:sum+i;
        }
        System.out.println("sum="+sum);
        System.out.println();
    }

    private static void work1() {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(i + "\t");
                //用count计数
                count++;
                //记到5个数后另起一行
                if (count % 5 == 0)
                    System.out.println();
            }
        }
        System.out.println();
    }
}

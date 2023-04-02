package com.cspowernode.teaching.p3;

/**
 * @Author 汪洋
 * @Date 2023/3/25 14:56
 * @Description
 * 1.把阶乘使用递归来书写
 * 2.把阶乘和使用递归来书写
 */
public class RecursionWork {
    public static void main(String[] args) {
        int n = 20;
        long result = factorial(n);
        System.out.println(n+"的阶乘是："+result);
        result = factorialSum(n);
        System.out.println(n+"的阶乘和是："+result);
    }

    private static long factorialSum(int n) {
        if(n==1){
            return 1;
        }
        return factorial(n)+factorialSum(n-1);
    }

    private static long factorial(int n) {
        if(n==1){
            return 1;
        }
        return factorial(n-1)*n;
    }
}

package com.cspowernode.practice;

/**
 * @Author 徐联理
 * @Date 2023/3/25 14:30
 * @Description
 */
public class RecursionDemo {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(factorial(n));
        System.out.println(factorialSum(n));
    }

    private static long factorialSum(int n) {
        if (n == 1){
            return 1;
        }
        return factorial(n)+factorialSum(n-1);
    }

    private static long factorial(int num) {
        if (num == 1){
            return 1;
        }else{
            return factorial(num-1)*num;
        }
    }
}

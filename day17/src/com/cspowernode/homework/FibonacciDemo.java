package com.cspowernode.homework;


/**
 * @Author 徐联理
 * @Date 2023/3/25 14:54
 * @Description
 * 假如有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，请问第n个月后的兔子有多少对？
 */
public class FibonacciDemo {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(f(n));
    }

    private static long f(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }
        return f(num-1)+f(num-2);
    }
}

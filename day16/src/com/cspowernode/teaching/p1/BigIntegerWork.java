package com.cspowernode.teaching.p1;

import java.math.BigInteger;

/**
 * @Author 汪洋
 * @Date 2023/3/24 10:35
 * @Description
 * 21的阶乘和
 */
public class BigIntegerWork {
    public static void main(String[] args) {
        int num = 21;
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= num; i++) {
            sum = sum.add(factorial(i));
        }
        System.out.println(sum);
    }
    public static BigInteger factorial(int num){
        BigInteger sum = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        return sum;
    }
}

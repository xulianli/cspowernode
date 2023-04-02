package com.cspowernode.practice;

import java.math.BigInteger;

/**
 * @Author 徐联理
 * @Date 2023/3/24 10:18
 * @Description
 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= 21; i++) {
            sum = sum.add(product(i)) ;
        }
        System.out.println(sum);
    }

    private static BigInteger product(int num){
        BigInteger product = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            product = product.multiply(BigInteger.valueOf(i));
        }
        return product;
    }
}

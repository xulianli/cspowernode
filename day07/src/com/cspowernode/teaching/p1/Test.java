package com.cspowernode.teaching.p1;

import java.util.Random;

/**
 * @Author 汪洋
 * @Date 2023/3/11 9:12
 * @Description
 * 需求：创建5个随机数，然后来判断这5个随机数是否是质数
 * 问题：我们发现如果使用传统的方式来解决这类问题，代码会出现冗余，如果上面不是5个随机数，而是50个随机数呢？
 * 那么我们的代码将会书写的非常的难看，那么有没有解决方案--->数组
 * 数组能够解决的场景的前提：
 *  1.多个数据
 *  2.数据类型要相同
 *  3.处理这些数据的逻辑要一样
 */
public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt();
        int num2 = random.nextInt();
        int num3 = random.nextInt();
        int num4 = random.nextInt();
        int num5 = random.nextInt();
        System.out.println(isPrime(num1)?num1+"是质数":num1+"不是质数");
        System.out.println(isPrime(num2)?num2+"是质数":num2+"不是质数");
        System.out.println(isPrime(num3)?num3+"是质数":num3+"不是质数");
        System.out.println(isPrime(num4)?num4+"是质数":num4+"不是质数");
        System.out.println(isPrime(num5)?num5+"是质数":num5+"不是质数");
    }
    /**
     * 判断指定的数字是否是质数
     * @param num 任意一个整数
     * @return 如果是质数返回true，否则返回false
     */
    public static boolean isPrime(int num){
        if(num==1||num==2){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}

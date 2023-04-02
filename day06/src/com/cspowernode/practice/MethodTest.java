package com.cspowernode.practice;

import org.junit.Test;
import sun.text.resources.cldr.es.FormatData_es_419;

import java.util.concurrent.ForkJoinPool;

/**
 * @Author 徐联理
 * @Date 2023/3/10 14:39
 * @Description
 * 1.定义一个求指定范围内偶数的方法，通过传递参数来求1-参数值范围内的所有偶数，然后把这些偶数输出出来；
 * 2.把嵌套循环中的第一个图形，使用方法的形式来定义行数和列数，通过调用传递的参数来展示不同的行数和列数的图形；
 * 3.把之前判断一个数字是否是质数的案例改成方法：
 * 	public static boolean isPrime(int num){}
 * 4.把第三题改完之后，在判断1-100内有哪些质数，使用上面的方法来做这个题；
 * 5.定义三个重载方法，分别用来求两个整数、三个整数、四个整数的最大值
 * 6.首先定义一个方法，用来打印九九乘法表；然后重载该方法，增加一个打印任意行数的九九乘法表的方法
 *
 */
public class MethodTest {
    @Test
    public void test(){
        evenNumber(20);
        rectangle(5,8);
        isPrime(4);
        findPrime();
        isShuiXianHua(152);
        maxValue(4,5);
        maxValue(5,10,8);
        maxValue(5,1,8,3);
        multiTable(9);
    }


    private void multiTable(int num) {
        for (int i = 1; i <=num; i++) {
                System.out.print(num+"*"+i+"="+i*num+"\t");
        }
    }

    public void maxValue(int a, int b) {
        System.out.println(a>b?a:b+"最大");
    }

    public void maxValue(int a, int b, int c) {
        System.out.println(a>b? (a>c? a+"最大":c+"最大"):b>c? b+"最大":c+"最大");
    }

    public void maxValue(int a, int b, int c, int d) {
        int tempMax = a>b? (a>c? a:c):b>c? b:c;
        System.out.println(tempMax>d? tempMax+"最大":d+"最大");
    }

    public boolean isShuiXianHua(int num) {
        if (num<100 || num>=1000)
            throw new IllegalArgumentException("只能输入3位数"+num);
        return  Math.pow(num/100,3) + Math.pow(num/10%10,3) + Math.pow(num%10,3)==num;
    }

    public void findPrime() {
        for (int i = 2; i <=100 ; i++) {
            if (isPrime(i))
                System.out.print(i+" ");
        }
    }

    public void evenNumber(int num){
        System.out.print("1-"+num+"范围内偶数有：");
        for (int i = 1; i <= num; i++) {
            System.out.print(i%2==0?i:" ");
        }
        System.out.println();
    }

    public void rectangle(int a, int b){
        for (int i=0; i<a; i++){
            for(int j=0;j<b;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int num) {
        if (num==1 || num==2)
            return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

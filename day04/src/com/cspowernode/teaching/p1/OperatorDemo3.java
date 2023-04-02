package com.cspowernode.teaching.p1;

/**
 * @author 汪洋
 * @Date 2023/3/7 9:58
 * @Description
 * 拓展赋值运算符的使用
 * 1.什么是拓展赋值运算符
 *  就是把赋值运算符和算术运算符结合在一起的运算符，比如a = a+1-->a += 1
 * 2.拓展赋值运算符的局限性
 *  一定是已经定义好的某个变量要来进行其他的算术运算操作，并且操作完成之后，是把值重新赋予给
 *  该变量，这种场景才能使用该拓展赋值运算符
 * 3.拓展赋值运算符的作用
 *  a、简化操作
 *  b、帮你自动完成类型转换
 */
public class OperatorDemo3 {
    public static void main(String[] args) {
        //1.拓展赋值运算符的基本使用
        int a = 10;
        int b = 5;
        a = a + 10;
        a = a - 10;
        a = a * b;
        a = a / b;
        a = a % b;
        //变成拓展赋值运算符
        a += 10;
        a -= 10;
        a *= b;
        a /= b;
        a %= b;
        //2.帮我们来完成类型转换
        byte a1 = 10;
        //原本我们要这样写
        a1 = (byte) (a1 + 1);
        //使用拓展赋值运算符之后，可以这样写
        a1 += 1;
        //面试题
//        int sum += 30;
//        int sum; sum+=30;
    }
}

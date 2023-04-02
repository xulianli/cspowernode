package com.cspowernode.teaching.p1;

/**
 * @Author 汪洋
 * @Date 2023/3/17 15:21
 * @Description
 * 代码块的使用
 * 1.代码块其实就是在类中书写一个大括号，大括号里面可以写方法里面能写的所有逻辑；
 * 2.代码块有哪些特点：
 *  a.一个类中可以定义0个或多个代码块，它们的执行顺序就是自上而下执行；
 *  b.代码块中既可以定义变量也可以调用外部的属性和方法；
 *  c.代码块调用外部的资源允许直接调用静态及非静态资源；
 *  d.代码块的加载时间跟着属性顺序完成加载,所以代码块是不需要额外调用的，并且每次类实例化
 *  一次，它里面的所有代码块都会执行一次；
 * 3.因为代码块的很多功能和构造函数重叠了，所以我们一般都不使用代码块，真有这个需求，宁可直接
 * 去修改构造函数即可，那么代码块也称之为构造代码块；
 */
public class CodeBlockDemo {
    public static void main(String[] args) {
        CodeBlock cb1 = new CodeBlock();
        CodeBlock cb2 = new CodeBlock();
    }
}
class CodeBlock{
    int a = 10;
    static int b = 20;
    public void test1(){ }
    public static void test2(){}
    //代码块
    {
        int b = 100;
        int c = a;
        test1();
        System.out.println("这是第一个代码块");
    }
    {
        System.out.println(b);
        test2();
        System.out.println("这是第二个代码块");
    }
    int c = 100;
}

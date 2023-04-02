package com.cspowernode.teaching.p4;

/**
 * @author 汪洋
 * @Date 2023/3/6 16:27
 * @Description
 * 运算符的使用--->算术运算符
 * 1.算术运算符在Java中分为两类
 *  a、一元算术运算符--->只有一个操作数
 *  b、二元算术运算符
 * 2.一元运算符的使用
 *  a、一元运算符只能对变量进行操作
 *  b、一元运算符包括++和--两个，分别代表为该操作数进行加1和减1操作
 *  c、一元运算符中的符号在变量前面和在变量后面它的使用是不一样的
 *      ①.在前面：运行到这行代码的时候，不关心代码在干什么，先完成加加或者减减操作再执行其他事情；
 *      ②.在后面：运行到这行代码的时候，不看当前的++和--，本行代码该如何操作就如何操作，下一行开始
 *      为该变量进行加加或者减减；
 * 3.二元运算符的使用
 *  a、包含：+、-、*、/、%
 *  b、二元运算符如果两个操作数不是相同的类型，那么它们的结果会往大类型偏，如果最大的类型都小于int
 *  那么结果就会默认为是int
 *  c、+号比较特殊的地方就是能进行字符串的拼接
 *  d、-和*这两个符号没有任何特殊的地方
 *  e、/号的使用，注意如果除号前面的数字小于后面的数字的话，结果是0，然后注意异常的出现；
 *  f、%号的使用
 *      ①.如果%前面的数字小于后面的数字，结果永恒等于前面的数字，并且带负号
 *      ②.不管%前面的数字是多少，结果永恒等于[0,后面的数字-1],所以这个特点可以用在轮流做某件事情
 *      的逻辑上；
 *  g、/和%用在对10的倍数进行操作的时候它们可以完成去尾数和取尾数的操作
 *      比如：12345/10--->1234,12345%10-->5
 */
public class OperatorDemo1 {
    public static void main(String[] args) {
        //1.一元运算符的使用
        //1.1.一元运算符只能用在变量上
        int a = 10;
        System.out.println(++a);
//        System.out.println(10++);
        //1.2.写在前面
        a = 10;
//        System.out.println(++a);
        System.out.println(5*--a);
        //1.3.写在后面
        a = 10;
//        System.out.println(a++);
//        System.out.println(a);
        System.out.println(5*a--);
        System.out.println(a);
        //面试题
        int x = 10;
        x = x++;
        System.out.println(x);
        //2.算术运算符的类型问题
        byte k = 10;
//        k = k+10;
        //面试题
        System.out.println(100000L*100000*100000);
        System.out.println(100000*100000*100000);
        //3./和%的使用
        //3.1./的使用
        System.out.println(1/2);//0
        System.out.println(-5/2);//-2
//        System.out.println(1/0);//ArithmeticException
        System.out.println(1.0/0);
        //3.2.%的使用
        System.out.println(0%3);//0
        System.out.println(1%3);//1
        System.out.println(2%3);//2
        System.out.println(3%3);//0
        System.out.println(4%3);//0
        System.out.println(5%3);//0
        System.out.println(6%3);//0
        System.out.println(7%3);//0
        System.out.println(8%3);//0
        System.out.println(9%3);//0
    }
}

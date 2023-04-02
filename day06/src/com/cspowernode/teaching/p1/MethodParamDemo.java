package com.cspowernode.teaching.p1;

/**
 * @Author 汪洋
 * @Date 2023/3/10 16:43
 * @Description
 * 方法的参数列表
 * 1.方法的参数列表里面代表的是接收外部的数据，所以我们把参数分为两个类型
 *  a.调用方法时传递的参数--->实参
 *  b.定义方法时参数列表上的参数--->形参
 * 2.形参和实参的注意事项
 *  a.两者的变量名不要求一致，甚至实参可以不要变量名而是直接给值也可以
 *  b.形参的类型一定要大于或等于实参的类型，你可以想象形参就是等号左边的声明，实参的值就是
 *  等号右边的赋值
 *  c.Java中调用方法是严格要求方法中参数的个数和类型要匹配的
 *  d.当形参是基本数据类型的时候，在方法里面对其的任何修改不影响原始实参的值；
 */
public class MethodParamDemo {
    public static void main(String[] args) {
        //在调用方法时传递过去的参数我们称之为实参
        int c = 10;
        int d = 20;
        long result = add(c,30);
        System.out.println(result);
        changeData(c,d);
        System.out.println(c);
        System.out.println(d);
    }
    //方法的参数列表上声明的变量叫形参
    public static long add(int a,long b){//long b = 30;
        return a+b;
    }
    //当参数是基本数类型的时候，方法对其值的任何修改将无法影响原始数据
    public static void changeData(int a,int b){
        a++;
        b++;
    }
}

package com.cspowernode.teaching.p1;

/**
 * @Author 汪洋
 * @Date 2023/3/10 16:52
 * @Description
 * 方法的重载
 * 1.所谓方法的重载就是方法名相同而参数列表不相同的方法之间的一种称呼；
 * 2.方法重载有什么好处
 *  a.避免命名污染
 *  b.方便我们不同的参数都可以使用同类型的方法--->JVM会根据参数自动选择方法
 *  总结：开发者很蛋疼，使用者很舒服
 * 3.方法重载的注意事项
 *  a.方法重载跟修饰词、返回类型无关
 *  b.所谓参数列表不相同它代表着参数的类型和参数的个数，跟参数的名称没有任何关系
 */
public class MethodOverloadDemo {
    public static void main(String[] args) {

    }
    public static int add(int a){
        return a;
    }
    //这个方法和上面的方法的签名是一样的，所以不管前面的修饰词和返回类型怎么改都会识别为同一个方法，无法
    //形成重载
    /*private  double add(int a){
        return a;
    }*/
    private static double add(int a,int b){
        return a+b;
    }
    private static double add(long a,int b){
        return a+b;
    }
    private static double add(int a,long b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
}

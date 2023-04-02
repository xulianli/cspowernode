package com.cspowernode.teaching.p1;

import java.rmi.AlreadyBoundException;

/**
 * @Author 汪洋
 * @Date 2023/3/23 15:28
 * @Description
 * 自定义异常的使用
 * 1.为什么需要自定义异常
 *  因为jdk中的异常体系无法满足我们工作中业务里需要用到的错误，所以在很多时候，我们都需要
 *  单独为业务去定义一些异常出来；
 * 2.怎么定义自定义异常
 *  a.根据需求来确定你的异常是否需要让程序结束
 *      ①.如果想让程序结束，那么父类就是RuntimeException
 *      ②.如果想让异常发生之后来专门去做某件事情，那么父类就是Exception
 *  b.根据需求来确定你的异常名称，做到见名知意
 *  c.构建该异常类，继承指定的父类，然后构建有参和无参构造函数即可；
 *  注意：如果你的异常只有一种情况会发生，那么我们就可以直接在无参里面写明具体的错误信息即可；
 */
public class UserExceptionDemo {
    public static void main(String[] args) {
        double a = 2;
        double b = 1;
        double result = 0;
        try {
            result = operator(a,b);
        } catch (NumberRangeOutOf100Exception | NumberIsIllegalException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
    private static double operator(double a, double b) throws NumberRangeOutOf100Exception, NumberIsIllegalException {
        if(a==0){
            throw new ArithmeticException("a不能为0");
        }
        if(b>100){
            throw new NumberRangeOutOf100Exception();
        }
        if(a==1||b==1){
            throw new NumberIsIllegalException("数字非法了-->"+(a==1?"a":"b"));
        }
        return b/a;
    }
}
//无参比较适合不需要传递信息的情况，只要发生这类异常，就是一种可能性
class NumberRangeOutOf100Exception extends Exception {
    public NumberRangeOutOf100Exception() {
        super("数字不能大于100");
    }
}
//有参比较适合需要传递一些不同的信息的情况，发生这种异常还需要告诉别人是哪里错了
class NumberIsIllegalException extends Exception {
    public NumberIsIllegalException(String info) {
        super(info);
    }
}
package com.cspowernode.teaching.p3;

/**
 * @Author 汪洋
 * @Date 2023/3/25 14:04
 * @Description
 * 递归的使用
 * 1.什么是递归
 *  a.描述一个事情要通过两个动作来完成，分别是递出去和归回来；
 *  b.描述一个方法在某个时间下自己调用自己直到某个条件满足时再一步一步的往回执行
 *  c.其实比较像数学中的数学归纳法
 * 2.数学中的数学归纳法
 *  1+2+...+5=?--->f(n) = f(n-1)+n,并且f(1)=1;
 *  f(5) = f(4) +5
 *         f(4) = f(3) + 4
 *                f(3) = f(2) +3
 *                       f(2) = f(1) + 2
 *                              f(1) = 1
 * 3.递归的缺陷
 *  a.不能递归太深，否则还没拿到结果归回来就已经栈溢出了
 *  b.一定要写判断返回的条件，否则也会发生栈溢出
 * 4.递归和普通的算法的区别
 *  a.算法消耗时间其实是差不多的
 *  b.简化了代码的流程
 */
public class RecursionDemo {
    public static void main(String[] args) {
        int n = 5;
        int result = f(n);
        System.out.println(result);
    }
    //问：return到底是返回给main方法还是返回给它的调用者
    private static int f(int n) {
        if(n==1){
            return 1;
        }
        return f(n-1)+n;
    }

    //问：在main方法里调用test方法的时候，进入test方法之后，它又开始自己调用自己的test方法，那么在自己
    //调用自己的test方法之前，请问之前的main方法所调用的test方法执行完了吗
    private static void test() {
        test();
        System.out.println(123);
    }
}

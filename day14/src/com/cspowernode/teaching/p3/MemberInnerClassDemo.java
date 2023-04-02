package com.cspowernode.teaching.p3;

import java.sql.SQLOutput;
import java.util.HashMap;

/**
 * @Author 汪洋
 * @Date 2023/3/21 15:52
 * @Description
 * 内部类的介绍以及成员内部类的使用
 * 1.什么是内部类
 *  所谓内部类就是指定义在类内部的类；
 * 2.内部类的作用
 *  a.定义在类的内部
 *      ①.为了封装让其成为该类的专属成员：成员内部类
 *      ②.为了封装以及分门别类：静态内部类
 *  b.定义在类的方法内部
 *      ①.为了完成方法中的某个逻辑而构建的类，一般来说都是实现接口重写某个方法：局部内部类
 *      ②.针对局部内部类的优化，把类名省略掉：匿名内部类
 * 3.成员内部类的语法使用
 *  a.内部类里面不能定义静态资源
 *  b.内部类可以访问外部类中的所有资源
 *  c.外部类可以通过实例化来访问内部类中的所有资源
 *  d.其他类想访问内部类需要先实例化外部类，再通过该对象来实例化内部类然后才能使用
 * 4.成员内部类在日后工作中是否会用的到
 *  a.成员内部类在很多源码里面都有用到，我们可以通过阅读源码的形式来增加自己对成员内部类的理解
 *  然后再在后期编程中逐渐修改代码风格，加上成员内部类的使用；
 *  b.前期其实几乎用不到成员内部类，老师为了让某个实体类能够在不同类里面都使用，会偶尔用成员内部类
 *  来定义实体类；
 */
public class MemberInnerClassDemo {
    public static void main(String[] args) {
        //4.在其他类中是否能够访问内部类资源
        MemberInnerClass memberInnerClass = new MemberInnerClass();
        MemberInnerClass.InnerClass innerClass = memberInnerClass.new InnerClass();
        System.out.println(innerClass.c);
        innerClass.t3();
    }
}
class MemberInnerClass{
    int a = 10;
    static int b = 20;
    public void t1(){}
    public static void t2(){}
    class InnerClass{
        //1.看是否能定义普通资源和静态资源-->不能定义静态资源
        int c = 10;
//        static int d = 20;
        public void t3(){}
//        public static void t4(){}
        //2.看是否能够调用外部的资源-->可以调用
        public void test(){
            System.out.println(a);
            System.out.println(b);
            t1();
            t2();
        }
    }
    //3.看外部类是否能调用内部类里面的资源-->可以调用
    public void test(){
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.c);
        innerClass.t3();
    }
}

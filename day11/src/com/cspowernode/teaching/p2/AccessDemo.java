package com.cspowernode.teaching.p2;

import jdk.internal.dynalink.beans.StaticClass;

/**
 * @Author 汪洋
 * @Date 2023/3/17 16:05
 * @Description
 * 封装以及访问控制修饰符的基本理解及使用
 * 1.什么是封装
 *  所谓封装就是指隐藏内部的细节，然后对外提供一个访问的方式
 * 2.封装的具体体现有哪些
 *  a.方法--->封装了方法里面的具体实现逻辑，对外提供访问的方式以及告诉你怎么调用怎么返回
 *  b.类--->封装了里面的属性，对外提供get、set方法来访问里面的属性
 * 3.封装有什么好处
 *  a.安全
 *  b.复用
 *  c.可以不用知道里面的实现逻辑也能完成使用
 * 4.如何实现封装--->访问控制修饰符：从大到小
 *  a.public
 *  b.protected
 *  c.[default]
 *  d.private
 * 5.访问控制修饰符的访问范围：从大到小
 *  a.所有地方
 *  b.包之外但是拥有父子关系
 *  c.包内
 *  d.类内
 * 6.访问控制修饰符修饰类的话有如下特点：
 *  a.一个java文件中只允许出现一个被public修饰的class，并且该class的类名字要和java文件名一致；
 *  b.类只允许被public和default修饰
 */
public class AccessDemo {
    //分别使用四种访问控制修饰符来修饰了4个成员资源，然后再在不同的地方来访问这些资源
    private int a = 10;
    int b = 20;
    protected int c = 30;
    public int d = 40;

    //在类里面访问
    public void test(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        //测试是否能在跨包的情况下访问被default修饰的类
//        StaticClass sc = new StaticClass();
    }
}

package com.cspowernode.teaching.p2.access1;

import com.cspowernode.teaching.p2.AccessDemo;

/**
 * @Author 汪洋
 * @Date 2023/3/17 16:10
 * @Description
 * 该类的作用是来测试不在同一个包下访问AccessDemo里面的资源
 * 1.如果该类不去继承AccessDemo的话，那么只有public资源能够被访问
 * 2.如果该类去继承了AccessDemo的话，那么父类的所有资源子类不需要实例化就能够
 * 直接使用，此时protected资源是允许访问的
 */
public class AccessDemo2 extends AccessDemo{
    public void test(){
//        System.out.println(a);
//        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

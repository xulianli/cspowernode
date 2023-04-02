package com.cspowernode.teaching.p1;

/**
 * @Author 汪洋
 * @Date 2023/3/21 9:02
 * @Description
 * 单例设计模式
 * 1.程序架构的从大到小分类：架构设计(C/S、B/S)--->设计模式--->代码模型(惯用法)
 * 2.什么是设计模式
 *  所谓设计模式其实就是在满足高内聚、低耦合前提下所寻找到的一些适合某种编程场景的
 *  固有写法，现在流行的设计模式有26种
 * 3.我们已经接触过哪个设计模式：简单工厂
 * 4.单例设计模式的适应场合：某个类对象有且只允许出现一个的场景
 * 5.如何书写单例--->饿汉式
 *  a.构造函数私有化
 *  b.属性的位置创建当前类对象，并且私有并静态化
 *  c.在该类里面创建一个获取对象的静态方法，返回当前类对象
 * 6.如何书写单例--->懒汉式
 *  a.构造函数私有化
 *  b.属性的位置创建声明当前类对象，并且私有并静态化
 *  c.在该类里面创建一个获取对象的静态方法，判断该类是否存在对象，如果不存在则创建
 *  存在则返回
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1==s2);
    }
}
//懒汉式
class Singleton1{
    private static Singleton1 singleton;
    private Singleton1(){
    }
    public static Singleton1 getInstance() {
        if(singleton == null){
            singleton = new Singleton1();
        }
        return singleton;
    }
}
//饿汉式
class Singleton{
    private static Singleton singleton = new Singleton();
    private Singleton(){
    }
    public static Singleton getInstance() {
        return singleton;
    }
}

package com.cspowernode.teaching.p1;

/**
 * @Author 汪洋
 * @Date 2023/3/17 14:10
 * @Description
 * static修饰词的介绍
 * 1.static修饰词可以用来修饰全局变量、方法、类、代码块
 * 2.static修饰词有什么特点
 *  a.static属于类资源，它和class文件一起被加载-->有且只加载一次、加载时间和class文件一致、加载到方法区中
 *  的静态池中；
 *  b.static修饰的资源是同时允许通过对象.资源名以及类.资源名这两种方式进行访问的，但是官方推荐使用类名来访问
 * 3.static修饰的变量的特点
 *  a.数据共享，有且只加载一次；
 *  b.即可以通过对象来调用也可以通过类名来调用
 *  c.static通常配合public和final一起来修饰常量
 *  d.注意不能修饰局部变量
 * 4.static修饰的方法的特点
 *  a.static修饰的方法只能访问static修饰的资源，而非static修饰的方法则都可以访问
 *  -->因为static方法被加载的时候，普通的资源还没有被加载出来所以无法访问
 *  b.static修饰的方法也可以通过类名.方法名来访问，所以常常用来做工具方法，不需要单独实例化
 *  c.static修饰的方法里面不能使用this关键字
 */
public class StaticDemo {
    public static void main(String[] args) {
        //尝试理解静态资源有且只加载一次的特点
        StaticClass cla1 = new StaticClass();
        cla1.a = 10;
        StaticClass.b = 20;
        StaticClass cla2 = new StaticClass();
        cla2.a = 30;
        StaticClass.b = 40;
        System.out.println(cla1.a);//10
        System.out.println(StaticClass.b);//20,40
        System.out.println(cla2.a);//30
        System.out.println(StaticClass.b);//20,40
        //static无法修饰局部变量
//        static int x = 100;
        //直接用类名.方法名来访问静态资源
        StaticClass.t2();
    }
}
class StaticClass{
    int a;
    static int b;

    public void t1(){}
    public static void t2(){}

    public void access1(){
        System.out.println(a);
        System.out.println(b);
        t1();
        t2();
    }
    public static void access2(){
        //static修饰的方法里面不能有this关键字
//        this.t1();
//        System.out.println(a);
        System.out.println(b);
//        t1();
        t2();
    }
}

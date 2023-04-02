package com.cspowernode.teaching.p3;

/**
 * @Author 汪洋
 * @Date 2023/3/21 16:10
 * @Description
 * 静态内部类的使用
 * 1.什么是静态内部类
 *  所谓静态内部类就是指在成员内部类的基础上加上了static修饰词，让其具备了static
 *  的特性；
 *      a.可以在该内部类中定义静态资源；
 *      b.可以通过外部类类名.内部类类名来进行访问内部类的资源
 * 2.静态内部类在工作中的使用方式
 *  因为它里面的资源方便进行访问，所以我们一般在需要大规模定义各种常量的场合会使用静态内部类
 *  来对里面的各种常量进行分门别类，方便外部进行访问；
 */
public class StaticInnerClassDemo {
    public static void main(String[] args) {
        //4.在其他类中来调用静态内部类里面的资源
        System.out.println(StaticInnerClass.InnerClass.d);
        StaticInnerClass.InnerClass.t4();
        //5.访问通过静态内部类来归类的资源
        System.out.println(Const.Phone.APPLE_PHONE);
    }
}
class StaticInnerClass{
    int a = 10;
    static int b = 20;
    public void t1(){}
    public static void t2(){}
    static class InnerClass{
        //1.看是否能定义普通资源和静态资源-->都可以
        int c = 10;
        static int d = 20;
        public void t3(){}
        public static void t4(){}
        //2.看是否能够调用外部的资源-->不能调用外部的非静态资源
        public void test(){
//            System.out.println(a);
            System.out.println(b);
//            t1();
            t2();
        }
    }
    //3.看外部类是否能调用内部类里面的资源-->直接调用的话无法调用非静态资源，虽然可以通过实例化来解决，但是我们一般
    //都建议静态内部类里面只定义静态资源
    public void test(){
        System.out.println(InnerClass.d);
        InnerClass.t4();
    }
}

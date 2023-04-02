package com.cspowernode.teaching.p1;

/**
 * @Author 汪洋
 * @Date 2023/3/17 15:30
 * @Description
 * 静态代码块的使用
 * 1.static的特性+代码块的特性=静态代码块
 * 2.总结静态代码块的特性
 *  a.有且只加载一次；--->我们可以把很多资源的启动代码放在静态代码块中，然后设置为随着服务器启动而加载，这样
 *  的话，就不用我们手动调用启动代码了；
 *  b.跟静态方法一样，只能加载外部的静态资源，而无法加载非静态资源；
 *  c.不能使用this关键字
 * 3.静态代码块使用的场合
 *  因为它有不需要我们单独调用就能够执行的特点，所以经常用来进行资源的启动操作，比如数据库、Socket等等
 *  或者是文件中的数据要加载到内存中去
 */
public class StaticCodeBlockDemo {
    public static void main(String[] args) {
        StaticCodeBlock scb1 = new StaticCodeBlock();
        StaticCodeBlock scb2 = new StaticCodeBlock();
    }
}
class StaticCodeBlock{
    int a = 10;
    static int b = 20;
    public void test1(){}
    public static void test2(){}
    {
        System.out.println("我是代码块1");
    }
    {
        System.out.println("我是代码块2");
    }
    static{
//        this.a;
//        System.out.println(a);
        System.out.println(b);
//        test1();
        test2();
        System.out.println("静态代码块1被执行了");
    }
    static{
        System.out.println("静态代码块2被执行了");
    }
}

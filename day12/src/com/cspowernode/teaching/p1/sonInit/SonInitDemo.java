package com.cspowernode.teaching.p1.sonInit;

/**
 * @Author 汪洋
 * @Date 2023/3/18 10:29
 * @Description
 * 子类的实例化过程
 * 1.JVM先检测你要编译的类是否有extends关键字，如果有，那么一路往上寻找父类，直到找到Object类，然后
 * 从上到下来开始加载这些类的class文件到堆中生成class对象；--->递归加载
 * 2.从父类到子类通过字节码对象在堆中生成对象，并且继承关系的情况下，这些对象的地址值相同；
 * 3.进行父类的属性初始化，然后再调用父类的构造函数
 * 4.进行子类的属性初始化，然后再调用子类的构造函数
 */
public class SonInitDemo {
    public static void main(String[] args) {
        Son s1 = new Son();
        Son s2 = new Son();
    }
}
class GrandFather{
    static{
        System.out.println(1);
    }
    {System.out.println(2); }
    public GrandFather() {
        System.out.println(3);
    }
}
class Father extends GrandFather{
    static{
        System.out.println(4);
    }
    { System.out.println(5); }
    public Father() {
        System.out.println(6);
    }
}
class Son extends Father {
    static{
        System.out.println(7);
    }
    {System.out.println(8); }
    public Son() {
        System.out.println(9);
    }
}


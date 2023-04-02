package com.cspowernode.teaching.p1;

/**
 * @Author 汪洋
 * @Date 2023/3/18 10:37
 * @Description
 */
public class TestMain {
    public static void main(String args[]) {
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        System.out.println(mc1.cc == mc2.cc);//F
        System.out.println(mc1.ca == mc2.ca);//T
    }
}
class ClassA {
    static {
        System.out.println("1.In ClassA Static");
    }

    public ClassA() {
        System.out.println("2.ClassA()");
    }
}
class ClassB {
    static {
        System.out.println("4.In ClassB Static");
    }
    public ClassB() {
        System.out.println("6.9.ClassB()");
    }
}
class ClassC extends ClassB {
    static {
        System.out.println("5.In ClassC Static");
    }
    public ClassC() {
        System.out.println("7.10.ClassC()");
    }
}
class MyClass {
    static ClassA ca = new ClassA();
    ClassC cc = new ClassC();
    static {
        System.out.println("3.In Static MyClass");
    }
    public MyClass() {
        System.out.println("8.11.MyClass()");
    }
}

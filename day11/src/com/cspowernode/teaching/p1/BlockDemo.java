package com.cspowernode.teaching.p1;

/**
 * @Author 汪洋
 * @Date 2023/3/17 15:48
 * @Description
 */
class Student {
    static int num;
    static {
        System.out.println("a静态代码块执行 num:" + ++num);//a
    }
    {
        System.out.println("b构造代码块执行 num:" + ++num);//b
    }
    public Student() {
        System.out.println("c无参构造方法在执行 num:" + ++num);//c
    }
    public Student(int number) {
        this();
        System.out.println("d有参构造方法在执行 num:" + ++num);//d
    }
}
public class BlockDemo {
    public static void main(String[] args) {
        new Student(3);
        new Student();
    }
}

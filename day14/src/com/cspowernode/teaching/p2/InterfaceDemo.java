package com.cspowernode.teaching.p2;

/**
 * @Author 汪洋
 * @Date 2023/3/21 9:56
 * @Description
 * 接口的介绍
 * 1.什么是接口
 *  所谓接口就是一种特殊的抽象类，它比抽象类更加的抽象，它里面只拥有抽象方法和常量，它里面的所有变量
 *  都可以默认省略了public static final修饰词，它里面的所有方法都默认省略了public abstract修饰词;
 * 2.接口如何定义
 *  使用interface来修饰一个类名即可
 * 3.接口的一些特点
 *  a.接口的子类可以也是接口，使用extends即可，并且接口是Java中唯一一个可以多继承的特殊类；
 *  b.接口的子类如果是抽象类的话，那么要使用implements关键字，并且也可以同时实现多个父接口,
 *  它不强制要求重写父类的抽象方法，但是它的实现子类必须要重写所有父类中的未被重写过的抽象方法；
 *  c.接口的子类如果是实现类的话，那么也是使用implements关键字，也可以同时实现多个父接口，
 *  但是必须要强制重写所有父接口中的所有抽象方法
 *  d.接口是没有构造函数的，它也可以使用多态的形式来构建对象的类型
 *  e.从JDK1.8开始，接口里面允许出现静态方法和默认方法，从JDK1.9开始，允许出现私有方法
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        MyInterface1 obj1 = new MyClass();
        MyInterface2 obj2 = new MyClass();
    }
}
interface MyInterface1{
    //属性的写法和完整写法
    int a = 10;
    public static final int MAX_VALUE = 999;
    //方法的写法和完整写法
    void t1();
    public abstract void t2();
    //接口里面没有构造函数
//    public MyInterface1(){
//
//    }
    //JDK1.8之后出现的静态和默认方法
    public static void t5(){

    }
    public default void t6(){

    }
}
interface MyInterface2{
    void t3();
}
//1.接口的子类也是接口
interface MyInterface3 extends MyInterface1,MyInterface2{

}
//2.接口的子类是抽象类
abstract class AbstractClass implements MyInterface1,MyInterface2{
    public abstract void t4();
    public void t1(){
    }
}
//2.1.如果接口的子类是抽象类，在抽象类里面没有重写接口的所有抽象方法的话，那么该
//抽象类的实现类就必须要重写所有未被重写过的抽象方法
class AbstractClassSon extends AbstractClass {
    @Override
    public void t2() {
    }
    @Override
    public void t3() {
    }
    @Override
    public void t4() {
    }
}
//3.如果子类是实现类，那么必须重写所有父接口中的抽象方法
class MyClass implements MyInterface1,MyInterface2{
    @Override
    public void t1() {
    }
    @Override
    public void t2() {
    }
    @Override
    public void t3() {
    }
}


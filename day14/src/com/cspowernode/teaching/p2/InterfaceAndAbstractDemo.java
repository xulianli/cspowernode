package com.cspowernode.teaching.p2;

/**
 * @Author 汪洋
 * @Date 2023/3/21 10:13
 * @Description
 * 接口和抽象类的区别
 * 1.定义上的区别
 *  a.接口定义使用interface，子类实现接口使用implements，子接口继承父接口使用extends，可以多继承;
 *  b.抽象类定义使用abstract，子类继承父抽象类使用extends，并且不允许多继承；
 * 2.内部的区别
 *  a.接口里面只能存在抽象方法和常量，并且没有构造函数；
 *  b.抽象类里面允许出现所有其他类的资源以及抽象方法，并且它有构造函数；
 * 3.构建对象的区别
 *  这两者都无法直接构建对象，需要使用多态的形式来指向子类对象；
 * 4.使用场合的区别
 *  a.抽象类其实就是继承体系中的偏上层的类，因为有些方法无法具体化，但是设计的时候需要有该方法或者是
 *  多态需要有该方法，于是定义出来，它的其他方面其实和普通类没太大区别；
 *  b.接口其实更像是一个功能集合，不同的接口提供不同的功能，我们需要使用哪些功能就去实现某个接口，然后
 *  按照自己的逻辑来把该功能进行实现，它和继承体系是没有任何关系的；
 * 5.接口如何学习
 *  a.了解语法和抽象类的区别；
 *  b.知道如何定义接口和抽象类；
 *  c.掌握如何调用别人定义的接口来为你解决问题；
 */
public class InterfaceAndAbstractDemo {
}
interface Swim{
    void swimming();
}
interface Fly{
    void flying();
}
interface JavaTeacher{
    void studyJava();
}
abstract class Animal{
    public abstract void eat();
}
class Dog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("狗喜欢趴着吃东西");
    }
    @Override
    public void swimming() {
        System.out.println("狗会狗刨");
    }
}
class Bird extends Animal implements Fly{
    @Override
    public void eat() {
        System.out.println("鸟是站着吃东西");
    }

    @Override
    public void flying() {
        System.out.println("不是每个鸟都会飞");
    }
}
class Person implements Swim,Fly,JavaTeacher{
    @Override
    public void swimming() {
        System.out.println("人可以学会各种姿势的游泳");
    }
    @Override
    public void flying() {
        System.out.println("人类借助工具也能进行飞翔");
    }
    @Override
    public void studyJava() {
        System.out.println("老师说了，要认真听课，做笔记，做思维导图");
    }
}

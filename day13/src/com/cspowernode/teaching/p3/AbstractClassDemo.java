package com.cspowernode.teaching.p3;

/**
 * @Author 汪洋
 * @Date 2023/3/20 16:40
 * @Description
 * 抽象类的使用
 * 0.前言
 *  在前面的学习过程中，我们为了把需求上的方法体现在程序上或者是为了完成多态的优化，所以我们在父类往往会
 *  定义一个没有任何方法逻辑的空方法，这样的方法定义出来会带来两个问题：
 *  a.空着方法在那里不太好看；
 *  b.子类可以选择不重写父类的空方法，导致后期逻辑出问题；
 * 1.什么是抽象类
 *  所谓抽象类往往指的是继承体系上的上层类，这些类中肯定出现一些方法无法在父类中详细描述却又需要子类来
 *  进行重写的情况，那么为了从语法上来让子类必须重写该方法，所以我们就可以把这样的父类设计成抽象类；
 * 2.如何让类变抽象以及让方法变抽象
 *  只需要加上abstract修饰词即可
 * 3.抽象类和抽象方法之间的关系
 *  拥有抽象方法的类一定是抽象类，但是抽象类里面可以没有抽象方法；
 * 4.抽象在使用过程中的注意事项
 *  a.抽象方法是没有方法体的，并且实现子类一定要重写父类的所有未被重写过的抽象方法，要保证实现子类
 *  的对象不能存在未被重写过的抽象方法；
 *  b.抽象类是有构造函数的，但是不允许实例化，可以使用多态的形式来构建抽象类的类型；
 *  c.抽象类和普通类一样都可以定义属性和普通实现方法；
 *  d.abstract关键字不能和private、final、static关键字共存！
 *
 */
public class AbstractClassDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        Animal animal = new Animal();
        Animal animal = new Dog();
    }
}
abstract class Animal{
    public abstract void sleep();

    public Animal() {
        System.out.println("animal的构造函数");
    }

    public void eat(){

    }
}
//哺乳动物
abstract class Mammal extends Animal {
    public Mammal() {
        System.out.println("哺乳动物的构造函数");
    }

    @Override
    public void sleep() {

    }
    public abstract void run();
}
class Dog extends Mammal{
    public Dog() {
        System.out.println("dog的构造函数");
    }

    @Override
    public void run() {

    }
}

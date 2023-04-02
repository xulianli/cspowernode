package com.cspowernode.teaching.p3;

/**
 * @Author 汪洋
 * @Date 2023/3/17 16:55
 * @Description
 * 继承的使用
 * 1.所谓继承其实跟现实生活中很类似，都是儿子可以得到父亲的所有资源(属性、方法)，在程序里面的继承其实
 * 也跟现实生活中一样，我们有以下几种场景会用到继承
 *  a.需求文档中的某些类本身就是拥有继承关系；
 *  b.在书写类的时候发现有很多共通的属性可以抽取出来形成一个父类，从而完成一个继承体系；
 *  c.在一个项目进行后期修改或者是二次开发的时候，需要对原有的某个功能进行改变，那么我们一贯
 *  做法是直接在原有功能上增加一个子类，在子类里面去修改原有的功能，这样可以尽可能的减少功能
 *  修改对依赖该功能的其他功能模块造成影响
 * 2.继承怎么用
 *  直接定义一个子类，然后使用extends后面接父类，完成继承关系
 * 3.继承有什么特点
 *  a.Java中的继承是单继承，即一个子类只能有一个直接父类，但是允许有多个间接父类
 *  b.子类可以直接不使用任何方式去调用父类的非私有资源
 * 4.继承有什么好处
 *  a.提升代码的复用性
 *  b.提升代码的拓展性
 *  c.为后期的多态提供了基础
 * 5.如果定义一个类时，没有使用extends，则它的父类默认是：java.lang.Object，这种拥有很多子类
 * 的父类，我们称之为基类或者是超类，而这个类的子类，我们也称之为派生类
 */
public class ExtendsDemo {
    public static void main(String[] args) {
        //子类在拥有所有父类资源的同时还能继续拓展新的资源，所以extends就代表拓展的意思；
        Son son = new Son();
        System.out.println(son.a);
        System.out.println(son.x);
        System.out.println(son.y);
        son.test1();
        son.test2();
        son.test3();
    }
}
class GrandFather{
    int x = 100;
    public void test2(){
        System.out.println("我是祖父类");
    }
}
class Father extends GrandFather{
    int a = 10;
    public void test1(){
        System.out.println("这是父类的方法");
    }
}
class Son extends Father{
    int y = 200;
    public void test3(){
        System.out.println("这是子类的方法");
    }
}

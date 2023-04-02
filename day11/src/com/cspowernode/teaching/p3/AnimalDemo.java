package com.cspowernode.teaching.p3;

/**
 * @Author 汪洋
 * @Date 2023/3/17 17:05
 * @Description
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.brand = "阿拉斯加";
        dog.age = 2;
        dog.sex = "公";
        dog.color = "黑白";
        dog.run();
        dog.sleep();
        dog.eat();
    }
}
class Animal{
    String brand;
    String sex;
    int age;
    public void eat(){
        System.out.println("这是animal的eat方法");
    }
    public void sleep(){
        System.out.println("这是animal的sleep方法");
    }
}
class Dog extends Animal{
    String color;
    public void run(){
        System.out.println("狗狗在奔跑");
    }
}
class Bird extends Animal{
    String color;
    public void fly(){
        System.out.println("鸟在飞翔");
    }
}
class Fish extends Animal{
    public void swim(){
        System.out.println("鱼在游泳");
    }
}
class Snake extends Animal{
    public void climb(){
        System.out.println("蛇在爬行");
    }
}
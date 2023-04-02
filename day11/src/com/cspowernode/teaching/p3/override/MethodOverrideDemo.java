package com.cspowernode.teaching.p3.override;

/**
 * @Author 汪洋
 * @Date 2023/3/17 17:15
 * @Description
 * 方法的重写
 * 1.所谓方法的重写是指父类的方法无法满足子类的需求，所以子类把该方法结构重新写出来，然后
 * 把里面的逻辑完全修改掉，那么后面再调用方法时就不会调用父类的方法了
 * 2.怎么进行重写
 *  直接把父类的方法结构放入到子类里面就可以了
 * 3.方法重写需要注意哪些事项
 *  a.方法签名要保证一样
 *  b.访问控制修饰符子类要大于等于父类的
 *  c.如果返回类型是引用数据类型(除了数组和字符串),那么子类的返回类型要小于等于父类的；--->一般不管
 * 4.方法的重写和方法重载的区别--->面试题
 */
public class MethodOverrideDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
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
class Dog extends Animal {
    String color;
    public void eat(){
        System.out.println("狗狗吃东西");
    }
    public void sleep(){
        System.out.println("狗狗睡觉");
    }
    public void run(){
        System.out.println("狗狗在奔跑");
    }
}

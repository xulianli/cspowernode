package com.cspowernode.practice;

/**
 * @Author 徐联理
 * @Date 2023/3/21 11:42
 * @Description
 * 1.编写程序描述兔子和青蛙
 * 需求说明：使用抽象类的思想，描述兔子和青蛙。
 * 实现思路及关键代码
 * 1)分析兔子和青蛙的共性
 * 2)根据共性，定义抽象的动物类
 * 属性：名字、颜色、类别（哺乳类、非哺乳类）
 * 方法：吃饭，发出叫声
 * 3)根据青蛙会游泳 抽象游泳的接口
 * 方法：游泳
 * 4)定义兔子继承动物类，青蛙继承动物同时实现游泳接口
 */
public class Practice14 {
    public static void main(String[] args) {
         new Rabit("美人","黑色","哺乳类").toShow();
        System.out.println("----------------------");
        new Frog("大兵","绿色","非哺乳类").toShow();
    }
}

abstract class Animal {
    String name;
    String color;
    String breed;

    abstract void eat();

    abstract void makeSound();

    abstract void toShow();
}

interface Swim {
    void swimming();
}

class Rabit extends Animal{

    public Rabit(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    @Override
    void eat() {
        System.out.println("爱吃胡萝卜");
    }

    @Override
    void makeSound() {
        System.out.println("叽叽的叫");
    }

    @Override
    void toShow() {
        System.out.print("那只"+this.color+"的，名叫"+this.name+"的兔子正在");
        makeSound();
        System.out.print("兔子是"+this.breed+"，");
        eat();
    }
}

class Frog extends Animal implements Swim{

    public Frog(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    @Override
    void eat() {
        System.out.println("爱吃昆虫");
    }

    @Override
    void makeSound() {
        System.out.println("呱呱的叫");
    }

    @Override
    void toShow() {
        System.out.print("那只"+this.color+"的，名叫"+this.name+"的青蛙正在");
        makeSound();
        System.out.print("青蛙是"+this.breed+"，");
        eat();
        swimming();
    }

    @Override
    public void swimming() {
        System.out.println("青蛙虽然不是鱼，但是游泳高手");
    }
}

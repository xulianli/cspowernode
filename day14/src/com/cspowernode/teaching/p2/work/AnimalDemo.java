package com.cspowernode.teaching.p2.work;

/**
 * @Author 汪洋
 * @Date 2023/3/21 14:18
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
 * 定义兔子继承动物类，青蛙继承动物同时实现游泳接口
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("大美","黑色","哺乳类");
        rabbit.jiao();
        rabbit.eat();
        System.out.println("=========================================");
        Frog frog = new Frog("大兵","绿色","非哺乳类");
        frog.jiao();
        frog.eat();
        frog.swimming();
    }
}
abstract class Animal{
    String name;
    String color;
    String type;
    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }
    public abstract void eat();
    public abstract void jiao();
}
interface Swim{
    void swimming();
}
class Rabbit extends Animal {
    public Rabbit(String name, String color, String type) {
        super(name, color, type);
    }
    @Override
    public void eat() {
        System.out.println("兔子是"+type+"类,爱吃胡萝卜");
    }
    @Override
    public void jiao() {
        System.out.println("那只"+color+"的，名叫"+name+"的兔子正在叽叽的叫");
    }
}
class Frog extends Animal implements Swim{
    public Frog(String name, String color, String type) {
        super(name, color, type);
    }

    @Override
    public void eat() {
        System.out.println("青蛙是"+type+"类，爱吃昆虫");
    }
    @Override
    public void jiao() {
        System.out.println("那只"+color+"的，名叫"+name+"的青蛙正在呱呱的叫");
    }
    @Override
    public void swimming() {
        System.out.println("虽然不是鱼，青蛙也是泳坛高手");
    }
}
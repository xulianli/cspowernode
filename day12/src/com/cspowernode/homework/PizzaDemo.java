package com.cspowernode.homework;

import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/18 20:55
 * @Description
 * 2.编写程序实现比萨制作。需求说明编写程序，接收用户输入的信息，选择需要制作的比萨。可供选择的比萨有：培根比萨和海鲜比萨。
 * 实现思路及关键代码
 * 5)分析培根比萨和海鲜比萨
 * 6)定义比萨类
 * 7)属性：名称、价格、大小
 * 8)方法：展示
 * 9)定义培根比萨和海鲜比萨继承自比萨类
 * 10)定义比萨工厂类，根据输入信息产生具体的比萨对象
 */
public class PizzaDemo {
    public static void main(String[] args) {
        System.out.println("请选择想要制作的披萨（1.培根披萨 2.海鲜披萨）");
        Scanner sc1 = new Scanner(System.in);
        int choice =sc1.nextInt();
        PizzaFactory pizzaFactory = new PizzaFactory();
        System.out.println(pizzaFactory.makePizza(choice));
    }
}

class PizzaFactory{
    Pizza makePizza(int input){
        Scanner sc = new Scanner(System.in);
        if (input==1){
            BaconPizza baconPizza = new BaconPizza();
            baconPizza.name="培根披萨";
            System.out.println("请输入培根克数：");
            baconPizza.bacon=sc.nextInt();
            System.out.print("请输入披萨大小：");
            baconPizza.size=sc.nextInt();
            System.out.print("请输入披萨价格：");
            baconPizza.price=sc.nextInt();
            return baconPizza;}
        else if (input==2){
            SeafoodPizza seafoodPizza = new SeafoodPizza();
            seafoodPizza.name="海鲜披萨";
            System.out.println("请输入配料信息：");
            seafoodPizza.addson=sc.next();
            System.out.print("请输入披萨大小：");
            seafoodPizza.size=sc.nextInt();
            System.out.print("请输入披萨价格：");
            seafoodPizza.price=sc.nextInt();
            return seafoodPizza;}
        else{
            System.out.println("输入错误");
            return null;}
    }
}

class Pizza{
    String name;
    int price;
    int size;

    @Override
    public String toString() {
        return "名称：" + name + "\n" + "价格：" + price+"元" + "\n" + "大小：" + size +"寸"+"\n";
    }
}

class BaconPizza extends Pizza {
    int bacon;

    @Override
    public String toString() {
        return super.toString() + "培根克数：" + bacon + "克";
    }
}

class SeafoodPizza extends Pizza{
    String addson;

    @Override
    public String toString() {
        return super.toString()+"配料：" + addson;
    }
}


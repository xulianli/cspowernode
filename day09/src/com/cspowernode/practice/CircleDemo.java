package com.cspowernode.practice;

/**
 * @Author 徐联理
 * @Date 2023/3/14 19:21
 * @Description
 * 2. 定义一个圆类——Circle，在类的内部提供一个属性：半径(r)，同时 提供 两个 方 法 ： 计算 面积 （ getArea() ） 和 计算
 * 周长（getPerimeter()） 。 通过两个方法计算圆的周长和面积并且对计算结果进行输出。最后定义一个测试类对 Circle 类进行使用
 */
public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setR(12);
        circle.getArea();
        circle.getPerimeter();
    }
}
    class Circle{
    double r;
    final double PI = 3.14;

    void setR(double input){
        if (input<0)
            throw new IllegalArgumentException("半径数据有误");
        r=input;
    }

    void getArea(){
        System.out.println("该圆的面积为："+Math.round(PI*r*r));
    }

    void getPerimeter(){
        System.out.println("该圆的周长为："+PI*2*r);
    }

    }

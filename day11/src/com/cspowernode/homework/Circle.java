package com.cspowernode.homework;

/**
 * @Author 徐联理
 * @Date 2023/3/17 18:57
 * @Description
 * 2.编写应用程序，创建类的对象，分别设置圆的半径、圆柱体的高，计算并分别显示圆半径、圆面积、圆周长，圆柱体的体积。
 * 提示:（1）编写一个圆类Circle，该类拥有：
 * 1)一个成员变量，radius（私有，浮点型）;//存放圆的半径；
 * 2)两个构造方法
 * Circle（）              //将半径设为0
 * Circle（double  r ）    //创建Circle对象时将半径初始化为r
 * 3)三个成员方法
 * double getArea（）      //获取圆的面积
 * double getPerimeter（）  //获取圆的周长
 * void show（）           //将圆的关径、周长、面积输出到屏幕
 */
public class Circle {
    double r;

    public Circle() {
        r=0;
    }

    public Circle(double r) {
        this.r = r;
    }

    double getArea(){
        return Math.round(Math.PI*r*r);
    }

    double getPerimeter(){
        return Math.round(Math.PI*2*r);
    }

    void show(){
        System.out.println("半径："+r);
        System.out.println("周长："+getPerimeter());
        System.out.println("面积："+getArea());
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(9);
        circle1.show();
    }
}

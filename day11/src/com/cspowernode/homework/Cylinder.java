package com.cspowernode.homework;

/**
 * @Author 徐联理
 * @Date 2023/3/17 19:05
 * @Description
 * 编写一个圆柱体类Cylinder，它继承于上面的Circle类。还拥有：
 * 1)一个成员变量，double hight  （私有，浮点型）;  //圆柱体的高；
 * 2)构造方法
 * //创建Cylinder对象时将半径初始化为r,高度初始化为h
 * Cylinder（double r,double h）
 * 3)成员方法
 * double getVolume（）            //获取圆柱体的体积
 * void showVolume（）             //将圆柱体的体积输出到屏幕
 */
public class Cylinder extends Circle{
    private double height;

    public Cylinder(double r, float height) {
        super(r);
        this.height = height;
    }
    double getVolumn(){
        return Math.round(getArea()*height);
    }

    void showVolumn(){
        System.out.println("体积为："+getVolumn());
    }

    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(8,9);
        cylinder1.showVolumn();
    }
}

package com.cspowernode.practice;

/**
 * @Author 徐联理
 * @Date 2023/3/20 17:02
 * @Description
 */
class ShapeDemo {
}

public abstract class Shape{
    Point point;

    abstract double getArea();

}

class Point{
    double x;
    double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p){
        return Math.round(Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y)));
    }
}

class Circle extends Shape{
    double r;

    public Circle() {
        r=0;
    }

    public Circle(double r, Point center) {
        this.r = r;
        this.point = center;
    }
    @Override
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
}

class Cylinder extends Circle{
    private double height;

    public Cylinder(double r, Point center, double height) {
        super(r, center);
        this.height = height;
    }

    double getVolumn(){
        return Math.round(getArea()*height);
    }

    void showVolumn(){
        System.out.println("体积为："+getVolumn());
    }

}

class Rectangle extends Shape{
    Point p1;
    Point p2;
    double height;
    double width;

    public Rectangle() {
    }

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        height=Math.max(p1.x,p2.x)-Math.min(p1.x,p2.x);
        width=Math.max(p1.y,p2.y)-Math.min(p1.y,p2.y);
    }
    @Override
    double getArea(){
        return height*width;
    }

    double getPerimeter(){
        return (height+width)*2;
    }

    boolean isInsideRec(Point p3){
        return (Math.min(p1.x,p2.x)<=p3.x && p3.x<=Math.max(p1.x,p2.x))
                &&(Math.min(p1.y,p2.y)<=p3.y && p3.y<=Math.max(p1.y,p2.y))? true:false;
    }
}
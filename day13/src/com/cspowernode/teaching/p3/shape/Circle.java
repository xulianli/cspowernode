package com.cspowernode.teaching.p3.shape;

/**
 * @Author 汪洋
 * @Date 2023/3/20 17:16
 * @Description
 */
public class Circle extends Shape{
    double r;
    public Circle(double r, Point center) {
        this.r = r;
        this.center = center;
    }
    public double getArea(){
        return Math.PI*r*r;
    }
    public double getPerimeter(){
        return Math.PI*2*r;
    }
    public boolean isIn(Point other){
        return center.distance(other)<=r;
    }
    public boolean isIn(double x,double y){
        return this.isIn(new Point(x,y));
    }
}

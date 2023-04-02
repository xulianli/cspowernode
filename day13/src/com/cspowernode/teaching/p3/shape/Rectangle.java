package com.cspowernode.teaching.p3.shape;

/**
 * @Author 汪洋
 * @Date 2023/3/20 17:17
 * @Description
 */
public class Rectangle extends Shape{
    double height;
    double width;

    public Rectangle() {
    }
    public Rectangle(Point center, double height, double width) {
        this.center = center;
        this.height = height;
        this.width = width;
    }
    public Rectangle(double x,double y, double height, double width) {
        this(new Point(x,y),height,width);
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return (width+height)*2;
    }
    public boolean isIn(Point other){
        return (other.x-this.center.x>=0&&other.x-this.center.x<=width)&&
                (other.y-this.center.y>=0&&other.y-this.center.y<=height);
    }
}

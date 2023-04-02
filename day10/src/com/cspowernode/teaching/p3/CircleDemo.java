package com.cspowernode.teaching.p3;

/**
 * @Author 汪洋
 * @Date 2023/3/16 15:25
 * @Description
 * 需求：有一个Point的类，代表一个点，它有两个属性，分别是x坐标和y坐标；有一个求两点间距离的方法distance，
 *     公式是：假设一个点的坐标是x1和y1，另外一个点的坐标是x2和y2，那么它们两点间距离就是x的差平方加上y的差的平方，
 *     然后求该值的平方根-->Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))
 *     还有一个类叫做Circle，它代表一个圆，那么它的属性是点和半径r，该类有求圆的周长以及圆的面积以及判断点是否在
 *     圆内的三个方法；
 *     最后书写测试类进行测试
 */
public class CircleDemo {
    public static void main(String[] args) {
        Point center = new Point(2,5);
        Point other = new Point(5,5);
        Circle circle = new Circle(3,center);
        System.out.println(circle.isIn(other));
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
class Point{
    double x;
    double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point other){
        double distanceX = x - other.x;
        double distanceY = y - other.y;
        double distance = Math.sqrt(distanceX*distanceX+distanceY * distanceY);
        return distance;
//        return Math.sqrt((x-other.x)*(x-other.x)+(y-other.y)*(y-other.y));
    }
    public double distance(double x,double y){
        return this.distance(new Point(x,y));
    }
}
class Circle{
    double r;
    Point center;
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
package com.cspowernode.practice;

/**
 * @Author 徐联理
 * @Date 2023/3/16 14:38
 * @Description
 * 1.点与圆的关系
 *     需求：有一个Point的类，代表一个点，它有两个属性，分别是x坐标和y坐标；有一个求两点间距离的方法distance，
 *     公式是：假设一个点的坐标是x1和y1，另外一个点的坐标是x2和y2，那么它们两点间距离就是x的差平方加上y的差的平方，
 *     然后求该值的平方根-->Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))
 *     还有一个类叫做Circle，它代表一个圆，那么它的属性是点和半径r，该类有求圆的周长以及圆的面积以及判断点是否在
 *     圆内的三个方法；
 *     最后书写测试类进行测试
 */
public class PointnCircleDemo {
    public static void main(String[] args) {
        Point p1=new Point(3,4);
        Point p2=new Point(8,-10);
        System.out.println("p1与p2之间距离为："+p1.distance(p2));
        Circle c1 = new Circle(p2,5);
        System.out.println(c1.isInside(p1));
    }
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

class Circle{
    Point centrePoint;
    double r;

    public Circle() {
    }

    public Circle(Point point, double r) {
        this.centrePoint = point;
        this.r = r;
    }

    double getArea(){
        return Math.round(Math.PI*r*r);
    }

    double getPerimeter(){
        return Math.PI*2*r;
    }

    boolean isInside(Point p){
        return centrePoint.distance(p) <= r? true:false;
    }
}

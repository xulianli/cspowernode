package com.cspowernode.teaching.p3.shape;

/**
 * @Author 汪洋
 * @Date 2023/3/20 17:16
 * @Description
 */
public class Point {
    double x;
    double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point other){
        return Math.sqrt((x-other.x)*(x-other.x)+(y-other.y)*(y-other.y));
    }
    public double distance(double x,double y){
        return this.distance(new Point(x,y));
    }
}

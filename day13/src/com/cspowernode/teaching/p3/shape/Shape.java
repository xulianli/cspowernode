package com.cspowernode.teaching.p3.shape;

/**
 * @Author 汪洋
 * @Date 2023/3/20 17:18
 * @Description
 */
public abstract class Shape {
    Point center;
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract boolean isIn(Point other);
}

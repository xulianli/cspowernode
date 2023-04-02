package com.cspowernode.teaching.p3.shape;

/**
 * @Author 汪洋
 * @Date 2023/3/20 17:17
 * @Description
 */
public class Cylinder extends Circle{
    private double height;

    public Cylinder(double r,Point center, double height) {
        super(r,center);
        this.height = height;
    }

    public double getVolume(){
        return getArea()*height;
    }
    public void showVolume(){
        System.out.println("当前圆柱体的体积是:"+getVolume());
    }
}

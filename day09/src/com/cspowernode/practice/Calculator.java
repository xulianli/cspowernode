package com.cspowernode.practice;

/**
 * @Author 徐联理
 * @Date 2023/3/14 16:16
 * @Description
 * 1、使用计算器（Calculator）完成加法和减法运算，并能显示出该计算器的品牌和尺寸。
 * 计算器成员变量：品牌（brand）、尺寸（size）
 * 计算器成员方法：加法运算（add）、减法运算（sub）和显示计算机信息（show）
 */
public class Calculator {
    String brand;
    double size;

    private double add(double a, double b) {
        return a+b;
    }

    private double sub(double a, double b){
        return a-b;
    }

    private void show(){
        System.out.println("品牌："+brand);
        System.out.println("尺寸："+size);
    }

}

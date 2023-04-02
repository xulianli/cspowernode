package com.cspowernode.teaching.p2.work;

/**
 * @Author 汪洋
 * @Date 2023/3/14 16:32
 * @Description
 * 使用计算器（Calculator）完成加法和减法运算，并能显示出该计算器的品牌和尺寸。
 * 计算器成员变量：品牌（brand）、尺寸（size）
 * 计算器成员方法：加法运算（add）、减法运算（sub）和显示计算机信息（show）
 */
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        cal1.brand = "西门子";
        cal1.size = 19;
        Calculator cal2 = new Calculator();
        cal2.brand = "联想";
        cal2.size = 17;
        System.out.println(cal1.add(1,2,3,4,5,6));
        System.out.println(cal1.sub(1,2,3,4,5,6));
        cal1.show();
        cal2.show();
    }
}
class Calculator{
    String brand;
    double size;

    public int add(int a,int ... b){
        for (int i : b) {
            a+=i;
        }
        return a;
    }
    public int sub(int a,int ... b){
        for (int i : b) {
            a-=i;
        }
        return a;
    }
    public void show(){
        System.out.println("该计算机的品牌是："+brand+",尺寸是："+size+"厘米");
    }
}

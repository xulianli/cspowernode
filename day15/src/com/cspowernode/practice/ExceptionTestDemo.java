package com.cspowernode.practice;

import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/23 15:51
 * @Description
 * 1.编写程序接收用户输入分数信息，如果分数在0—100之间，输出成绩。如果成绩不在该范围内，抛出异常信息，提示分数必须在0—100之间。
 * 要求：使用自定义异常实现
 * 写一个方法void isTriangle(int a,int b,int c)，判断三个参数是否能构成一个三角形，如果不能则抛出异常
 * IllegalArgumentException，显示异常信息 “a,b,c不能构成三角形”，如果可以构成则显示三角形三个边长，在主方法中得到命令行输入
 * 的三个整数，调用此方法，并捕获异常
 */
public class ExceptionTestDemo {
    public static void main(String[] args) {
//    Score();
    isTriangle(8,11,10);
    }

    private static void isTriangle(int a,int b,int c) {
        if (a+b<c || a-b>c){
            try {
                throw new NotATriangleException(a,b,c);
            } catch (NotATriangleException e) {
                e.printStackTrace();
            }
        }else
            System.out.println(a+","+b+","+c);
    }

    public static void Score() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入分数（0-100）：");
        int grade = sc.nextInt();
        if (grade < 0 || grade > 100){
            try {
                throw new ScoreInvalidException(grade);
            }
            catch (ScoreInvalidException e) {
                e.printStackTrace();
            }
        }
        System.out.println(grade);
    }
}


class ScoreInvalidException extends Exception{
    public ScoreInvalidException(int a) {
        super("分数必须在0-100之间，"+a+"不在0-100之间！");
    }

}

class NotATriangleException extends Exception{
    public NotATriangleException(int a, int b, int c) {
        super(a+","+b+","+c+"无法构成三角形");
    }
}
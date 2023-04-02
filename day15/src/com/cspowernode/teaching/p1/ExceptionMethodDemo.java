package com.cspowernode.teaching.p1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 汪洋
 * @Date 2023/3/23 16:58
 * @Description
 * 熟悉Throwable中的一些方法
 * 1.构造方法
 *  a.无参：获取到没有任何错误信息的异常对象--->java.lang.IllegalArgumentException
 *  b.带message的有参：获取到有具体错误信息提示的异常对象--->java.lang.IllegalArgumentException: a,b,c不能构成三角形
 * 2.方法
 *  a.getMessage:获取到你在构造函数里面传递过来的异常信息
 *  b.toString:包含类对象的全限定名+构造函数里面传递过来的异常信息
 *  c.printStackTrace:把异常的全限定名+异常信息+异常的堆栈跟踪信息直接输出到指定的位置
 *  d.getStackTrace:把异常的堆栈跟踪信息汇总成一个数组
 */
public class ExceptionMethodDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数(0-100之间)：");
        double score = sc.nextDouble();
        try {
            if(checkScore(score)){
                System.out.println(score);
            }
        } catch (ScoreNotBoundsException e) {
            //1.getMessage
            System.out.println("getMessage:"+e.getMessage());
            System.out.println("-----------------------------------------------");
            //2.toString
            System.out.println("toString:"+e);
            //3.printStackTrace
            System.out.println("-----------------------------------------------");
            e.printStackTrace();
            System.out.println("-----------------------------------------------");
            //4.getStackTrace
            StackTraceElement[] stackTrace = e.getStackTrace();
            System.out.println(Arrays.toString(stackTrace));
        }
    }

    private static boolean checkScore(double score) throws ScoreNotBoundsException {
        if(score<0||score>100){
            throw new ScoreNotBoundsException(score);
        }
        return true;
    }
}

package com.cspowernode.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/23 19:06
 * @Description
 * 编写一个计算N个整数平均值的程序。程序应该提示用户输入N的值，然后输入所有N个数求平均值，
 * 如果用户输入的值是一个负数，则应该抛出一个异常并捕获，提示“N必须是正整数”。并提示用户再次输入该数
 */
public class HomeworkDemo {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("请输入一个数字：");
        while (true) {
            try {
                int num = input.nextInt();
                if (num > 0) {
                    getAverage(num);
                    break;
                }else
                    throw new InputInvalidException();
            } catch (InputInvalidException e) {
                e.printStackTrace();
            }
        }
    }

    private static void getAverage(int num) {
        System.out.println("请输入"+num+"个正整数（用逗号隔开）：");
        String[] arr1 = input.next().split(",");
        double sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += Integer.parseInt(arr1[i]);
        }
        System.out.println("这"+num+"个数的平均数为："+Math.round(sum/num));
    }
}

class InputInvalidException extends Exception{
    public InputInvalidException() {
        super("N必须是正整数，请再次输入：");
    }
}
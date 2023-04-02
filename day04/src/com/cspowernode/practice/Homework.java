package com.cspowernode.practice;

import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/8 14:20
 * @Description
 * 1. 银行利率表如下表所示，请计算存款10000元，活期1年、活期2年，定期1年，定期2年后的本息合计。
 * 2. 接收一个人的成绩，如果成绩为:90(包含)到100(包含)输出优秀，70(包含)到90输出良好，60(包含)到70输出及格，
 * 60分以下输出不及格。
 * 3. 完成猜数字游戏，随机产生一个1-10的随机数，然后来猜
 */
public class Homework {
    public static void main(String[] args) {
        work1();
        work2();
        work3();
    }

    private static void work3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("猜1到10的数：");
        int num = sc.nextInt();
        System.out.println(num==(int)(Math.random()*10)+1?"恭喜你，猜对了":"猜错了");
    }

    private static void work2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入成绩：");
        int grade = sc.nextInt();
        switch (grade/10){
            case 9: case 10:
                System.out.println("优秀");
                break;
            case 7: case 8:
                System.out.println("良好");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
                break;
        }
    }

    private static void work1() {
        int deposit = 10000;
        double checking1yr = deposit * (1+0.0035);
        double checking2yr = checking1yr * (1+0.0035);
        double fixed1yr = deposit * (1+0.0150);
        double fixed2yr = deposit * (1+0.021)* (1+0.021);
        System.out.println(Math.round(checking1yr)+"\n"+ Math.round(checking2yr)+"\n"
                + Math.round(fixed1yr)+"\n"+ Math.round(fixed2yr));

    }
}

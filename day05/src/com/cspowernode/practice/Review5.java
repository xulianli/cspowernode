package com.cspowernode.practice;

import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/9 18:50
 * @Description
 * 1.随机1-100的数字，当你随机到一个质数的时候，结束该循环，然后统计循环了多少次
 * 2.循环1-100的随机数，随机到的数字用来进行累加操作，如果累加的和等于100，那么输出该表达式，并且结束循环，统计一共
 * 失败了多少次，如果累加的和大于100，那么计失败一次，重新开始进行累加；
 */
public class Review5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字母");
        char initial = sc.next().charAt(0);
        switch (initial){
            case 'm': case 'M':
                System.out.println("Monday");
                break;
            case 'f': case 'F':
                System.out.println("Friday");
                break;
            case'w': case'W':
                System.out.println("Wednesday");
                break;
            case 't': case'T':
                System.out.println("请输入第二个字母：");
                char second =sc.next().charAt(0);
                if (second=='u')
                    System.out.println("Tuesday");
                else if (second=='h')
                    System.out.println("Thursday");
                else
                    System.out.println("输入不正确");
                break;
            case's': case'S':
                System.out.println("请输入第二个字母：");
                char second2 =sc.next().charAt(0);
                if (second2=='u')
                    System.out.println("Sunday");
                else if (second2=='a')
                    System.out.println("Saturday");
                else
                    System.out.println("输入不正确");
                break;
            default:
                System.out.println("输入不正确");
            }
        }
    }


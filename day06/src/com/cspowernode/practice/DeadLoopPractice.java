package com.cspowernode.practice;

import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/9 8:23
 * @Description
 * 小练习：随机1-100的数字，当你随机到一个质数的时候，结束该循环，然后统计循环了多少次
 * 1.循环1-100的随机数，随机到的数字用来进行累加操作，如果累加的和等于100，那么输出该表达式，并且结束循环，统计一共
 * 失败了多少次，如果累加的和大于100，那么计失败一次，重新开始进行累加；
 * 比如：
 *     1+3+5+99>100，那么这次就算是失败的，然后重新让表达式为0再次开始，如果表达式为100了，那么展示该表达式，比如
 *     2+3+50+45=100
 */
public class DeadLoopPractice {
    public static void main(String[] args) {
        work1();
        work2();
    }

    private static void work2() {
        //1.设立表达式的和以及用来统计循环次数的count
        int sum=0, count=0;
        //2.设立表达式的字符串
        String strSum="";
        //3.使用死循环
        while (true){
            //4.生成随机数
            int num = (int) (Math.random()*99)+1;
            //5.随机数相加
            sum += num;
            //6.生成随机数相加的字符串
            strSum += num+"+";
            //7.判定和是否为100
            if (sum==100){
                //8.去掉字符串的最后一个加号
                strSum=strSum.substring(0,strSum.length()-1);
                //9.输出统计次数和随机数相加的字符串
                System.out.println("一共循环了"+count+"次"+"\n"
                +strSum+"=100");
                break;
                //10.如果和大于100，统计次数+1，重置sum和加法表达式
            }else if (sum>100){
                count++;
                sum=0;
                strSum="";
            }
        }
    }

    private static void work1() {
        int count =0;
        while (true){
            count ++;
            int num = (int) (Math.random()*99)+1;
            int flag = 0;
            for(int i = 2;i<num;i++){
                if(num%i==0){
                    flag = 1;
                }
            }
            if(flag==0){
                System.out.println("循环了"+count+"次");
                System.out.println(num+"是质数");
                break;
            }

        }
    }
}

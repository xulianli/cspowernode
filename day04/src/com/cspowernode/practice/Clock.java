package com.cspowernode.practice;

import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/8 14:17
 * @Description
 */
public class Clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入时钟：");
        int hour = sc.nextInt();
        System.out.println("输入分钟：");
        int minute = sc.nextInt();
        System.out.println("输入秒钟：");
        int second = sc.nextInt();
        if (hour>=24){
            hour %= 24;
        }
        if (minute>=60){
            minute %= 60;
        }
        if (second>=60){
            second %= 60;
        }

        second++;
        if (second==60){
            second=0;
            ++minute;
            if(minute==60){
                minute=0;
                ++hour;
                if (hour==24){
                    hour=0;
                }
            }
        }

        String strHour=""+hour;
        if (hour<10){
            strHour = "0"+strHour;
        }
        String strMin=""+minute;
        if (minute<10){
            strMin = "0"+strMin;
        }
        String strSec=""+second;
        if (second<10){
            strSec = "0"+strSec;
        }
        System.out.println("下一秒时间为："+strHour+":"+strMin+":"+strSec);
    }

}

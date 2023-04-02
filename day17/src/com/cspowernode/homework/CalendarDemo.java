package com.cspowernode.homework;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/25 17:19
 * @Description
 */

public class CalendarDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入日期（2019-09-22）：");
        String date = sc.next();
        //把输入的时间转为localdate类
        LocalDate parseDate = LocalDate.parse(date);
        //得到那天是这个月的第几天
        int day = parseDate.getDayOfMonth();
        //得到这个月有多少天
        int days = parseDate.lengthOfMonth();
        //得到这个月的第一天是星期几
        int dayValue = parseDate.withDayOfMonth(1).getDayOfWeek().getValue();
        System.out.println("一\t\t二\t\t三\t\t四\t\t五\t\t六\t\t日");
        //打印空格
        for (int j = 1; j <dayValue ; j++) {
            System.out.print("\t\t");
        }
        //打印每天，输入的当天日期加上星号
        for (int i = 1; i <= days; i++) {
            if (i==day){
                System.out.print(i+"*\t\t");
            }else{
                System.out.print(i+"\t\t");
            }
            //如果空格数和天数加起来能整除7就换行
            if ((i+dayValue-1)%7==0){
                System.out.println();
            }
        }
    }
}


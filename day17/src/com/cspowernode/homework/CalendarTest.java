package com.cspowernode.homework;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/27 19:10
 * @Description
 */
public class CalendarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dateStr = sc.next();
        //输入的日期转换为LocalDate类
        LocalDate date = LocalDate.parse(dateStr);
        //得到输入日的日份
        int day = date.getDayOfMonth();
        //得到输入日期月份的天数
        int days = date.lengthOfMonth();
        //得到输入日期的第一天的星期
        int week = date.withDayOfMonth(1).getDayOfWeek().getValue();
        //输出抬头
        System.out.println("一\t\t二\t\t三\t\t四\t\t五\t\t六\t\t日");
        //输出第一天之前的空白
        for (int i = 1; i < week; i++) {
            System.out.print("\t\t");
        }
        //输出日份，若是输入日期则加上星号
        for (int i = 1; i <= days; i++) {
            if (i==day){
                System.out.print(i+"*\t\t");
            }else{
                System.out.print(i+"\t\t");
            }
            //换行
            if ((i+week-1)%7==0){
                System.out.println();
            }
        }
    }
}

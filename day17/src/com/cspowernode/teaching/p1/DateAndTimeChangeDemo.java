package com.cspowernode.teaching.p1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Author 汪洋
 * @Date 2023/3/25 10:29
 * @Description
 * LocalDateTime和LocalDate以及LocalTime之间的互转
 * 1.LocalDateTime转为LocalDate或者是LocalTime
 *  a.转为LocalDate:toLocalDate();
 *  b.转为LocalTime:toLocalTime();
 * 2.LocalDate转为LocalDateTime
 *  a.不设置时分秒：localDate.atStartOfDay();
 *  b.设置指定的时分秒:localDate.atTime();
 *  c.结合LocalTime一起使用:localDate.atTime();
 * 3.LocalTime转为LocalDateTime
 *  atDate();
 */
public class DateAndTimeChangeDemo {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        //1.LocalDateTime转为LocalDate
        LocalDate localDate = date.toLocalDate();
        System.out.println(localDate);
        //2.LocalDateTime转为LocalTime
        LocalTime localTime = date.toLocalTime();
        System.out.println(localTime);
        //3.LocalDate转为LocalDateTime
        //3.1.不设置时分秒，使用默认的0来代替时分秒
        date = localDate.atStartOfDay();
        System.out.println("不设置时分秒："+date);
        //3.2.设置指定的时分秒
        date = localDate.atTime(16,16,16);
        System.out.println("指定的时分秒："+date);
        //3.3.结合LocalTime一起使用
        date = localDate.atTime(localTime);
        System.out.println("结合localTime一起拼成LocalDateTime："+date);
        //4.localTime转为LocalDateTime
        date = localTime.atDate(LocalDate.of(2000,10,24));
        System.out.println("结合localDate一起拼成LocalDateTime："+date);
    }
}

package com.cspowernode.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @Author 徐联理
 * @Date 2023/3/25 9:30
 * @Description
 */
public class BirthdayDemo {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1996,12,22);
        LocalDate now = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String future = birthday.plusDays(10000).format(dtf);
        System.out.println("出生10000天后是："+future);
        System.out.println("出生到现在一共"+(now.toEpochDay()-birthday.toEpochDay())+"天");
    }
}

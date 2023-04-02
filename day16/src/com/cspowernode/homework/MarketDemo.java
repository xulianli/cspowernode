package com.cspowernode.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @Author 徐联理
 * @Date 2023/3/24 19:26
 * @Description
 * 2.某个超市他们进货的时候会将货物的生产日期(String)和保质期（月份,int）来录入一个系统中然后这个系统会在过期的前三个星期的
 * 那一周的周五进行提示，提示说要在本周的周六来进行促销活动，那么，请写出这个系统的代码；
 */
public class MarketDemo {
    public static void main(String[] args) {
        String productionDate = "2023年03月24日";
        int expireMon = 6;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        LocalDate produceDate = LocalDate.parse(productionDate,dtf);
        LocalDate expireDate = produceDate.plusMonths(expireMon);
        int day = expireDate.plusWeeks(-3).getDayOfWeek().getValue();
        LocalDate remindDate = expireDate.plusWeeks(-3).plusDays(5-day);
        System.out.println(remindDate.plusDays(1)+" 本周六进行促销活动！");
    }
}

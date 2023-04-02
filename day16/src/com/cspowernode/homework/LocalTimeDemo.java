package com.cspowernode.homework;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

/**
 * @Author 徐联理
 * @Date 2023/3/24 18:32
 * @Description
 * 1.模仿LocalDate的操作来熟悉LocalTime的使用，它们的方法是一样的；
 * 2.某个超市他们进货的时候会将货物的生产日期(String)和保质期（月份,int）来录入一个系统中然后这个系统会在过期的前三个星期的
 * 那一周的周五进行提示，提示说要在本周的周六来进行促销活动，那么，请写出这个系统的代码；
 * 3.劳动合同的续签问题：给定签劳动合同的日期以及签订的年份，然后算出你续签的日期，所谓续签的日期是指合同到期那天的
 *   前一个月，如果那天是周末，那么顺延到周一，算出周一那天的日期；
 */
public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        LocalTime time = LocalTime.of(23,24,25);
        System.out.println(time);
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());
        System.out.println("====================");
        System.out.println(now.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(now.get(ChronoField.HOUR_OF_AMPM));
        System.out.println(now.get(ChronoField.AMPM_OF_DAY));
        System.out.println(now.get(ChronoField.CLOCK_HOUR_OF_DAY));
        System.out.println(now.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(now.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("====================");
        now = now.withHour(20);
        now = now.withMinute(9);
        now = now.withSecond(9);
        System.out.println(now);
        now = now.with(ChronoField.CLOCK_HOUR_OF_DAY,8);
        now = now.with(ChronoField.MINUTE_OF_HOUR,8);
        now = now.with(ChronoField.SECOND_OF_MINUTE,8);
        System.out.println(now);
        now = now.plusHours(-5);
        now = now.plusMinutes(-5);
        now = now.plusSeconds(-5);
        System.out.println(now);
        String str = "23:12:22.099";
        LocalTime parseTime = LocalTime.parse(str);
        System.out.println(parseTime);
        str = "23点12分22秒099毫秒";
        DateTimeFormatter pdf = DateTimeFormatter.ofPattern("kk点mm分ss秒SSS毫秒");
        parseTime = LocalTime.parse(str, pdf);
        System.out.println(parseTime);
        String strTime = now.format(pdf);
        System.out.println(strTime);
    }
}

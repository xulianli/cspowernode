package com.cspowernode.teaching.p1;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @Author 汪洋
 * @Date 2023/3/24 15:44
 * @Description
 * Java中的日期处理
 */
public class LocalDateTimeDemo {
    public static void main(String[] args) {
        //1.获取时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime date = LocalDateTime.of(2022,12,24,12,12,12);
        System.out.println(date);
        //2.获取指定的时间节点
        //2.1.getXXX()
        System.out.println(now.getYear());
        System.out.println(now.getMonthValue());//3
        System.out.println(now.getDayOfMonth());//一个月中的第几天
        System.out.println(now.getHour());//时
        System.out.println(now.getMinute());//分
        System.out.println(now.getSecond());//秒
        //2.2.get(ChronoField field)
        System.out.println("============================");
        System.out.println(now.get(ChronoField.YEAR));
        System.out.println(now.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(now.get(ChronoField.DAY_OF_MONTH));
        System.out.println(now.get(ChronoField.DAY_OF_WEEK));
        System.out.println(now.get(ChronoField.HOUR_OF_DAY));
        System.out.println(now.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(now.get(ChronoField.SECOND_OF_MINUTE));
        //3.日期的设置
        //3.1.定位到指定的时间节点：with
        //把当前时间改为2022年的5月1日
        now = now.withYear(2022);
        now = now.withMonth(5);
        now = now.withDayOfMonth(1);
        now = now.withHour(23);
        now = now.withMinute(59);
        now = now.withSecond(59);
        System.out.println(now);
        now = now.with(ChronoField.YEAR,2023);
        now = now.with(ChronoField.MONTH_OF_YEAR,Month.MARCH.getValue());
        now = now.with(ChronoField.DAY_OF_MONTH,24);
        now = now.with(ChronoField.HOUR_OF_DAY,12);
        now = now.with(ChronoField.MINUTE_OF_HOUR,12);
        now = now.with(ChronoField.SECOND_OF_MINUTE,12);
        System.out.println(now);
        //3.2.进行时间的偏移
        //把时间往过去走5年零10天，看看是哪天
        now = now.plus(-5, ChronoUnit.YEARS);
        now = now.plus(-10, ChronoUnit.DAYS);
        now = now.plus(-12, ChronoUnit.HOURS);
        now = now.plus(-12, ChronoUnit.MINUTES);
        System.out.println(now);
        //把日期往未来走三周
        now = now.plusWeeks(3);
        //把日期往未来走100秒
        now = now.plusSeconds(100);
        System.out.println(now);
        //4.字符串和日期的转换
        //4.1.使用默认的格式来进行转换成LocalDateTime
        String str = "2020-12-14T15:26:58";
        LocalDateTime parseDate = LocalDateTime.parse(str);
        System.out.println(parseDate);
        //4.2.使用自定义的格式来转换成LocalDateTime
        str = "2020年12月14日15时26分58秒";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH时mm分ss秒");
        parseDate = LocalDateTime.parse(str,dtf);
        System.out.println(parseDate);
        //4.3.把LocalDateTime对象转为指定格式的字符串
        String strDate = now.format(dtf);
        System.out.println(strDate);
    }
}

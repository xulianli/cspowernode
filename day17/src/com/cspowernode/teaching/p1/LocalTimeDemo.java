package com.cspowernode.teaching.p1;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @Author 汪洋
 * @Date 2023/3/24 15:44
 * @Description
 * Java中的时间处理
 * 
 */
public class LocalTimeDemo {
    public static void main(String[] args) {
        //1.获取时间
        LocalTime now = LocalTime.now();
        System.out.println(now);
        LocalTime date = LocalTime.of(16,12,24);
        System.out.println(date);
        //2.获取指定的时间节点
        //2.1.getXXX()
        System.out.println(now.getHour());//时
        System.out.println(now.getMinute());//分
        System.out.println(now.getSecond());//秒
        //2.2.get(ChronoField field)
        System.out.println("============================");
        System.out.println(now.get(ChronoField.HOUR_OF_DAY));
        System.out.println(now.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(now.get(ChronoField.SECOND_OF_MINUTE));
        //3.日期的设置
        //3.1.定位到指定的时间节点：with
        //把当前时间改为23点59分59秒
        now = now.withHour(23);
        now = now.withMinute(59);
        now = now.withSecond(59);
        System.out.println(now);
        now = now.with(ChronoField.HOUR_OF_DAY,12);
        now = now.with(ChronoField.MINUTE_OF_HOUR,12);
        now = now.with(ChronoField.SECOND_OF_MINUTE,12);
        System.out.println(now);
        //3.2.进行时间的偏移
        //把时间往过去走12小时12分钟
        now = now.plus(-12, ChronoUnit.HOURS);
        now = now.plus(-12, ChronoUnit.MINUTES);
        System.out.println(now);
        //把日期往未来走100秒
        now = now.plusSeconds(100);
        System.out.println(now);
        //4.字符串和日期的转换
        //4.1.使用默认的格式来进行转换成LocalTime
        String str = "16:25:59";
        LocalTime parseDate = LocalTime.parse(str);
        System.out.println(parseDate);
        //4.2.使用自定义的格式来转换成LocalTime
        str = "16时25分59秒";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH时mm分ss秒");
        parseDate = LocalTime.parse(str,dtf);
        System.out.println(parseDate);
        //4.3.把LocalTime对象转为指定格式的字符串
        String strDate = now.format(dtf);
        System.out.println(strDate);
    }
}

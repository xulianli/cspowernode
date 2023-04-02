package com.cspowernode.teaching.p3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @Author 汪洋
 * @Date 2023/3/24 15:44
 * @Description
 * Java中的日期处理
 * 1.Java中的日期处理在JDK1.8之前所使用的处理类有如下几个：
 *  long、Date、Calendar、SimpleDateFormat
 *  那么这几个类型要么有些过期，要么有些无法进行日期精确的运算，要么运算逻辑非常的复杂，所以从JDK1.8开始
 *  额外新增加了几个日期操作的类：
 *  LocalDate:专门操作年月日
 *  LocalTime:专门操作时分秒
 *  LocalDateTime:都可以操作
 * 2.时间类型学习需要掌握如下几个点
 *  a.为了展示当前时间
 *  b.为了获取到指定的时间节点，比如星期几、几月份、多少年
 *  c.为了完成日期的计算
 *  d.为了完成字符串和时间日期的转换
 * 3.获取时间
 *  a.LocalDate.now():获取到当前时间
 *  b.LocalDate.of(year,month,day):获取到指定年月日
 * 4.获取到指定的时间节点
 *  a.getXXX():获取到指定的时间节点
 *  b.get(ChronoField field):获取到指定时间节点
 * 5.日期计算
 *  a.直接定位
 *      ①.withXXX(int number):把with后面的节点定位为number
 *      ②.with(ChronoField field,int number):定位到某个具体的时间节点
 *  b.进行偏移
 *      ①.plus(int number,ChronoUnit unit):往指定的时间节点进行增加number，如果number是负数，那么就是往过去走
 *      ②.plusXXX(int number)
 *      ③.minus(int number,ChronoUnit unit):这是减，代码和上面的plus一模一样
 *      ④.minusXXX(int number)
 * 6.字符串和日期的转换
 *  a.字符串转为LocalDate对象
 *      LocalDate.parse(String str,DateTimeFormatter dtf);
 *    注意：默认情况下parse方法中的第二个参数所定义的日期格式是：yyyy-MM-dd，如果你的字符串格式跟该格式不匹配的话
 *    那么你需要自己去指定一个跟你的字符串格式匹配的DateTimeFormatter对象：
 *    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
 *  b.LocalDate对象转为字符串
 *      localDate.format(DateTimeFormatter dtf)
 */
public class LocalDateDemo {
    public static void main(String[] args) {
        //1.获取时间
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate date = LocalDate.of(2022,12,24);
        System.out.println(date);
        //2.获取指定的时间节点
        //2.1.getXXX()
        System.out.println(now.getYear());
        Month month = now.getMonth();
        System.out.println(month);//MARCH
        System.out.println(month.getValue());//3
        System.out.println(now.getMonthValue());//3
        System.out.println(now.getDayOfMonth());//一个月中的第几天
        System.out.println(now.getDayOfYear());//一年中的第几天
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(dayOfWeek);//FRIDAY
        System.out.println(dayOfWeek.getValue());//5
        //2.2.get(ChronoField field)
        System.out.println("============================");
        System.out.println(now.get(ChronoField.YEAR));
        System.out.println(now.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(now.get(ChronoField.DAY_OF_MONTH));
        System.out.println(now.get(ChronoField.DAY_OF_WEEK));
        //3.日期的设置
        //3.1.定位到指定的时间节点：with
        //把当前时间改为2022年的5月1日
        now = now.withYear(2022);
        now = now.withMonth(5);
        now = now.withDayOfMonth(1);
        System.out.println(now);
        now = now.with(ChronoField.YEAR,2023);
        now = now.with(ChronoField.MONTH_OF_YEAR,Month.MARCH.getValue());
        now = now.with(ChronoField.DAY_OF_MONTH,24);
        System.out.println(now);
        //3.2.进行时间的偏移
        //把时间往过去走5年零10天，看看是哪天
        now = now.plus(-5, ChronoUnit.YEARS);
        now = now.plus(-10, ChronoUnit.DAYS);
        System.out.println(now);
        //把日期往未来走三周
        now = now.plusWeeks(3);
        System.out.println(now);
        //4.字符串和日期的转换
        //4.1.使用默认的格式来进行转换成LocalDate
        String str = "2020-12-14";
        LocalDate parseDate = LocalDate.parse(str);
        System.out.println(parseDate);
        //4.2.使用自定义的格式来转换成LocalDate
        str = "2020年12月14日";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        parseDate = LocalDate.parse(str,dtf);
        System.out.println(parseDate);
        //4.3.把LocalDate对象转为指定格式的字符串
        String strDate = now.format(dtf);
        System.out.println(strDate);
        dtf = DateTimeFormatter.ofPattern("yyyy呵呵MM哈哈dd吼吼");
        strDate = now.format(dtf);
        System.out.println(strDate);
    }
}

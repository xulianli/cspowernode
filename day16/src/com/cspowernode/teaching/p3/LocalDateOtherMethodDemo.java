package com.cspowernode.teaching.p3;

import java.time.LocalDate;
import java.time.Period;

/**
 * @Author 汪洋
 * @Date 2023/3/24 17:07
 * @Description
 * LocalDate其他有可能用到的方法
 * 1.判断日期在前面还是在后面
 *  a.isBefore
 *  b.isAfter
 * 2.判断年份是否是闰年
 *  isLeapYear
 * 3.进行判断两个日期之间的差值
 *  Period period = localDate.until(LocalDate date);
 *  注意：
 *      a.差值是参数减调用该方法的对象；
 *      b.获取到的Period对象里面有各种getXXX方法来获取具体的时间单位的差值
 * 4.获取到从1970年1月1日到现在的天数
 *  toEpochDay()
 *
 */
public class LocalDateOtherMethodDemo {
    public static void main(String[] args) {
        //1.判断日期在前还是在后
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2020,2,2);
        System.out.println(date1.isAfter(date2));
        System.out.println(date1.isBefore(date2));
        //2.判断年份是否是闰年
        System.out.println(date1.isLeapYear());
        //3.获取到两个LocalDate对象中间的差值-->Period对象
        Period period = date1.until(date2);
        //3.1.可以通过Period里面的getXXX来获取到具体的差值
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());
        //4.计算从当前日期到1970年1月1日的天数差值
        long days = date1.toEpochDay();
        System.out.println(days);
    }
}

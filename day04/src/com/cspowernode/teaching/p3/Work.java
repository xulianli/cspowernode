package com.cspowernode.teaching.p3;

import java.util.Scanner;

/**
 * @author 汪洋
 * @Date 2023/3/7 15:06
 * @Description
 * 1.通过Scanner拿到时分秒三个变量；
 * 2.判定时分秒是否在24小时制、60分钟制、60秒钟制的范围内，如果超出了这个范围，那么对其取余，重新
 * 得到一个新的值，比如你输入小时是60，那么60超出了24范围，所以对24取余得到结果为12，就代表小时
 * 就是12，其他的分钟和秒钟类似该操作；
 * 3.对秒钟进行加1，然后判断该秒钟是否等于60，如果等于，那么让分钟加1，并且让秒钟归0，同理，再
 * 对分钟进行判断是否等于60，如果等于60，那么让小时加1，并且让分钟归0，同理，再对小时进行判断是否
 * 等于24，如果等于24，那么让其归零；
 * 4.把按照前三步处理之后的时分秒拼接展示出来即可，如果你想展示的美观一些，可以继续判断值是否小于
 * 10，小于10，就在前面拼个0，否则直接展示；
 */
public class Work {
    public static void main(String[] args) {
//        1. 通过Scanner拿到时分秒三个变量；
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小时,分钟,秒钟(使用空格隔开):");
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();
//        2. 判定时分秒是否在24小时制、60 分钟制、60 秒钟制的范围内，如果超出了这个范围，那么对其取余，重新
//        得到一个新的值，比如你输入小时是60，那么60超出了24范围，所以对24取余得到结果为12，就代表小时
//        就是12，其他的分钟和秒钟类似该操作；
        hour = hour>=24?hour%24:hour;
        minute = minute>=60?minute%60:minute;
        second = second>=60?second%60:second;
//        3. 对秒钟进行加1，然后判断该秒钟是否等于60，如果等于，那么让分钟加1，并且让秒钟归0，同理，再
//        对分钟进行判断是否等于60，如果等于60，那么让小时加1，并且让分钟归0，同理，再对小时进行判断是否
//        等于24，如果等于24，那么让其归零；
        second++;
        if (second==60) {
            minute++;
            second = 0;
            if(minute==60){
                hour++;
                minute = 0;
                if(hour==24){
                    hour = 0;
                }
            }
        }
//        4. 把按照前三步处理之后的时分秒拼接展示出来即可，如果你想展示的美观一些，可以继续判断值是否小于
//        10，小于10，就在前面拼个0，否则直接展示；
        System.out.println((hour<10?"0"+hour:hour)+":"+(minute<10?"0"+minute:minute)+":"+(second<10?"0"+second:second));
    }
}

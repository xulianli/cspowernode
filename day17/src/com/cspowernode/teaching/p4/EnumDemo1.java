package com.cspowernode.teaching.p4;

import javax.swing.*;
import java.util.Random;

/**
 * @Author 汪洋
 * @Date 2023/3/25 15:25
 * @Description
 * 枚举的介绍及在Switch中的使用
 * 0.前言
 *  在我们前面的学习过程中，有两个地方跟枚举有关
 *  a.switch语句中，我们可以在里面放枚举类型
 *  b.工厂设计模式的时候，最后进行了优化了之后其实发现获取对象所传递的参数仍然可以乱写
 * 1.什么是枚举
 *  所谓枚举其实就是一种特殊的类，使用enum来替换class关键字，该类默认继承java.lang.Enum父类，它
 *  的作用就是把你想使用的数据在一个类里面进行汇总，并且只允许使用这里面的数据；
 *  枚举是JDK1.5的时候出来的一个新特性，为了优化代码，帮助我们来约束数据；
 * 2.枚举有什么特点
 *  a.枚举里面一定要定义常量(类似于常量，本质上并不是常量)，哪怕你不写你都要单独留空出来
 *  b.枚举中的这些所谓的常量其实是调用该类的构造函数
 *  c.枚举中的这些常量默认省略了public static final修饰词，并且不需要你给予它值，而且
 *  它的展示样子就是常量名
 *  d.除了这种特殊的常量之外，其他地方和类一样，一般情况下，都会让构造函数私有化，而是通过
 *  常量的形式来访问构造函数
 * 3.枚举的几个使用场合
 *  a.switch语句中，可以不用使用default，因为会约束里面的所有数据
 *  b.可以使用在属性的类型上从而约束你传入该类型的值
 *  c.可以优化单例设计模式
 *  d.优化工厂设计模式
 *  e.把枚举对象应用到日常类里面使用-->综合
 */
public class EnumDemo1 {
    public static void main(String[] args) {
        //所有的枚举里面都可以调用values这个方法，它会默认得到所有的枚举常量的数组
        Season[] values = Season.values();
        Season season = values[new Random().nextInt(values.length)];
        System.out.println(season);
        switch(season){
            case SPRING:
                System.out.println("春意盎然");
                break;
            case SUMMER:
                System.out.println("夏日炎炎");
                break;
            case AUTUMN:
                System.out.println("秋风索索");
                break;
            case WINTER:
                System.out.println("白雪皑皑");
                break;
        }
    }
}
enum Season{
    SPRING,SUMMER,AUTUMN,WINTER
}
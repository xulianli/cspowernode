package com.cspowernode.teaching.p5;

import com.cspowernode.teaching.p5.t1.Test;

import java.util.Random;
import java.util.Scanner;
//import java.util.*;

/**
 * @Author 汪洋
 * @Date 2023/3/16 16:57
 * @Description
 * 1.package
 *  a.代表声明当前的类在哪个具体的位置，Java中是允许同名的类在不同包下存在的；
 *  b.声明之后如果其他的类要使用某个类的话，就需要通过import+package声明+类名来进行使用；
 *  注意：package指令都位于Java中的第一行；
 * 2.import
 *  a.代表告诉JVM你要使用的外部类的完整路径，方便JVM去解析该类让你进行使用；
 *  b.Java文件中可以同时出现N多个import命令，如果多个类在同一个包下，我们可以使用*号来统配
 *  这些同一个包下的所有类
 *  c.正常情况下，如果有2个不同包下但是类名相同的类，那么我们是只能使用其中一个的,如果你真想同时
 *  使用，那么我们就不用使用import指令，而是直接在类前面把完整路径写出来进行使用
 */
public class Main {
    public static void main(String[] args) {
        Test t1 = new Test();
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        //java.util下面的Date
        java.util.Date date1 = new java.util.Date();
        //java.sql下面的Date
        java.sql.Date date2 = new java.sql.Date(1232131);
    }
}

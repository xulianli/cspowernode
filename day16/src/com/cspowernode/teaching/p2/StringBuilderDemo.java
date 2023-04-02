package com.cspowernode.teaching.p2;

/**
 * @Author 汪洋
 * @Date 2023/3/24 14:33
 * @Description
 * StringBuilder的使用
 * 0.前言
 *  在学习String类的时候，我们知道底层是final修饰的char数组，所以你对字符串的任何操作本质上都是对
 *  该数组的操作，而数组又不让操作，于是就会不断构建出新的对象出来，那么你操作的频繁了就会导致内存
 *  里面产生大量的废弃String对象，从而降低内存的使用效率，基于这个原因Sun公司推出了底层是可变数组
 *  的字符串操作对象：StringBuffer和StringBuilder
 * 1.StringBuilder和StringBuffer相比String而言有哪些好处
 *  a.因为是不可变数组，所以每次操作都不需要返回，可以直接一直调用方法往下走；
 *  b.因为是不可变数组，所以频繁操作效率更高
 *  c.在保留了String类的一些常见方法之外，还特意提供了针对字符串的增删改方法
 * 2.StringBuilder中的一些增删改方法
 *  a.append(String newStr):在原有字符串后面追加新的子串
 *  b.delete(int startIndex,int endIndex):删除指定范围内的字符串，注意，包前不包后
 *  c.deleteCharAt(int index):删除指定下标的字符
 *  d.insert(int index,int option):在指定位置插入元素
 *  e.setCharAt(int index,char c):把指定位置的字符替换成另外一个
 * 3.String和StringBuilder的转换
 *  a.String-->StringBuilder:new StringBuilder(String str);
 *  b.StringBuilder-->String:构造函数、toString()
 * 4.StringBuilder和StringBuffer的区别
 *  a.StringBuffer在StringBuilder出现之前，然后StringBuilder是用来替代StringBuffer的；
 *  b.StringBuffer是一个多线程安全、同步、速度慢的类；
 *  c.StringBuilder是一个多线程不安全、异步、速度快的类;
 * 面试题：String、StringBuilder和StringBuffer的区别
 *  a.底层数组是否可变
 *  b.API方法的区别
 *  c.多线程是否安全等
 *
 * 练习：使用System.currentTimeMillis()来计算String、StringBuilder和StringBuffer这三个类在10W次拼接运算
 * 的效率差别
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        //1.把字符串转为StringBuilder
        StringBuilder sb = new StringBuilder("abcdefghijk");
        //2.演示一些常见操作
        sb.append("xxx").append("ooo").append("yyy").deleteCharAt(sb.indexOf("x")).
                delete(sb.indexOf("o"),sb.lastIndexOf("o")+1).insert(sb.indexOf("k"),6).
                setCharAt(sb.indexOf("6"),'9');
        //3.把StringBuilder转回字符串
        String str = sb.toString();
        System.out.println(str);
        //获取到从1970年1月1日0时0分0秒到现在的毫秒数
        long time = System.currentTimeMillis();
        System.out.println(time);
    }
}

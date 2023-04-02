package com.cspowernode.teaching.p2;

import java.io.UnsupportedEncodingException;

/**
 * @Author 汪洋
 * @Date 2023/3/24 10:43
 * @Description
 * String类的使用
 * 1.String类的底层是一个不可变的char数组，那么我们对字符串的增删改任意操作都会返回一个新的字符串，那么
 * 也就意味着如果你要频繁操作字符串的话，效率是比较低的；所以频繁的字符串操作我们要使用StringBuilder或者
 * 是StringBuffer；
 * 2.String类的构建方式
 *  a.String s = new String("xxx");
 *  b.String s = "xxx";
 *  c.String s = new String(char [] arr);
 *  d.String s = new String(byte [] arr[,String charset])
 *  e.String s = new String(StringBuilder sb)
 *  f.String s = new String(StringBuffer sb)
 * 3.字符串常量池
 *  a.在方法区里面有一个区域，该区域专门用来存放字符串的常量，并且里面的常量是唯一的；
 *  b.我们在定义字符串的时候，如果你是直接写的字符串的话("abc")，那么该数据会先去常量池中寻找是否
 *  存在该字符串，如果存在则指向池中的对象，否则创建并指向；
 *  c.如果我们定义的时候用的是构造函数来创建对象的话，那么此时就会先去池中寻找是否存在该对象，如果
 *  存在则创建一个在堆中并指向它，如果不存在，则创建一个在池中，然后复制一份到堆中并指向它；
 *  面试题：String s = new String("xxx");创建了几个对象
 *  问题：请问如何把指向堆中的对象换到池中来：intern()
 * 4.字符串转码的方式
 *  a.字符串对象.getBytes()把字符串转为最原始的byte数组状态；
 *  b.new String(byte [] arr,String charset)来完成指定编码集的转码操作
 */
public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //1.String中的构造函数
        //1.1.创建空串的两种方式
        String s1 = new String();
        String s2 = "";
        //1.2.创建一个指定内容的字符串
        String s3 = new String("abc");
        String s4 = "abc";
        System.out.println(s3==s4);
        s3 = s3.intern();
        System.out.println(s3==s4);
        //1.3.char数组和字符串之间的互转
        String s5 = "abcd";
        char [] arr1 = s5.toCharArray();
        String s6 = new String(arr1);
        //1.4.byte数组和字符串之间的互转
        String s7 = "中国你好";
        byte [] arr2 = s7.getBytes();
        //因为我们设置的项目中默认编码格式是UTF-8，所以如果这里使用gbk来解码的话，那么就会出现乱码
//        String s8 = new String(arr2,"GBK");
        String s8 = new String(arr2,"utf-8");
        System.out.println(s8);
    }
}

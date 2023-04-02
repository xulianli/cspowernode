package com.cspowernode.teaching.p2;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

/**
 * @Author 汪洋
 * @Date 2023/3/24 11:26
 * @Description
 * 字符串的方法
 * 1.查找类方法
 *  a.length():长度
 *  b.charAt(int index):获取指定下标所对应的元素
 *  c.indexOf(String str):获取指定元素对应的下标
 *  d.lastIndexOf(String str):从后往前来获取指定元素对应的下标
 *  e.startsWith(String str):是否以什么字符串开头
 *  f.endsWith(String str):是否以什么字符串结尾
 *  g.contains(String str):是否包含某个字符串
 *  h.subString(int index[,int endIndex]):截取
 * 2.转换类方法
 *  a.toCharArray():转char数组
 *  b.getBytes():转byte数组
 *  c.toUpperCase()/toLowerCase():大小写转换
 *  d.split(String str):把字符串中能够跟str匹配的地方进行截取，返回String数组
 *  e.replace(String oldStr,String newStr):把字符串中和oldStr相同的地方替换成newStr
 *  f.trim():去前后的空白，空白包含空格、制表符、回车
 *  g.concat(String str):和参数进行拼接
 * 3.其他方法
 *  a.isEmpty():是否长度为0
 *  b.valueOf():把其他类型转为字符串
 *  c.compareTo(String other):Comparable所提供的要重写的方法，代表比较规则
 *  d.equals(String str):比较两个字符串内容是否相同
 *  e.intern():把当前字符串对象转为池中的对象
 * 4.正则表达式的方法--->JavaScript阶段会专门讲解
 *  a.matcher(String regex):判断当前字符串是否匹配后面的规则
 *  b.split(String regex):把字符串按照指定的规则来切割
 *  c.replaceAll(String regex,String newStr):把字符串中符合规则的部分替换成新的字符串
 */
public class StringAPIDemo {
    public static void main(String[] args) {
        String src = "abcdefgbfg";
        //startsWith
        System.out.println(src.startsWith("abc"));
        //endsWith
        System.out.println(src.endsWith("bfg"));
        //contains
        System.out.println(src.contains("eg"));
        //replace
        src = src.replace("g","x");
        System.out.println(src);
        //concat
        src = src.concat("ggg");
        System.out.println(src);
        //trim
        String str = "   a b c\t\n";
        System.out.println(str.length());
        System.out.println(str.trim().length());
        //matches
        String s1 = "1abcda";
        System.out.println(s1.matches("[0-9][a-z]{1,5}"));
        //写一个匹配邮政编码的正则
        String regex = "[1-9][0-9]{5}";
        //split
        String s2 = "ab112c2321d343212321e4543543f";
        String [] arr = s2.split("\\d+");//[0-9]
        System.out.println(Arrays.toString(arr));
    }
}

package com.cspowernode.teaching.p1;

/**
 * @author 汪洋
 * @Date 2023/3/6 11:20
 * @Description
 * 字符串类的使用
 * 1.字符串类它的底层其实就是字符数组
 * 2.字符串的定义方式
 *  String 变量名 = "字符串的内容";
 * 3.基本数据类型和引用数据类型存储数据最大的区别是基本数据类型数据存在栈中间，引用数据类型
 * 数据存在堆中间；我们区分的方式很简单，只要构建的变量等号右边是有new这个英语单词的就是引用
 * 数据类型，字符串有一个优化可以不用new
 * 4.字符串怎么使用
 *  a.求出字符串的长度：length()
 *  b.求出字符串里面某个字符：charAt(int index)
 *  c.求出字符串中指定字符所在的位置：indexOf(String childStr)
 *  d.从后往前来寻找字符串所在的位置：lastIndexOf(String childStr)
 *  e.从指定的字符串中截取一个子串出来：subString(int startIndex,int endIndex)
 *  f.字符串的拼接：+
 *  注意：如果你要寻找的子串不存在，则会返回-1
 *  注意：截取遵循包前不包后
 * 5.字符串并不能描述所有的内容，那么有些不能正常使用双引号来描述出来的内容，我们就需要使用
 * 特殊的方式来描述，这种特殊的方式就固定几种，我们把它们称之为转义字符
 *  a.\"-->表示一个双引号
 *  b.\n\r-->表示回车，其中\n是windows的，\r是linux的，我们一般一起写，就都可以兼顾
 *  c.\t-->表示制表符tab键，代表3个空格
 *  d.\'-->表示在字符的定义里面来代表一个单引号
 *  e.\\-->表示一个反斜杠
 */
public class StringDemo {
    public static void main(String[] args) {
        String src = "abcdecfgfdsafdsafdsaf";
        //1.获取到它的长度
        int a = src.length();
        System.out.println(a);
        //简化
        System.out.println(src.length());
        //2.获取到指定的字符
        char c = src.charAt(7);
        System.out.println(c);
        //快速获取最后一个元素
        System.out.println(src.charAt(src.length()-1));
        //3.寻找指定的字符串的下标
        int findIndex = src.indexOf("fd");
        System.out.println(findIndex);
        //4.从后往前寻找字符串的下标
        findIndex = src.lastIndexOf("fd");
        System.out.println(findIndex);
        //5.截取
        String newStr = src.substring(3,6);
        System.out.println(newStr);
        //6.截取和寻找指定的字符串结合起来：请截取从c到e的字符串
        int startIndex = src.indexOf("c");
        int endIndex = src.indexOf("e")+1;
        newStr = src.substring(startIndex,endIndex);
        System.out.println(newStr);
        //7.简化这个过程--->先算最里面的方法，再依次往外面来运算
        newStr = src.substring(src.indexOf("c"),src.indexOf("e")+1);
        System.out.println(newStr);
        //8.拼接:所有和字符串的+号都是拼接运算
        String s1 = "abc";
        String s2 = s1+123;
        System.out.println(s2);
        String s3 = 1+2+'a'+"bc"+'a';
        System.out.println(s3);
        //9.使用转义字符
        String s4 = "a\t\"b\"\tc" +
                "\t\td\te\n\rf\\";
        System.out.println(s4);
        char s5 = '\'';
    }
}

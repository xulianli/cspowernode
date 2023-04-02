package com.cspowernode.teaching.p1;

/**
 * @Author 汪洋
 * @Date 2023/3/24 9:23
 * @Description
 * 包装类的使用
 * 1.有了基本数据类型为什么还要有包装类
 *  按照面向对象的思想来看，所有的对象都应该存在对应的类，而基本数据类型恰好是没有类的一种，我们需要
 *  让其也按照面向对象的思想来构建，并且提供一些针对基本数据类型的方法方便我们操作；
 * 2.包装类的作用
 *  a.提供一些操作方法
 *  b.提供给一些只支持类而不支持类型的场合，比如泛型<Student>
 * 3.包装类和基本数据类型的对应关系
 *  a.int-->Integer
 *  b.char-->Character
 *  c.其他的就是首字母大写
 * 4.熟悉一些包装类的常用方法
 *  a.获取到一些常量信息
 *  b.熟悉基本数据类型和包装类的转换方法
 *      ①.基本数据类型转为包装类
 *          1.构造函数
 *          2.valueOf
 *      ②.包装类转为基本数据类型
 *          XXXValue
 *  c.字符串和基本数据类型的转换
 *      ①.字符串转为基本数据类型
 *          包装类.parseXXX("")--->Integer.parseInt("123");Long.parseLong("123")
 *      ②.字符串转为包装类
 *          构造函数("")
 *      ③.包装类转为字符串--->一般不用
 *          toString
 *      注意：有可能会出现异常NumberFormatException
 * 5.从JDK1.5开始，就提供了一些自动转换
 *  a.自动装包：自动把基本数据类型转为包装类
 *  b.自动拆包：自动把包装类型转为基本数据类型
 *  注意：虽然现在已经可以支持自动转换了，但是本质上仍然是在调用XXXXValue和valueOf方法
 * 6.有些可能有用的方法
 *  a.max、min
 *  b.toHexString、toOctalString、toBinaryString
 *  c.isLetter、isDigit、isLetterOrDigit、isUpperCase、toUpperCase....
 */
public class WrapperClassDemo {
    public static void main(String[] args) {
        //1.了解一些常量
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        //2.完成基本数据类型和包装类的转换
        //2.1.基本数据类型转为包装类
        int a1 = 10;
        int a2 = 20;
        Integer b1 = new Integer(a1);
        Integer b2 = Integer.valueOf(a2);
        //2.2.包装类转为基本数据类型
        a1 = b1.intValue();
        //3.包装类和字符串的转换
        String s1 = "123";
        int a3 = Integer.parseInt(s1);
        //4.自动装拆包
        Integer b3 = a1;//自动装包
        int a4 = b3;//自动拆包
        //本质上仍然调的是手动转换的方法，所以下面会报异常
//        Integer b4 = null;
//        int a5 = b4;
    }
}

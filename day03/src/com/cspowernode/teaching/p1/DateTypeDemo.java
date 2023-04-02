package com.cspowernode.teaching.p1;

import java.math.BigDecimal;
import java.sql.SQLOutput;

/**
 * @author 汪洋
 * @Date 2023/3/6 9:09
 * @Description
 * java的数据类型
 * 1.所谓数据类型指的是在内存中存储的数据它所使用的内存空间，Java把这些数据类型分为了两大类，分别是
 * 预定义了固定空间大小的基本数据类型和根据我们实际情况会发生变化的引用数据类型；
 * 2.基本数据类型
 *  a.整型：byte short int long--->如果long还不够就用BigInteger
 *  b.浮点型：float double
 *  c.布尔类型：boolean
 *  d.字符类型：char
 * 3.引用数据类型
 *  a.字符串
 *  b.数组
 *  c.自定义类
 * 4.整型的使用
 *  a.每个类型都定义了固定的大小，那么你的数据值一旦大于该指定的大小，会造成数据的溢出，想象一下你拿着
 *  一个小瓶盖来装一瓶水会怎么样；
 *  b.int类型是整型中的默认类型
 *  c.byte类型和short类型在定义数据的时候，只要数据在其类型的范围内，都会进行优化，不会默认为int类型；
 *  d.int类型的最大值就是21亿出头，所以你如果为int类型赋值的数据超过了21亿，就会报错；
 *  e.可以使用4种不同的进制来表示整型--->略
 * 5.浮点型的使用
 *  a、在Java中浮点型可以使用直接写小数点以及使用科学计数法来进行书写；
 *  b、Java中的浮点型默认类型是double，所以如果你想使用float的值，请在后面加大小写的F
 *  c、float的取值范围大概是小数点后面7位，double的取值范围大概是16位；
 *  d、浮点型在内存中的存储是拆开存储的，整数存在一个地方，小数存在一个地方；
 *  e、浮点型不建议进行高精度的算术运算，因为容易出现误差--->如果你要求精度高，就使用BigDecimal
 * 6.布尔类型的使用
 *  a、布尔类型就只有2个值：true和false
 *  b、在Java中很少直接去定义一个boolean类型然后给其进行赋值为true和false，因为boolean类型的值
 *  一般都是出现在if...for...while这些有条件判断的语句中，用来判断条件是否满足，所以很多时候，我们
 *  都习惯直接把表达式写进去，而不是先得到一个boolean类型的结果，再把结果放进去
 *  c、布尔类型到底占据多大的内存空间，那么在Sun公司的文档里面是没有说明的，我们有几种说法
 *      ①.占据一个Bit位
 *      ②.占据一个byte大小
 *      ③.占据一个int大小
 *
 * 多行注释快捷键：shift+ctrl+/
 */
public class DateTypeDemo {
    public static void main(String[] args) {
        //1.数据溢出
        //1.1.直接在=号右边写大于byte类型最大值的数据
        byte a = (byte) 228;
        System.out.println(a);
        //1.2.定义一个int类型的数据，然后再把这个数据的变量赋给byte类型
        int b = 200;
        byte c = (byte) b;
        System.out.println(c);
        //2.byte和short类型的数据优化
        byte d = 127;
//        short e = 32768;
        //3.int类型的赋值超过21亿
//        int f = 3000000000;
        //4.哪怕我们使用long类型来接收，等号右边也不能写超过int最大值的数字，除非加上L
        long g = 3000000000L;
        //5.Java中的小数点书写方式
        float f1 = 3.14f;
        float f2 = 314E-2F;
        System.out.println(f1);
        System.out.println(f2);
        //6.取值范围
        float f3 = 1.234567890123456789f;
        double f4 = 1.234567890123456789d;
        System.out.println(f3);
        System.out.println(f4);
        //7.浮点型的算术运算
        System.out.println(1.0/0);//Infinity-->正无穷大
        System.out.println(3-2.9);//0.10000000000000009
        //8.布尔类型的使用
        int age = 21;
        //我们一般都不这样定义
        /*boolean flag = age>19;
        if(flag){
            System.out.println("你的年龄已经大于19岁了");
        }else{
            System.out.println("你还没有19岁");
        }*/
        //更加习惯这样定义
        if(age>19){
            System.out.println("你的年龄已经大于19岁了");
        }else{
            System.out.println("你还没有19岁");
        }
    }
}

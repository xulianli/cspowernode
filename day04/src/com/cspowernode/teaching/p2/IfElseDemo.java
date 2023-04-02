package com.cspowernode.teaching.p2;

/**
 * @author 汪洋
 * @Date 2023/3/7 11:36
 * @Description
 * 流程控制语句--->if..else的使用
 * 1.Java中的程序执行流程分成三类
 *  a.顺序执行-->从上到下执行，每一行都会被执行
 *  b.条件执行-->总有可能某些代码不会被执行
 *  c.循环执行-->总有可能某些代码会执行至少2次
 * 2.条件结构
 *  a.if..else--->适配所有条件判断的场合
 *  b.switch..case--->只配等值判断的场合
 * 3.if..else的几种写法
 *  a.if单边结构
 *  b.if..else双边结构
 *  c.if..(else if)*..else多边结构
 * 4.if..else使用过程中需要注意的事项
 *  a.所有带大括号的地方，如果大括号里面的代码只有一行，那么该大括号可以省略，但是不建议，因为阅读性差
 *  b.弄清楚带else的和不带else的多边结构的区别
 * 注意：字符串判断相等的方式使用equals方法来判断，比如：
 *  String s1 = "abc"
 *  String s2 = "abc"
 *  if(s1.equals(s2))
 */
public class IfElseDemo {
    public static void main(String[] args) {
        //1.单边结构-->使用频率不是非常高，往往是简化双边结构的时候使用
        int age = 19;
        if(age!=18){
            System.out.println("你的年龄不是18岁，不要过来，这里只要18岁的青年");
        }
        //2.双边结构
        String sex = "女";
        if("男".equals(sex)){
            System.out.println("你是个男人");
        }else{
            System.out.println("你是个女人");
        }
        //3.多边结构
        if("男".equals(sex)){
            System.out.println("你是个男人");
        }else if("女".equals(sex)){
            System.out.println("你是个女人");
        }else if("人妖".equals(sex)){
            System.out.println("你是个人妖");
        }else{
            System.out.println("我也不知道你是什么人");
        }
        //4.所有的大括号里面如果只有一行代码，那么大括号可以省略
        /*if("男".equals(sex))
            System.out.println("你是个男人");
            //因为省略了大括号里面默认只有一行，所以报错
            System.out.println("你是个男人");
        else
            System.out.println("你是个女人");*/
        if("男".equals(sex)) {
            System.out.println("你是个男人");
        }
        System.out.println("你是个男人");
        //上面的代码是正常的写法，但是会被别人故意写成下面的写法来误导你
        if("男".equals(sex))
            System.out.println("你是个男人");
            System.out.println("你是个男人");
        System.out.println("===================================================");
        //带else的结构和不带else结构的区别
        //带else if的结构，只要满足了其中一个条件，那么剩下的else结构将都不再进行判断
        if("男".equals(sex)){
            System.out.println("你是个男人");
        }else if("女".equals(sex)){
            System.out.println("你是个女人");
        }else if("人妖".equals(sex)){
            System.out.println("你是个人妖");
        }else if("其他".equals(sex)){
            System.out.println("你是个其他");
        }else{
            System.out.println("我也不知道你是什么人");
        }
        //不带else，由多个if组成的结构，它是不管你是否已经满足条件，后面的每次判断都会执行
        if("男".equals(sex)){
            System.out.println("你是个男人");
        }
        if("女".equals(sex)){
            System.out.println("你是个女人");
        }
        if("人妖".equals(sex)){
            System.out.println("你是个人妖");
        }
        if("其他".equals(sex)){
            System.out.println("你是个其他");
        }else{
            System.out.println("我也不知道你是什么人");
        }
    }
}

package com.cspowernode.teaching.p2;

/**
 * @Author 汪洋
 * @Date 2023/3/14 15:47
 * @Description
 * 根据现实生活中的学生情况来抽象出学生的共同特性以及行为动作
 * 1.共同特性：--->属性、全局变量、成员属性
 *  a.姓名
 *  b.年龄
 *  c.性别
 *  d.学号
 *  e.成绩
 *  注意：属性是不用赋值的，如果你赋值了就代表这个属性的默认值为某个值；
 * 2.行为动作：--->方法、成员方法
 *  a.学习
 *  b.吃
 *  c.睡觉
 *  d.考试
 *  注意：类中的方法具体要不要参数，要几个参数以及要不要返回类型这些都是跟具体
 *  的题意相关的，没有指定的写法
 */
public class Student {
    //属性
    String name;
    int age;
    //如果在定义属性的时候就直接给值，就代表这个属性不赋值也会有指定的默认值
    String sex = "女";
    int sid;
    double score;
    //方法
    public void study(){
        System.out.println(name+"正在学习");
    }
    public void eat(String foodName){
        System.out.println(name+"正在吃"+foodName);
    }
    public void sleep(){
        System.out.println("睡得真香");
    }
    public double exam(){
        return 95;
    }
}

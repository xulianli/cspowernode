package com.cspowernode.teaching.p4;

/**
 * @author 汪洋
 * @Date 2023/3/6 17:14
 * @Description
 * 逻辑运算符的使用
 * 1.逻辑运算符主要是把之前条件判断从一个变成同时判定两个，它主要包含如下三种情况：
 *  a、逻辑与：&-->判断的依据要求两者都为true，结果为true，否则结果为false
 *  b、逻辑或：|-->判断的依据是两者其中一个为true，结果就为true
 *  c、逻辑非：!-->当前取反
 */
public class OperatorDemo2 {
    public static void main(String[] args) {
        int age = 25;
        char sex = '女';
        //条件：要么你性别是女，要么你是2岁及以下的男童，否则不准进入女厕所
        if(age<=2&sex=='男'){
            System.out.println("你可以上女厕所");
        }else{
            System.out.println("你不能上女厕所");
        }
        //可以通过&来取区间值，比如取年龄在20-30内的人群
        if(age>=20&age<=30){
            System.out.println("你的年龄在20~30范围内");
        }
        //条件：你要么性别是女，要么是2岁以下的男童，否则不能进女厕所
        if(sex=='女'|(sex=='男'&age<=2)){
            System.out.println("你可以上女厕所");
        }else{
            System.out.println("你不能上女厕所");
        }
        //可以通过|来取两端的值，比如年龄不能小于0或者大于100都不满足
        if(age<0|age>100){
            System.out.println("您的年龄非法");
        }
        if(!(sex=='男')){
            System.out.println("你是男性");
        }else{
            System.out.println("你是女性");
        }
    }
}

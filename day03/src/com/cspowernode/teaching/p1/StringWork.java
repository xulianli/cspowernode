package com.cspowernode.teaching.p1;

/**
 * @author 汪洋
 * @Date 2023/3/6 14:44
 * @Description
 * 练习题1：分别定义人的名字、年龄、性别、班级、分数这几个变量，类型你自己看着办，然后通过一句话把他们拼接在一起，比如
 * 张三是计科3班的学生，他是男性，今年19岁，这个学期Java成绩是97分；
 * 练习题2：在上面这道题的基础上再来求出这个人姓什么，以及他的分数是几位数；
 */
public class StringWork {
    public static void main(String[] args) {
//        work1();
        work2();
    }

    private static void work2() {
        String name = "张三";
        int age = 19;
        char sex = '男';
        String clazz = "计科3班";
        double score = 97;//97.0
        //通过字符串的运用来去掉小数点
//        String strScore = score+"";
//        strScore = strScore.substring(0,strScore.indexOf("."));
        //通过数据溢出的形式来抹掉小数
        int letterScore = (int) score;
        String strScore = letterScore+"";
        System.out.println(name+"是"+clazz+"的学生，他是"+sex+"性，今年"+age+"岁，这个学期Java成绩是"+score+"分,他姓"+name.charAt(0)+",它的" +
                "得分是"+strScore.length()+"位数");
    }

    private static void work1() {
        String name = "张三";
        int age = 19;
        char sex = '男';
        String clazz = "计科3班";
        double score = 97;
        System.out.println(name+"是"+clazz+"的学生，他是"+sex+"性，今年"+age+"岁，这个学期Java成绩是"+score+"分");
    }
}

package com.cspowernode.teaching.p2;

/**
 * @Author 汪洋
 * @Date 2023/3/14 15:56
 * @Description
 * 测试类，在该类中通过之前构建的Student模板类来构建多个不同的具体Student对象
 * 1.对象和类的关键是多对一的关系；
 * 2.类代表统称，代表一种类型，是泛指，比如人类、狗类等等，而对象是具体化的事务
 * 它是通过类来构建出来的每个属性都明确化的个体，比如张三、李四或者是某个具体的
 * 人物；
 * 3.构建对象的方式：--->实例化
 *  类名 变量名 = new 类名();
 *  注意：类名()我们之前讲过，它是
 * 4.构建对象之后如何为属性进行分别的赋值：变量名.属性名 = 值；
 * 5.对象如何调用属性和方法：变量名.属性名/方法名;
 */
public class StudentDemo {
    public static void main(String[] args) {
        //1.需求里面要你构建几个对象，你就new几次
        Student stu1 = new Student();
        Student stu2 = new Student();
        //2.对象构建出来之后，需要为对象的属性进行赋值
        stu1.name = "zhangsan";
        stu1.sid = 1001;
        stu1.age = 19;
        stu1.sex = "男";
        stu1.score = 95;

        stu2.name = "wangwu";
        stu2.sid = 1002;
        stu2.age = 21;
        stu2.score = 92;
        //3.使用该对象来调用你赋值之后的属性进行查看或者调用方法
        System.out.println(stu1.name+","+stu1.sid+","+stu1.sex+","+stu1.age+","+stu1.score);
        System.out.println(stu2.name+","+stu2.sid+","+stu2.sex+","+stu2.age+","+stu2.score);
        System.out.println(stu1.exam());
        stu2.study();
    }
}

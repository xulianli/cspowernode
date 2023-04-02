package com.cspowernode.teaching.p2;

/**
 * @Author 汪洋
 * @Date 2023/3/16 14:06
 * @Description
 * 4.定义一个表示学生信息的类 Student，要求如下：
 * （1）类 Student 的属性如下：
 * sNO  表示学号； sName 表示姓名； sSex 表示性别； sAge 表示
 * 年龄；sJava：表示 Java 课程成绩。
 * （2）类 Student 带参数的构造方法：
 * 在构造方法中通过形参完成对成员变量的赋值操作。
 * （3）类 Student 的方法成员：
 * getNo（）：获得学号；
 * getName（）：获得姓名；
 * getSex（）：获得性别；
 * getAge（）获得年龄；
 * getJava（）：获得 Java  课程成绩
 * （4）  根据类 Student 的定义，创建五个该类的对象，输出每个学生的信息，计算并输出这五个学生 Java 语言成绩的平均值，
 * 以及计算并输出他们 Java 语言成绩的最大值和最小值。
 */
public class StudentDemo {
    public static void main(String[] args) {
        /*//1.根据题意定义5个Student对象
        Student s1 = new Student(1001,"zhangsan1","男",21,95);
        Student s2 = new Student(1002,"zhangsan2","男",22,93.5);
        Student s3 = new Student(1003,"zhangsan3","女",23,98);
        Student s4 = new Student(1004,"zhangsan4","男",20,90.8);
        Student s5 = new Student(1005,"zhangsan5","女",22,91);
        //2.把这些student对象放入到一个数组中去
        Student [] students = {s1,s2,s3,s4,s5};*/
        //1.使用匿名对象的形式来把这些数据一次性放入到数组中去
        Student [] students = {
                new Student(1001,"zhangsan1","男",21,95),
                new Student(1002,"zhangsan2","男",22,93.5),
                new Student(1003,"zhangsan3","女",23,98),
                new Student(1004,"zhangsan4","男",20,90.8),
                new Student(1005,"zhangsan5","女",22,91)
        };
        //3.定义相关的变量
        double sum = 0;
        double max = 0;
        double min = 100;
        //4.进行循环
        for (Student student : students) {
            //5.通过循环并判断最值以及累加得到和
            if(student.getsJava()>max){
                max = student.getsJava();
            }
            if(student.getsJava()<min){
                min = student.getsJava();
            }
            sum += student.getsJava();
        }
        //6.输出结果
        System.out.println("学生的总分数为:"+sum+",平均分为:"+sum/students.length+",最高成绩是："+max+",最低成绩是:"+min);
    }
}
class Student{
    int sNo;
    String sName;
    String sSex;
    int sAge;
    double sJava;

    public Student() {
    }

    public Student(int sNo, String sName, String sSex, int sAge, double sJava) {
        this.sNo = sNo;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public double getsJava() {
        return sJava;
    }

    public void setsJava(double sJava) {
        this.sJava = sJava;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sNo=" + sNo +
                ", sName='" + sName + '\'' +
                ", sSex='" + sSex + '\'' +
                ", sAge=" + sAge +
                ", sJava=" + sJava +
                '}';
    }
}
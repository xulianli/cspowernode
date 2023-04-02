package com.cspowernode.teaching.p2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 汪洋
 * @Date 2023/3/28 15:24
 * @Description
 * 五个学生，每个学生有3门课程的成绩，从键盘输入以上数据（姓名，三门课成绩），输入格式：
 * 如：zhangsan,30,40,60计算出总成绩，并把学生的信息和计算出的总分数高低按顺序存放在磁盘文件stud.txt中
 */
public class Work {
    public static void main(String[] args) throws FileNotFoundException {
        //3.定义一个长度为5的student数组对象
        Student [] stus = new Student[5];
        Scanner sc = new Scanner(System.in);
        //4.对该数组元素进行循环
        for (int i = 0; i < stus.length; i++) {
            System.out.println("请输入学生成绩:");
            //5.循环过程中获取到你输入的信息，并且处理成Student对象然后放入到数组中去
            String [] info = sc.next().split(",");
            stus[i] = new Student(info[0],Double.parseDouble(info[1]),Double.parseDouble(info[2]),
                    Double.parseDouble(info[3]));
        }
        //6.按照指定的排序规则进行排序
        Arrays.sort(stus);
        //7.构建输出流
        PrintWriter pw = new PrintWriter("stu.txt");
        //8.迭代处理好的student数组对象
        for (Student student : stus) {
            //9.把每个student对象的内容按照toString的样式进行写入到指定的文本中
            pw.println(student.toString());
        }
        //10.关流
        pw.close();
        sc.close();
    }
}
//1.构建一个Student对象，里面拥有name和三门成绩的分数以及总成绩
class Student implements Comparable<Student>{
    String name;
    double score1;
    double score2;
    double score3;
    double sum;

    public Student(String name, double score1, double score2, double score3) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        sum = score1+score2+score3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score1=" + score1 +
                ", score2=" + score2 +
                ", score3=" + score3 +
                ", sum=" + sum +
                '}';
    }
    //2.因为题意要求进行总分数的降序排序，所以提前写好排序规则
    @Override
    public int compareTo(Student o) {
        return (int) (o.sum-this.sum);
    }
}
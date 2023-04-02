package com.cspowernode.practice;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/28 14:22
 * @Description
 * 五个学生，每个学生有3门课程的成绩，从键盘输入以上数据（姓名，三门课成绩），输入格式：
 * 如：zhangsan,30,40,60计算出总成绩，并把学生的信息和计算出的总分数高低按顺序存放在磁盘文件stud.txt中
 */
public class WriterAndReaderPractice {
    public static void main(String[] args) throws IOException {
        input();
    }


    private static void input() throws IOException {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];
        System.out.println("输入学生姓名和分数（格式：zhangsan,30,40,60）：");
        for (int i = 0; i < 5; i++) {
            String[] infoArr = sc.next().split(",");
            students[i]=new Student(infoArr[0],Integer.parseInt(infoArr[1]),Integer.parseInt(infoArr[2]),
                    Integer.parseInt(infoArr[3]));
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.totalScore-o1.totalScore;
            }
        });
        PrintWriter pw = new PrintWriter("stud.txt");
        for (Student s:students) {
            pw.println(s.toString());
        }
        pw.close();
    }

    }


class Student{
    String name;
    int totalScore;

    public Student(String name, int A, int B, int C) {
        this.name = name;
        this.totalScore = A+B+C;
    }

    @Override
    public String toString() {
        return "Student{name:" + name + ", totalScore:" + totalScore + '}';
    }
}

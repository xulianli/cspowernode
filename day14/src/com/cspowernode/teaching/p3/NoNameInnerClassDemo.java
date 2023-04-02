package com.cspowernode.teaching.p3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @Author 汪洋
 * @Date 2023/3/21 14:25
 * @Description
 * 匿名内部类的使用
 * 1.什么是匿名内部类
 *  针对局部内部类还要单独起名字，而如果局部内部类的对象只使用一次，那么按照我们之前的匿名XXX的使用
 *  习惯来看待的话，这个名字就没有必要了，那么去掉名字的局部内部类就是匿名内部类；
 * 2.匿名内部类怎么写
 *  new 父类(){
 *      子类类体
 *  }
 */
public class NoNameInnerClassDemo {
    public static void main(String[] args) {
        Student [] students = {};
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("请输入学生信息，按照以下格式:学号,姓名,年龄(结束的话使用exit)：");
            String input = scan.next();
            if("exit".equalsIgnoreCase(input)){
                break;
            }
            String info[] = input.split(",");
            students = Arrays.copyOf(students, students.length+1);
            students[students.length-1] =
                    new Student(Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]));
        }
        //1.这里是使用的局部内部类
        class MyComparator1 implements Comparator<Student> {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age-o2.age;
            }
        }
        Arrays.sort(students,new MyComparator1());
        System.out.println(Arrays.toString(students));
        //2.使用匿名内部类的写法
        Arrays.sort(students,new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o2.name.length()-o1.name.length();
            }
        });
        System.out.println(Arrays.toString(students));
    }
}

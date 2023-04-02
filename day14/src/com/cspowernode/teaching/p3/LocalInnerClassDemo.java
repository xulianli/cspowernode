package com.cspowernode.teaching.p3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @Author 汪洋
 * @Date 2023/3/21 14:25
 * @Description
 * 局部内部类的使用
 * 1.什么是局部内部类
 *  把类定义在方法内部，称为方法中逻辑的一个组成部分，让该类用完之后就被回收掉；
 * 2.局部内部类有什么特点
 *  局部内部类几乎都是为了实现某个父类，重写其中的方法，然后去定义的类，在日后工作中几乎见不到
 *  因为都被匿名内部类取代掉了；
 * 3.局部内部类有个注意事项
 *  内部类要访问外部类的资源，这个资源要加final修饰，否则访问不了，JDK1.8不需要你来加，编译器
 *  帮你加
 * 把之前的练习改成局部内部类的形式
 */
public class LocalInnerClassDemo {
    public static void main(String[] args) {
        //1.因为不确定学生数量，所以动态初始化学生数组
        Student [] students = {};
        //2.因为需要录入学生信息，所以初始化Scanner
        Scanner scan = new Scanner(System.in);
        //3.开始使用死循环来录入学生信息
        while(true){
            //4.提示并拿到你输入的内容
            System.out.println("请输入学生信息，按照以下格式:学号,姓名,年龄(结束的话使用exit)：");
            String input = scan.next();
            //5.判断是否是exit
            if("exit".equalsIgnoreCase(input)){
                break;
            }
            //6.把输入的字符串进行拆分
            String info[] = input.split(",");
            //7.对数组进行扩容
            students = Arrays.copyOf(students, students.length+1);
            //8.把新的数组对象放入到刚刚新增的数组位置上去:Integer.parseInt(String str):字符串转int
            students[students.length-1] =
                    new Student(Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]));
        }
        //局部内部类访问外部资源会默认带final修饰词
        int x = 100;
        //按照年龄的升序
        class MyComparator1 implements Comparator<Student> {
            @Override
            public int compare(Student o1, Student o2) {
//                System.out.println(x);
//                x = 200;
                return o1.age-o2.age;
            }
        }
        //9.对数组进行自定义排序：按照age的升序排列
        Arrays.sort(students,new MyComparator1());
        System.out.println(Arrays.toString(students));
        //10.继续排序：按照name的长度降序
        //按照姓名长度的降序
        class MyComparator2 implements Comparator<Student> {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.name.length()-o1.name.length();
            }
        }
        Arrays.sort(students,new MyComparator2());
        System.out.println(Arrays.toString(students));
    }
}

class Student{
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

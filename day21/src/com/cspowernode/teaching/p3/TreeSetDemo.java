package com.cspowernode.teaching.p3;

import java.util.*;

/**
 * @Author 汪洋
 * @Date 2023/3/31 16:39
 * @Description
 * TreeSet的使用
 * 1.TreeSet是SortedSort接口的子类，该类使用红黑树来实现了自定义排序的功能；
 * 2.TreeSet它要求里面的元素所属的类型必须要实现Comparable接口，否则会报错，并且
 * 因为它自带排序功能，所以里面的元素一定要是相同的类型，也就是说我们要使用泛型；
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        //1.查看HashSet的无序不重复的特点
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(2);
        set.add(2);
        set.add(20);
        set.add(4);
        System.out.println(set);
        //2.当HashSet里面放入引用数据类型查看其不重复的特点
        Set<Student1> studentSet = new TreeSet<>();
        Collections.addAll(studentSet,
                new Student1(101,"zhangsan",19),
                new Student1(103,"lisi",20),
                new Student1(102,"wangwu",19),
                new Student1(102,"wangwu",19)
        );
        System.out.println(studentSet);
    }
}
class Student1 implements Comparable<Student1>{
    int id;
    String name;
    int age;

    public Student1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student1 o) {
        return o.id - this.id;
    }
}

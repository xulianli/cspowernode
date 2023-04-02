package com.cspowernode.teaching.p3;

import java.util.*;

/**
 * @Author 汪洋
 * @Date 2023/3/31 16:39
 * @Description
 * HashSet的使用
 * 1.HashSet是在Set接口的基础上增加了无序的特点，它是通过哈希表来实现的不重复；
 * 2.HashSet并没有额外增加新的API方法，所有的方法都和List接口去掉有关下标的方法
 * 相同；
 * 3.HashSet也跟ArrayList以及LinkedList一样提供了一个可以完成互相转换的构造函数
 * 如果我们的集合想去掉重复，那么直接使用HashSet的构造函数转过来即可去掉重复；
 */
public class HashSetDemo {
    public static void main(String[] args) {
        //1.查看HashSet的无序不重复的特点
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(2);
        set.add(2);
        set.add(20);
        set.add(4);
        System.out.println(set);
        //2.当HashSet里面放入引用数据类型查看其不重复的特点
        Set<Student> studentSet = new HashSet<>();
        Collections.addAll(studentSet,
                new Student(101,"zhangsan",19),
                new Student(103,"lisi",20),
                new Student(102,"wangwu",19),
                new Student(102,"wangwu",19)
        );
        System.out.println(studentSet);
        //3.把一个有重复元素的list对象放入到set中来去重复
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,20,30,40,50));
        Set<Integer> set1 = new HashSet<>(list);
        System.out.println(set1);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
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

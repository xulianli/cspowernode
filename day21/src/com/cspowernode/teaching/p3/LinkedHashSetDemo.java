package com.cspowernode.teaching.p3;

import java.util.*;

/**
 * @Author 汪洋
 * @Date 2023/3/31 16:39
 * @Description
 * LinkedHashSet的使用
 * 该类是HashSet的子类，它唯一拓展的功能就是允许元素有序
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //1.查看HashSet的无序不重复的特点
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(2);
        set.add(2);
        set.add(20);
        set.add(4);
        System.out.println(set);
        //2.当HashSet里面放入引用数据类型查看其不重复的特点
        Set<Student> studentSet = new LinkedHashSet<>();
        Collections.addAll(studentSet,
                new Student(101,"zhangsan",19),
                new Student(103,"lisi",20),
                new Student(102,"wangwu",19),
                new Student(102,"wangwu",19)
        );
        System.out.println(studentSet);
        //3.把一个有重复元素的list对象放入到set中来去重复
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,20,30,40,50));
        Set<Integer> set1 = new LinkedHashSet<>(list);
        System.out.println(set1);
    }
}

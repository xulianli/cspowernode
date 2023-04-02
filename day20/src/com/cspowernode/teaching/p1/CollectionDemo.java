package com.cspowernode.teaching.p1;

import java.util.*;

/**
 * @Author 汪洋
 * @Date 2023/3/30 11:16
 * @Description
 * Collection接口里面方法的使用
 * 1.容器类方法
 *  a.add()
 *  b.remove()
 *  c.clear()
 *  d.size()
 *  e.toArray()
 *  f.contains()
 *  g.isEmpty()
 * 2.数学含义中的交并差
 *  a.addAll():并
 *  b.removeAll():差
 *  c.retainAll():交
 * 3.其他方法
 *  a.hashcode()
 *  b.equals()
 *  c.iterator()
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //通过new子接口的实现类来构建一个Collection类型的对象
        Collection col1 = new ArrayList();
        //1.如果集合不用泛型，那么里面可以放任意类型的数据，但是这样不方便我们进行统一处理
        col1.add(100);
        col1.add("abc");
        col1.add(true);
        col1.add(new int[]{1,2,3});
        col1.add('x');
        col1.add(3.14);
        System.out.println(col1);
        //2.我们日常处理容器的数据肯定是要加泛型来使用，如果元素类型是基本数据类型，记得使用对应的包装类
        Collection<Integer> col2 = new ArrayList<Integer>();
        col2.add(10);
        col2.add(20);
        col2.add(30);
        col2.add(40);
        col2.add(50);
        Collection<Integer> col3 = new ArrayList<Integer>();
        col3.add(10);
        col3.add(20);
        col3.add(30);
        col3.add(60);
        col3.add(70);
        //3.演示交并差的操作
        //3.1.并
//        col2.addAll(col3);
        //3.2.交
//        col2.retainAll(col3);
        //3.3.差
//        col2.removeAll(col3);
//        System.out.println(col2);
        //4.演示容器的操作
        //4.1.查看：contains
        System.out.println(col2.contains(30));
        //4.2.查看：size
        System.out.println(col2.size());
        //4.3.查看：isEmpty
//        col2.clear();
        System.out.println(col2.isEmpty());
        //4.4.操作：add-->略
        //4.5.操作：remove
        col2.remove(30);
        System.out.println(col2);
        //4.6.操作：和数组的转化
        //4.6.1.数组转集合
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        //4.6.2.集合转数组
        Object[] objects = col2.toArray();
        System.out.println(Arrays.toString(objects));
    }
}

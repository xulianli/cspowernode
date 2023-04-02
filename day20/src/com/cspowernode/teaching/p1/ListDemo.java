package com.cspowernode.teaching.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author 汪洋
 * @Date 2023/3/30 11:35
 * @Description
 * List接口里面的方法使用
 * 1.List接口的含义是有序且允许重复并且有下标，所以提供了一系列带下标的方法
 *  a.add()
 *  b.addAll()
 *  c.remove()
 *  d.set()
 *  e.get()
 *  f.indexOf()
 *  g.lastIndexOf()
 *  h.subList()
 * 2.List接口的遍历
 *  a.for
 *  b.foreach
 */
public class ListDemo {
    public static void main(String[] args) {
        //这样才能操作，否则只能看和取
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50,30,40,10));
        //API方法的操作
        list.add(2,80);
        System.out.println(list);
        list.addAll(3,Arrays.asList(100,200,300));
        System.out.println(list);
        //remove此时既可以删除下标又可以删除元素，请问你写数字它为什么默认是下标，如果想是元素该怎么操作
        list.remove(10);
        System.out.println(list);
        list.remove(Integer.valueOf(50));
        System.out.println(list);
        list.set(2,0);
        System.out.println(list);
        System.out.println(list.get(list.size()-1));
        System.out.println(list.indexOf(10));
        System.out.println(list.lastIndexOf(10));
        //截取0到第一个30的位置
        List<Integer> newList = list.subList(list.indexOf(0), list.indexOf(30));
        System.out.println(newList);
        //遍历操作
        //for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+"\t");
        }
        //foreach
        for (int num : list) {
            System.out.print(num+"\t");
        }
    }
}

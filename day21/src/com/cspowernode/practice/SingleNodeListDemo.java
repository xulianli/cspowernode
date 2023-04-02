package com.cspowernode.practice;

/**
 * @Author 汪洋
 * @Date 2023/3/31 11:33
 * @Description
 */
public class SingleNodeListDemo {
    public static void main(String[] args) {
        SingleNodeList list = new SingleNodeList();
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.getFirst());
        System.out.println(list.get(3));
//        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println("------------------------");
        list.add(0,66);
        System.out.println(list);
    }
}

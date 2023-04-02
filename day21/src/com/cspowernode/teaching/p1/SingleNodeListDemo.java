package com.cspowernode.teaching.p1;

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
        System.out.println(list.get(2));
        list.set(2,50);
        System.out.println(list);
        list.add(0,100);
        list.add(3,200);
        System.out.println(list);
        list.remove(5);
        System.out.println(list);
        System.out.println(list.size());
    }
}

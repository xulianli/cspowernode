package com.cspowernode.teaching.异常面试题;
public class Demo2 {
    public static void main(String[] args) {
        try {
            fun();
        } catch (Exception e) {
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static void fun() {
        try {
            throw new Exception();
            //如果加上这句话，结果会怎么样
//			System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        }
    }
}

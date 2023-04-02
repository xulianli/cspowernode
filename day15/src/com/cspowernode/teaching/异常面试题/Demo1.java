package com.cspowernode.teaching.异常面试题;
class Demo1 {
    public static void fun() {
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("B");
        }
    }
    //bad
    public static void main(String[] args) {
        try {
            fun();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("C");
        }
        System.out.println("D");
    }
}

package com.cspowernode.practice;

/**
 * @Author 徐联理
 * @Date 2023/3/17 14:42
 * @Description
 */
//public class Practice {
public class Test {
    int count = 9;

    public void count(int count) {
        System.out.println("count1=" + count);
    }

    public void count() {
        System.out.println("count2=" + count);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.count(10);
        t.count();
    }
}
//}

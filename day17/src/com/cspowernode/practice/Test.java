package com.cspowernode.practice;

/**
 * @Author 徐联理
 * @Date 2023/3/25 20:00
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        String s1 = new String("bjpowernode");
        String s2 = new String("bjpowernode");
        if (s1 == s2)
            System.out.println("s1 == s2");
        if (s1.equals(s2))
            System.out.println("s1.equals(s2)");
    }
}

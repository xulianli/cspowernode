package com.cspowernode.teaching.异常面试题;

public class Demo4 {
    public static String outputString = "";
    public static void foo(int i) {
        try {
            if (i == 1) {
                throw new Exception();
            }
            outputString += "1";
        } catch (Exception e) {
            outputString += "2";
            return;
        } finally {
            outputString += "3";
        }
        outputString += "4";
    }
    public static void main(String[] args) {
        foo(0);
        System.out.println(outputString);//134
        foo(1);
        System.out.println(outputString);//13423
    }
}

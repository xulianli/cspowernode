package com.cspowernode.teaching.p2;

/**
 * @Author 汪洋
 * @Date 2023/3/11 14:37
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        arr1 = null;
        System.out.println(arr1[2]); // 输出结果为？？？
        System.out.println(arr2[2]); // 输出结果为？？？
        String str = "abcdefg";
        char[] chars = str.toCharArray();
        int x = ('2'-48)*3;
    }
}

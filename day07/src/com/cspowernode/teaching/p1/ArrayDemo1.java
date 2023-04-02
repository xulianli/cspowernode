package com.cspowernode.teaching.p1;

import java.util.Arrays;

/**
 * @Author 汪洋
 * @Date 2023/3/11 9:17
 * @Description
 * 数组的基本使用
 * 1.什么是数组
 *  数组就是一个以有序的形式来存放同一类型元素的一个容器，这个容器的最大的特点就是：有序、有下标
 * 2.数组如何进行初始化
 *  a.静态初始化：数据一开始就固定了，然后很少会发生变化的场景
 *      ①.int[] arr = new int[]{1,2,3,4,5};
 *      ②.int[] arr = {1,2,3,4,5};-->推荐写法
 *  b.动态初始化：数据是在运行过程中确定的，所以一开始只定义数据的类型和数据的个数
 *      ①.int[] arr = new int[5];-->没有元素，长度为5
 *      ②.int[] arr = new int[]{};-->没有元素，长度为0
 *      ③.int[] arr = {};--->优化的版本
 *  注意：
 *      ①.括号里面的元素类型要和定义的时候数组的元素类型匹配
 *      ②.数组在定义的时候，如果你是声明和赋值分开写，那么请注意赋值要使用完整的new的写法；
 *      ③.数组在动态初始化的时候，如果只定义长度，不定义元素的内容，那么元素都会默认初始化
 *          整型-->0
 *          浮点型-->0.0
 *          char-->\u0000
 *          boolean-->false
 *          其他-->null
 * 3.数组要使用需要掌握的基本知识
 *  a.获取数组指定下标所对应的元素：变量名[下标]
 *  b.为指定下标所对应的元素赋值：变量名[下标] = 值;
 *  c.获取数组的长度：变量名.length
 *  d.展示数组的内容：Arrays.toString(变量名)
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        //1.数组的初始化
        //1.1.数组的静态初始化
        int [] arr1 = new int[]{1,2,3,4,5};
        int arr2[] = {1,2,3,4,5};
        //1.2.赋值和声明分开写
        int [] arr3;
        //如果要分开写，请完整书写
//        arr3 = {1,2,3,4,5};
        arr3 = new int[]{1,2,3,4,5};
        //1.3.动态初始化
        String [] arr4 = new String[]{};
        String [] arr5 = {};
        //1.4.如果只定义长度，不定义值，那么值会默认初始化
        String [] a1 = new String[5];
        int [] a2 = new int[5];
        double [] a3 = new double[5];
        char [] a4 = new char[5];
        boolean [] a5 = new boolean[5];
        //2.数组的基本操作
        //2.1.获取数组的长度
        System.out.println(arr1.length);
        //2.2.为数组的元素赋值--->下标别超出范围[0,length-1]
        arr1[2] = 100;
        //2.3.查看元素
        System.out.println(arr1[2]);
        //2.4.查看数组内容
        System.out.println(a2);//[I@677327b6
        System.out.println(Arrays.toString(arr1));
        //2.5.查看字符类型
        char [] a6 = {'a','b'};
        System.out.println(new String(a6));
        System.out.println(a6);
        System.out.println(a4);
        System.out.println("==============================");
        for (int i = 0; i <= 127; i++) {
            System.out.print((char)i+"-");
        }
    }
}

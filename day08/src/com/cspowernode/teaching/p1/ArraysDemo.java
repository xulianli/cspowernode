package com.cspowernode.teaching.p1;

import java.util.ArrayDeque;
import java.util.Arrays;

/**
 * @Author 汪洋
 * @Date 2023/3/13 14:00
 * @Description
 * Arrays类的使用
 * 1.Arrays类是Array的一个工具类，类似这种写法的还有：Objects、Collections，这些类的
 * 方法都有一个共通的特点，就是所有的方法都是static修饰的方法；
 * 2.Arrays类需要我们掌握的方法
 *  a.toString():把数组按照指定的格式进行展示
 *  b.copyOf(arr,length):进行数组的复制
 *  c.copyOfRange(arr,start,end):数组指定位置的复制
 *  d.asList(T... a):把指定的数组转为List集合--->后期再讲
 *  e.binarySearch(arr, key):使用二分查找法来查找指定元素所对应的下标，注意：要求该数组
 *  要有序；
 *  f.binarySearch(arr, fromIndex, toIndex,key):在指定范围内来查找某个元素的下标
 *  g.equals(arr1, arr2):判断2个数组的类型、元素个数以及元素的内容和顺序是否相等
 *  h.fill(arr,val):把指定数组的所有元素替换为另外一个内容
 *  i.fill(arr,startIndex,endIndex,val):把指定数组的指定范围内的所有元素替换为另外一个内容
 *  j.sort(arr):对指定的数组按数字升序进行排序。若是字符串类型的数组，则从头往后拿出每个字符的unicode
 *  码来进行升序排列；
 *  k.sort(arr,fromIndex,toIndex):指定范围内的元素进行升序排列
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int [] arr = {3,6,5,8,7,4,1};
        //sort
        Arrays.sort(arr);
        String [] arr1 = {"ton","tony","bob","kitty","allen","Allen","tom"};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        //toString
        System.out.println(Arrays.toString(arr));
        //binarySearch
        System.out.println(Arrays.binarySearch(arr,5));
        //fill
        Arrays.fill(arr1,2,5,null);
        System.out.println(Arrays.toString(arr1));
        //equals
        int [] a1 = {1,2,3};
        int [] a2 = {2,1,3};
        System.out.println(Arrays.equals(a1,a2));
        //测试自己的equals方法
        char [] a3 = {'a','B','c'};
        char [] a4 = {'A','c','B'};
        System.out.println(equals(a3,a4));
    }
    //进行两个char类型数组的判断是否相等，要求忽略元素的顺序以及元素的大小写
    public static boolean equals(char[] a1,char[] a2){
//        String s1 = new String(a1);
//        String s2 = new String(a2);
//        s1 = s1.toUpperCase();
//        s2 = s2.toUpperCase();
//        a1 = s1.toCharArray();
//        a2 = s2.toCharArray();
        //1.直接把数组里面的大小写都转为大写
        a1 = new String(a1).toUpperCase().toCharArray();
        a2 = new String(a2).toUpperCase().toCharArray();
        //2.排序
        Arrays.sort(a1);
        Arrays.sort(a2);
        //3.判断
        return Arrays.equals(a1,a2);
    }
}

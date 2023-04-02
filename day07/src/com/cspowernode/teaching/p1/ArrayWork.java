package com.cspowernode.teaching.p1;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author 汪洋
 * @Date 2023/3/11 11:30
 * @Description
 * 1.使用随机数来构建1-100的随机数，然后放入到一个长度为100的数组里面去，然后求出里面的最大值和最小值；
 * 2.交换里面的最值，忽略最值重复的情况；
 */
public class ArrayWork {
    public static void main(String[] args) {
        //1.初始化长度为100的数组并且为其赋1-100的随机数
        int [] arr = new int[100];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100)+1;
        }
        //2.定义一个max和min的变量
        int max = arr[0];
        int min = arr[0];
        //5.定义max和min的下标
        int maxIndex = 0;
        int minIndex = 0;
        //3.进行循环比较
        for (int i = 0; i < arr.length; i++) {
            //4.进行比较
            if(max<arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
            if(min>arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("最大值："+max+"，下标是"+maxIndex+",最小值："+min+"，下标是"+minIndex);
        //6.交换并输出
        System.out.println("=================================================");
        arr[maxIndex] = min;
        arr[minIndex] = max;
        System.out.println(Arrays.toString(arr));
    }
}

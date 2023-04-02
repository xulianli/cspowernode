package com.cspowernode.practice;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author 徐联理
 * @Date 2023/3/11 8:56
 * @Description
 * 1.使用随机数来构建1-100的随机数，然后放入到一个长度为100的数组里面去，然后求出里面的最大值和最小值；
 * 2.交换里面的最值，忽略最值重复的情况；
 * 附加题：如果元素不能重复呢？
 */
public class Practice7 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("最大值："+maxElement(arr)+"\n最小值："+minElement(arr));
        swapMaxnMin(arr);
        test();
//        for (int j = 0; j < arr.length; j++) {
//            isPrime(arr[j]);
//
//        }
    }

    private static void test() {
        int[] arrA = { 12, 22, 8, 49, 3 };
        int k = 0;		int len = arrA.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arrA[i] > arrA[j]) {
                    k = arrA[i];
                    arrA[i] = arrA[j];
                    arrA[j] = k;
                }
            }
        }
        for (int i = 0; i < arrA.length; i++) {
            System.out.print(arrA[i]);
            if (i < arrA.length - 1) {
                System.out.print("，");
            }
        }
    }


    public static void isPrime(int num) {
        if (num == 1 || num == 2)
            System.out.println("0和1既不是质数也不是合数");
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + "不是质数");
            }
        }
        System.out.println(num + "是质数");
    }

    public static int maxElement(int[] arr) {
        // 假设第一个元素的值就是最大值
        int max = arr[0];
        // 遍历数组元素，依次和假设的最大值作比较
        for(int i = 1; i < arr.length; i++) {
            // 取出每个元素的值和value作比较
            if(arr[i] > max) {
                // 推翻假设，更新最大值
                max = arr[i];
            }
        }
        return max;
    }

    public static int minElement(int[] arr) {
        // 假设第一个元素的值就是最小值
        int min = arr[0];
        // 遍历数组元素，依次和假设的最小值作比较
        for(int i = 1; i < arr.length; i++) {
            // 取出每个元素的值和value作比较
            if(arr[i] < min) {
                // 推翻假设，更新最小值
                min = arr[i];
            }
        }
        return min;
    }

    public static int search(int[] arr, int value) {
        // 遍历数组，把数组中的元素依次和value作比较
        for(int i = 0; i < arr.length; i++) {
            // 取出元素值和value作比较
            if(arr[i] == value) {
                return i; // 找到相同的元素，返回索引位置
            }
        }
        // 未找到，则返回-1
        return -1;
    }

    public static void swapMaxnMin(int[] arr){

        int minIndex = search(arr,minElement(arr));
        int maxIndex = search(arr,maxElement(arr));
        int temp = arr[maxIndex];
        arr[maxIndex]=arr[minIndex];
        arr[minIndex]=temp;
        System.out.println(Arrays.toString(arr));
    }

    public static int[] reverseArray( int[] arr) {
        int size = arr.length;
        int[] revArray = new int[size];
        for (int i = 0; i < size; i++) {
            revArray[size-1-i]=arr[i];
        }
        return revArray;
    }
}

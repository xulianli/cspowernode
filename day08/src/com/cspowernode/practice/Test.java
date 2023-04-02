package com.cspowernode.practice;

import java.util.Arrays;

/**
 * @Author 徐联理
 * @Date 2023/3/13 18:49
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    /**
     * 冒泡排序（升序）
     * @param arr
     */
    public static void sort(int[] arr) {
        // 外侧循环：用于控制比较趟数。
        for(int i = 0; i < arr.length - 1; i++) {
            // a)假设第本趟比较已经排序成功
            boolean flag = true;
            // 内侧循环：用于每趟循环相邻两个元素比较的次数
            for(int j = 0; j < arr.length - i - 1; j++) {
                // b)如果前一个元素大于后一个元素，则交换位置
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // 如果排序的过程中元素发生了交换，则证明排序没有成功
                    flag = false;
                }
            }
            // c)每趟排序完毕后，检查flag标记的值
            if(flag) { // 如果flag标记值为true，则证明排成功
                break;
            }
        }
    }
    }


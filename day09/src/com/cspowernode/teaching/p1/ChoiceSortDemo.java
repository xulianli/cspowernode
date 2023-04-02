package com.cspowernode.teaching.p1;

import java.util.Arrays;

/**
 * @Author 汪洋
 * @Date 2023/3/14 11:28
 * @Description
 * 选择排序
 * 1.排序原理
 *  把整个数组分为两个部分，一部分为被比较元素，一部分为比较元素，被比较元素会逐一的和比较元素进行一一比较，
 *  被比较元素的下标移动轨迹是从0开始到倒数第二个，比较元素的下标移动轨迹是被比较元素的下一个到最后一个，然后
 *  每次拿着比较元素和被比较元素进行比较，如果被比较元素比比较元素大，则交换位置,完成一轮比较之后，肯定能够得到
 *  一个最小值，那么这个最小值将不再参与下一次的比较，于是被比较元素位置往后进行移动，开始进行下一次的逐一比较；
 * 2.模拟过程：36524
 *  一.36524
 *      a.36524
 *      b.36524
 *      c.26534
 *      d.26534
 *  二.26534
 *      a.25634
 *      b.23654
 *      c.23654
 *  三.23654
 *      a.23564
 *      b.23465
 *  四.23465
 *      a.23456
 * 3.总结：
 *  i:被比较元素的移动轨迹就是外层循环，它的取值范围[0,length-2]
 *  j:比较元素的移动轨迹就是内层循环，它的取值范围是[i+1,length-1]
 */
public class ChoiceSortDemo {
    public static void main(String[] args) {
        int [] arr = {3,6,5,2,4};
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

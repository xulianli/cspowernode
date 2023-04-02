package com.cspowernode.teaching.p1;

import java.util.Arrays;

/**
 * @Author 汪洋
 * @Date 2023/3/14 14:02
 * @Description
 * 冒泡排序
 * 1.原理
 *  从头开始进行两两相邻元素的比较，大的往右走(交换位置),然后继续往右边两两比较，直到比较到最后一个元素，
 *  从此得到个这些元素中的最大值，当前这个最大值不再参与比较，继续从头开始新的一轮比较，又得到一个最大值，
 *  反复该操作从而完成排序；
 * 2.模拟过程：36524
 *  一.36524
 *      a.36524
 *      b.35624
 *      c.35264
 *      d.35246
 *  二.3524 6
 *      a.3524 6
 *      b.3254 6
 *      c.3245 6
 *  三.324 56
 *      a.234 56
 *      b.234 56
 *  四.23 456
 *      a.23 456
 * 3.分析
 *  a.外循环i：不参与排序的元素个数的变化轨迹，它的取值范围：[0,length-1)
 *  b.内循环j：两两比较元素的下标移动轨迹，它的取值范围：[0,length-1-i)
 *  c.比较的两个元素是：j和j+1
 */
public class BubbleSortDemo {
    public static void main(String[] args) {
        int [] arr = {3,6,5,2,4};
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

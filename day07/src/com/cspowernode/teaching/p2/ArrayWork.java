package com.cspowernode.teaching.p2;

import java.util.Arrays;

/**
 * @Author 汪洋
 * @Date 2023/3/11 16:07
 * @Description
 * 1.求最值
 * 2.求指定元素对应的下标
 * 3.完成数组的反转
 */
public class ArrayWork {
    public static void main(String[] args) {
        int [] arr = {3,8,5,4,2,1,7,2};
        System.out.println(getMaxOrMin(arr,true));
        System.out.println(getMaxOrMin(arr,false));
        System.out.println(indexOf(arr,2));
        System.out.println(lastIndexOf(arr,2));
        reverse1(arr);
        System.out.println(Arrays.toString(arr));
        arr = reverse2(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] reverse2(int [] arr){
        //1.先定义一个和老数组长度一致的新数组
        int [] newArr = new int[arr.length];
        //2.把原始数组从头到尾进行遍历
        for (int i = 0; i < arr.length; i++) {
            //3.把原始数组中的从头到尾的元素取出来放到新数组的对称位置上去
            newArr[newArr.length-1-i] = arr[i];
        }
        return newArr;
    }

    public static void reverse1(int [] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }

    /**
     * 从后往前寻找指定元素的下标
     * @param arr
     * @param option
     * @return
     */
    public static int lastIndexOf(int [] arr,int option){
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i]==option){
                return i;
            }
        }
        return -1;
    }
    /**
     * 从首位往后面寻找指定的元素，如果找到返回该元素下标，否则返回-1
     * @param arr 你要寻找元素的数组
     * @param option 你要寻找的指定元素
     * @return 对应的下标
     */
    public static int indexOf(int [] arr,int option){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==option){
                return i;
            }
        }
        return -1;
    }

    /**
     * 获取最大值或者最小值
     * @param arr 你要获取最值的数组
     * @param flag 最大值或最小值的选择，如果为true就是获取最大值，如果为false就是获取最小值
     * @return 返回最值
     */
    public static int getMaxOrMin(int [] arr,boolean flag){
        int num = arr[0];
        for (int i : arr) {
            if(flag&&num<i){
                num = i;
            }else if(num>i){
                num = i;
            }
        }
        return num;
    }
}

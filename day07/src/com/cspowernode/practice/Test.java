package com.cspowernode.practice;

import java.util.Arrays;

/**
 * @Author 徐联理
 * @Date 2023/3/11 19:05
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        char [] arr = {'1','2','3','4','5','a','B'};
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Character.toUpperCase(arr[i]);
        }

        //1.把数组的容量扩大指定的长度
//        arr = Arrays.copyOf(arr,arr.length+1);
        System.out.println(Arrays.toString(arr));
        //int [] newArr2 = new int[arr.length];
//        int index=2;
//        int [] newArr = Arrays.copyOfRange(arr,5,7);
//        System.out.println(Arrays.toString(newArr));
//        int[] newArr2 = new int[7];
//        System.arraycopy(arr,0,newArr2, 2,5);
//        System.out.println(Arrays.toString(newArr2));
//        for (int i = 0; i < 2; i++) {
//            newArr2[i]=newArr[i];
//        }
//        System.out.println(Arrays.toString(newArr2));
//        System.arraycopy(arr,index+1,newArr2,index,arr.length-1-index);
//        System.out.println(Arrays.toString(newArr2));
//        for (int i = 0; i < index; i++) {
//            newArr2[i]=arr[i];
//        }
//        System.out.println(Arrays.toString(newArr2));
    }
}

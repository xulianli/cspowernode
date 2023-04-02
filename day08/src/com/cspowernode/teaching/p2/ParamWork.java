package com.cspowernode.teaching.p2;

import java.util.Arrays;

/**
 * @Author 汪洋
 * @Date 2023/3/13 15:32
 * @Description
 */
public class ParamWork {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(addAll(arr,1,2,3)));
    }
    public static int[] addAll(int [] arr,int ... params){
        //1.先根据可变参数的大小来调整原始数组的大小
        arr = Arrays.copyOf(arr,arr.length+params.length);
        //2.把可变参数的元素都放入到原始数组的后面
        System.arraycopy(params,0,arr,arr.length-params.length,params.length);
        //3.返回数据
        return arr;
    }
}

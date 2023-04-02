package com.cspowernode.teaching.p3;

import java.util.Arrays;

/**
 * @Author 汪洋
 * @Date 2023/3/13 15:39
 * @Description
 * 二维数组的使用
 * 1.怎么理解二维数组
 *  如果说一维数组是一个有序的列表，那么二维数组就是在一维数组的基础上把每个元素都定义成一个数组从而
 *  形成了一个面，这就是二维数组；
 * 2.二维数组适合什么场合使用
 *  当你的元素形成一个表的形式的时候，我们就可以使用二维数组来进行管理；
 * 3.二维数组如何定义
 *  a.静态
 *      ①.int[] [] arr = new int[][]{{1,2,3},{4,5},{6,7,8,9}};
 *      ②.int[] [] arr = {{1,2,3},{4,5},{6,7,8,9}};
 *  b.动态
 *      ①.int [][] arr = new int[5][]--->代表该数组一维纬度上有5个元素，而这5个元素又是数组，但是不确定
 *      数组里面又有多少个元素；
 *      ②.int [][] arr = new int[5][4]--->5行4列
 *      ③.int [][] arr = new int[][]{}
 *      ④.int [][] arr = {}
 * 4.二维数组的基本使用
 *  int[] [] arr = {{1,2,3},{4,5},{6,7,8,9}};
 *  a.求长度：arr.length-->3,arr[1].length-->2
 *  b.获取和赋值：arr[0][1]-->2,arr[2][0]-->6,arr[1][1] = 8
 *  c.查看：
 *      for(int i = 0;i<arr.length;i++){
 *          System.out.println(Arrays.toString(arr[i]));
 *      }
 * 5.二维数组的循环
 */
public class TwoArrayDemo {
    public static void main(String[] args) {
        //二维数组的定义
        int [][] arr = new int[5][];
        //1.这种数组你无法直接访问里面的内容，会报错
//        System.out.println(arr[1][2]);
        //2.查看该数组里面的子数组的内容
        System.out.println(Arrays.toString(arr));
        //3.如何为该数组里面的元素重新定义数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[(int) (Math.random()*5)+1];
        }
        //4.查看该二维数组
        for(int i = 0;i<arr.length;i++){
           System.out.println(Arrays.toString(arr[i]));
       }
        System.out.println("=======================================");
        //二维数组的循环
        //for循环
        for(int i = 0;i<arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {//容易出错的地方：arr[i]
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("=======================================");
        for (int[] ints : arr) {//容易出错的地方：int[]
            for (int i : ints) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}

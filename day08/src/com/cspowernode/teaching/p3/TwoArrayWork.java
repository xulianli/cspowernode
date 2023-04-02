package com.cspowernode.teaching.p3;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author 汪洋
 * @Date 2023/3/13 16:47
 * @Description
 * 初始化一个元素类型是int的10X10的二维数组，里面用来存放1-1000的随机数，
 * 要求求出最大值和最小值，然后交换位置
 */
public class TwoArrayWork {
    public static void main(String[] args) {
        //1.创建一个10X10的int类型的数组
        Random random = new Random();
        int [][] arr = new int[10][10];
        //2.定义最大值和最小值以及最大值的x，y坐标以及最小值的x，y坐标
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxI = 0,maxJ = 0,minI = 0,minJ = 0;
        //3.循环数组并且赋值随机数
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(1000)+1;
                //4.判断获取最值，然后赋值给max和min以及对应的下标变量
                if(arr[i][j]>max){
                    max = arr[i][j];
                    maxI = i;
                    maxJ = j;
                }
                if(arr[i][j]<min){
                    min = arr[i][j];
                    minI = i;
                    minJ = j;
                }
            }
        }
        //5.展示当前的二维数组并且输出最值及下标
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("最大值是:"+max+",它的位置是:["+maxI+","+maxJ+"]");
        System.out.println("最小值是:"+min+",它的位置是:["+minI+","+minJ+"]");
        //6.交换位置
        arr[maxI][maxJ] = min;
        arr[minI][minJ] = max;
        System.out.println("===================================================");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}

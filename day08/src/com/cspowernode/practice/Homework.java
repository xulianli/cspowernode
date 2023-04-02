package com.cspowernode.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/13 18:35
 * @Description
 * 1.初始化一个元素类型是int的10X10的二维数组，里面用来存放1-1000的随机数，
 * 完成去重复的算法；
 * 	a.比较法：每拿到一个元素就把该元素跟数组中的已经存在的元素进行比较，如果相同，则重新获取元素；
 * 	b.标记法：把我们能够获取到的随机数都存在一个数组中，再通过随机数去取里面的元素，每取出一个元素就把该数组中的这个元素的值
 * 	改成-1，那么下一次获取元素的时候，如果取到的是-1就代表已经取过；
 * 2.题目：输入某年某月某日，判断这一天是这一年的第几天？
 * 分析：以3月5日为例，先把前两个月的加起来，然后再加上5天即本年第几天，特殊情况，闰年且输入月份大于3需考虑多加一天。
 * 可定义数组存储1-12月各月天数。
 * 3.合并数组操作：现有如下一个数组：int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5}要求将以上数组中值为0的项去掉，
 * 将不为0的值存入一个新的数组，生成的新数组为： int newArr [] ={1,3,4,5,6,6,5,4,7,6,7,5}
 * 思路：确定出不为0的个数，这样可以开辟新数组；从旧的数组之中，取出内容，并将其赋给新开辟的数组
 */
public class Homework {
    public static void main(String[] args) {
        removeRedupli();
//        days();
//        removeZeros();
    }

    private static void removeZeros() {
        int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int count=0;
        for (int i = 0; i < oldArr.length; i++) {
            if (oldArr[i]==0)
                count++;
        }
        int[] newArr = new int [oldArr.length-count];
        for (int i = 0, j = 0; i < oldArr.length; i++) {
            if (oldArr[i]!=0) {
                newArr[j]=oldArr[i];
                j++;
            }
        }
        System.out.println("旧数组为："+ Arrays.toString(oldArr)+"\n"+
                "新数组为："+ Arrays.toString(newArr));
    }

    private static void days() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入日期：");
        int day = sc.nextInt();
        int[] days ={31,28,31,30,31,30,31,31,30,31,30,31};
        if((year%4==0 && year%100!=0) || year%400==0){
            days[1]=29;
        }
        for (int i = 0; i < month-1; i++) {
            day += days[i];
        }
        System.out.println(year+"年"+month+"月"+day+"日，这一天是"+year+"年的第"+day+"天");
    }

    private static void removeRedupli() {
        //把我们能够获取到的随机数都存在一个数组中
        int[] Arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            Arr[i]=i+1;
        }
        //初始化一个元素类型是int的10X10的二维数组
        int[][] twoArrays = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int index = (int) (Math.random()*1000);
                if (Arr[index]!=-1){
                twoArrays[i][j] = Arr[index];
                Arr[index]=-1;}
                else{
                    j--;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            Arrays.sort(twoArrays[i]);
            System.out.println(Arrays.toString(twoArrays[i]));
        }
    }


}

package com.cspowernode.teaching.p1;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author 汪洋
 * @Date 2023/3/11 10:08
 * @Description
 * 数组的循环
 * 1.循环下标-->for循环
 *  for(int i = 0;i<arr.length;i++){
 *      arr[i]
 *  }
 * 2.循环元素-->foreach循环
 *  for(元素的类型 元素的变量名:数组的变量名){
 *      元素的变量名
 *  }
 *  for(int a:arr){
 *      a
 *  }
 * 3.这两种循环的区别
 *  a、循环的语法和方式不一样
 *  b、如果你循环不一定是从头到尾或者是你需要使用到下标，那么我们就用for循环，如果
 *  你追求效率，并且是从头循环到尾，那么我们使用foreach循环
 *  c、for循环允许你对元素进行修改，而foreach只允许查看
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        //案例：构建100个1-100的随机数，然后判断哪些是偶数，并输出
        int [] arr = new int[100];
        Random random = new Random();
        /*for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100)+1;
            if(arr[i]%2==0)
                System.out.println(arr[i]+"是偶数");
        }*/
        //foreach循环可读不可写
        for(int a:arr){
            a = random.nextInt(100)+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}

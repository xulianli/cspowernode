package com.cspowernode.homework;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author 徐联理
 * @Date 2023/3/21 20:35
 * @Description
 * 3.如果给你一个int类型的数组，使用Arrays.sort（int [] arr）能完成升序排列，那么使用
 * Arrays.sort(Object []obj,Comparator)来完成降序排序呢
 */
public class SortIntArrayDemo {
    public static void main(String[] args) {
        int[] Arr = new int[100];
        for (int i = 0; i < 100; i++) {
            Arr[i]=i+1;
        }
        Integer[] Arr2 = new Integer[100];
        for (int i = 0; i < 100; i++) {
                int index = (int) (Math.random()*100);
                if (Arr[index]!=-1){
                    Arr2[i] = Arr[index];
                    Arr[index]=-1;}
                else{
                    i--;
                }
            }
        Arrays.sort(Arr2);
        System.out.println(Arrays.toString(Arr2));
        Arrays.sort(Arr2, new myComparator());
        System.out.println(Arrays.toString(Arr2));
    }
}
class myComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}



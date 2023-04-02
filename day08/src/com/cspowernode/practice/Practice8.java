package com.cspowernode.practice;

import com.sun.org.apache.xml.internal.dtm.ref.DTMAxisIterNodeList;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/13 8:45
 * @Description
 */
public class Practice8 {
    public static void main(String[] args) {
//        char[] arr1 = {'a', 'b', 'c', 'd'};
//        char[] arr2 = {'A', 'D', 'B', 'C'};
//        int[] arr={1,2,4,6,99};
//        System.out.println(equals(arr1, arr2));
//        insert(arr,1,9,10);
//        twoDimensionArray();
        studentGrades();
    }

    private static void studentGrades() {
        double [][] grades = {{0,0,0}, {0,0,0,0}, {0,0,0,0,0}};
        double sum=0,averGrades=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <grades[i].length; j++) {
                grades[i][j]=sc.nextDouble();
                sum += grades[i][j];
                averGrades = sum/grades[i].length;
            }
            System.out.println(i+1+"班平均分数为："+averGrades);
            sum=0;
        }
    }

    private static void twoDimensionArray() {
        int[][] twoArrays = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                twoArrays[i][j] = (int) (Math.random()*1000)+1;
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(twoArrays[i]));
        }

        int maxRow=0, maxLine=0, minRow=0, minLine=0;

        int max = twoArrays[0][0];
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if (twoArrays[i][k]>max) {
                    max = twoArrays[i][k];
                    maxRow = i;
                    maxLine = k;
                }
            }
        }

        int min = twoArrays[0][0];
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if (twoArrays[i][k]<min) {
                    min = twoArrays[i][k];
                    minRow=i;
                    minLine = k;
                }
            }
        }

        System.out.println("最大值为：twoArrays["+maxRow+"]["+maxLine+"]="+max+"\n"
                +"最小值为：twoArrays["+minRow+"]["+minLine+"]="+min);
        int temp=twoArrays[maxRow][maxLine];
        twoArrays[maxRow][maxLine] = twoArrays[minRow][minLine];
        twoArrays[minRow][minLine] = temp;

        System.out.println("交换最大值和最小值后：");
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(twoArrays[i]));
        }
    }

    private static void insert(int[] arr, int ... arr2) {
        int[] newArr = Arrays.copyOf(arr,arr.length+arr2.length);
        System.arraycopy(arr2,0,newArr,arr.length,arr2.length);
        System.out.println(Arrays.toString(newArr));
    }

    public static boolean equals(char[] a, char[] a2) {
        if (a==a2)
            return true;
        if (a==null || a2==null)
            return false;

        int length = a.length;
        if (a2.length != length)
            return false;

        Arrays.sort(a);
        Arrays.sort(a2);

        for (int i=0; i<length; i++) {
            a[i] = Character.toUpperCase(a[i]);
            a2[i] = Character.toUpperCase(a2[i]);
            if (a[i] != a2[i])
                return false;
        }

        return true;
    }
}

package com.cspowernode.practice;

import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/8 14:22
 * @Description
 * 1、使用continue实现输出1到100之间能被5整除的数。
 * 2、韩信点兵，三人一组余两人，五人一组余三人，七人一组余四人，请问最少需要多少士兵
 * 3、输入一个任意整数，判断它是否为质数。如果整数为7，则输出“7是质数”，如果整数为9，则输出‘9不是质数’。
 * 质数：除了1和它本身之外，不能被其他数整除的数称之为质数。
 *  实现步骤：
 *    1)通过Scanner获取一个正整数, 假设正整数为num。
 *    2)通过循环获得[2, num)之间所有的整数，假设循环变量为i。
 *    3)在循环体内部判断num是否能被i整除，也就是判断num是否为质数。
 *  实现思路：采用假设法来实现。
 *    a)在循环之前，先假设num是一个质数，设置flag标记的值为true
 *    b)在循环体中，如果num%i==0，则推翻假设，设置flag标记的值为false，并跳出循环
 *    c)在循环之后，如果flag值依旧为true，则证明是一个质数，否则证明不是一个质数。
 * 4、在控制台先打印矩形，然后再打印平行四边形，再然后打印等腰三角形
 * 5、9x9乘法表
 * 6、搬砖问题：36块砖，36个人搬，男搬4块，女搬3块，两个小孩搬1块，要求一次搬完，
 * 问需要男、女、小孩各多少人？
 * 百钱买百鸡，公鸡一只5文钱，母鸡一只3文钱，小鸡3只1文钱，请问百钱买百鸡有几种买法，不能为0
 */
public class LoopPractice {
    public static void main(String[] args) {
        work1();
        work2();
        work3();
        work4();
        work5();
        work6();
        chicken();
    }

    private static void chicken() {
        for (int i = 1; i <20 ; i++) {
            for (int j = 1; j <33 ; j++) {
                for (int k = 3; k < 99; k+=3) {
                    if (i+j+k==100 && 5*i+3*j+k/3==100){
                        System.out.println("公鸡："+i+'\n'+"母鸡："+j+'\n'+"小鸡："+k+'\n');
                    }
                }

            }

        }
    }

    private static void work6() {
        for (int x=0;x<=9;x++){
            for (int y=0;y<=12;y++){
                for (int z=0;z<=36;z+=2){
                    if (x+y+z==36 && 4*x+3*y+z/2==36){
                        System.out.println("男人"+x+"人"+'\n'+"女人"+y+"人"+'\n'+"孩子"+z+"人"+'\n');
                    }
                }
            }
        }
    }

    private static void work5() {
        for (int i=1; i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }

    private static void work4() {
        //矩形
        for (int i=1; i<6; i++){
            for(int j=1;j<9;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //平行四边形
        for (int i=1;i<6;i++){
            //填充空格
            for (int j=1; j<6-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<9;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //等腰三角形
        for (int i=0;i<5;i++){
            for (int j=0; j<5-i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void work3() {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个正整数：");
        int num = input.nextInt();
        for (int i=2; i<num; i++){
            if (num%i==0){
                System.out.println(num+"不是个质数");
                break;
            }
        }
    }

    private static void work2() {
        int n=1;
        while (n>0){
            if (n%3==2 && n%5==3 && n%7==4) {
                System.out.println("最少需要" + n + "人");
                break;
            }
            n++;
        }
    }

    private static void work1() {
        for (int i =1; i<=100; i++){
            if (i%5!=0)
                continue;
            System.out.println(i);
        }
    }
}

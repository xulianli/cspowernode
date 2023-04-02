package com.cspowernode.practice;

import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/8 14:13
 * @Description
 * 1.输入任意一个三位数，然后判断该三位数是否是水仙花数，提示水仙花数就是个位的立方+十位的立方+百位的立方等于当前这个数字；-->153
 * 2.<数据类型和运算符作业.doc>中的编程题的第四题；
 * 3.输入任意一个字符，然后判断该字符是数字还是大写字母还是小写字母，提示我们只能输入一个字符串，要通过charAt(0)来得到字符；
 */
public class Homework {
    public static void main(String[] args) {
        work1();
        work2();
        work3();
    }

    private static void work3() {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("请输入任意一个字符：");
        String str = sc3.next();
        char testChar = str.charAt(0);
        if (testChar >= '0' & testChar <='9'){
            System.out.println("该字符为数字");
        }else if (testChar >= 'A' & testChar <='Z'){
            System.out.println("该字符为大写字母");
        }else if (testChar >= 'a' & testChar <='z'){
            System.out.println("该字符为小写字母");
        }else {
            System.out.println("该字符既不是数字也是大写字母也不是小写字母");
        }
    }

    private static void work2() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入一个4位正整数：");
        int num2 = sc2.nextInt();
        int firstDigit = (num2%10+5)%10;
        int secondDigit = ((num2/10%10)+5)%10;
        int thirdDigit = ((num2/100%100)+5)%10;
        int fourthDigit = (num2/1000+5)%10;
        System.out.println("加密后的数字为："+ firstDigit + secondDigit + thirdDigit + fourthDigit);

    }

    private static void work1() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入任意一个三位数：");
        int num = sc1.nextInt();
        int hundred = num/100;
        int ten = num/10%10;
        int one = num%10;
        if ((one*one*one + ten*ten*ten + hundred*hundred*hundred)==num){
            System.out.println("这是水仙花数");
        }
        else {
            System.out.println("这不是水仙花数");
        }
    }
}

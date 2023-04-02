package com.cspowernode.teaching.p1;

import java.util.Random;
import java.util.Scanner;

/**
 * @author 汪洋
 * @Date 2023/3/9 10:39
 * @Description
 * 求和的代码模型和计数器的代码模型
 * 1.输入一个正整数n，计算1+2+3+…+n的和；
 * 2.输出1到1000之间既能被5整除又能被3整除的数，并且每行输出5个
 * 3.求100到999之间的水仙花数。
 * 4.游戏10次，然后统计石头剪刀布赢的次数
 * 5.判断某个数字是否是质数
 *
 * 快捷键：alt+↑
 */
public class ForWork {
    public static void main(String[] args) {
//        work1();
//        work2();
//        work3();
//        work4();
//        work5();
        work6();
    }

    private static void work6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = sc.nextInt();
        //质数：只能被除了1和本身整除，其他都不能整除
        //1.把从2到数字本身这个范围内进行循环
        for(int i = 2;i<=num;i++){
            //2.如果对你要求的数字只对本身整除等于0，就代表前面都没有整除成功，因为下面的else会把前面整除成功的
            //情况排除掉
            if(num%i==0&&num==i){
                System.out.println("该数字是质数");
            //3.设置排除条件，如果对前面任意一个数字整除成功了，就代表不是质数
            }else if(num%i==0){
                System.out.println("不是质数");
                break;
            }
        }
    }
    private static void work5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = sc.nextInt();
        //质数：只能被除了1和本身整除，其他都不能整除
        //1.在循环外部标记一个变量，随意给类型和值
        int flag = 0;
        for(int i = 2;i<num;i++){
            if(num%i==0){
                //2.在循环内部满足条件的情况下，为该变量进行修改值
                flag = 1;
                System.out.println("不是质数");
                break;
            }
        }
        //3.在循环结束之后判断该标记是否被改变过
        if(flag==0){
            System.out.println("是质数");
        }
    }

    private static void work4() {
        //1.定义变量来统计赢的次数
        int count = 0;
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("=================================================================");
        //2.定义一个10次的循环
        for(int i = 0;i<10;i++){
            //3.把之前的代码复制进来
            int pc = ran.nextInt(3);
            System.out.println("请输入石头剪刀布:");
            String order = sc.next();
            System.out.println("计算机出的是："+(pc==0?"石头":pc==1?"剪刀":"布"));
            System.out.println("你出的是："+order);
            if(pc==0&&"石头".equals(order)||pc==1&&"剪刀".equals(order)||pc==2&&"布".equals(order)){
                System.out.println("你们平啦~");
            }else if(pc==0&&"剪刀".equals(order)||pc==1&&"布".equals(order)||pc==2&&"石头".equals(order)){
                System.out.println("你输啦~");
            }else if(pc==0&&"布".equals(order)||pc==1&&"石头".equals(order)||pc==2&&"剪刀".equals(order)){
                System.out.println("你赢啦~");
                //4.在赢的判断条件里面对计数器进行加1
                count++;
            }else{
                System.out.println("兄弟你别输乱七八糟的东西哈");
            }
        }
        //5.循环结束之后，输出具体的结果
        System.out.println("=================================================================");
        System.out.println("总共玩了10次游戏，你赢了"+count+"次，表现的"+(count>=6?"还不错":"很菜"));
    }

    private static void work3() {
        for(int num = 100;num<1000;num++){
            //1.拆出个位、十位和百位
            int bai = num/100;
            int shi = num/10%10;
            int ge = num%10;
            //2.算出它们的立方和
            int result = bai*bai*bai+shi*shi*shi+ge*ge*ge;
            //3.进行if的判断
            if(result==num){
                System.out.println(num+"是一个水仙花数");
            }
        }
    }

    private static void work2() {
        //1.在循环外部定义变量计数器
        int count = 0;
        //2.完成1-1000的for循环
        for(int i = 1;i<=1000;i++){
            //3.进行判断是否能被3和5都整除
            if(i%3==0&&i%5==0){
                //4.输出该数字
                System.out.print(i+"\t");
                //5.每进入一次if条件，就代表输出了一次，所以计数器要加1
                count++;
                //6.判断计数器是否是5的倍数--->对5整除等于0
                if(count%5==0){
                    System.out.println();
                }
            }
        }
    }

    private static void work1() {
        int n = 10;
        //1.定义一个求和的变量sum
        int sum = 0;
        //2.进行指定的for循环
        for(int i = 1;i<=n;i++){
            //3.把每个循环的值和sum进行相加，加了之后再次赋值给sum本身
            sum+=i;
        }
        System.out.println("从1到"+n+"的和为："+sum);
    }
}

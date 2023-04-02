package com.cspowernode.practice;

import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/10 19:16
 * @Description
 * 随机一个1-100的随机数，然后让你来猜，猜对了就结束循环然后告诉你猜了多少次，每次猜完之后会提示你是猜大了还是猜小了，
 */
public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("猜1到100的数：");
        int count =0;
        int num = (int) (Math.random()*100)+1;
        while (true){
            count++;
            int input = sc.nextInt();
            if (input<num)
                System.out.println("猜小了");
            else if (input>num)
                System.out.println("猜大了");
            else if (input==num) {
                System.out.println("猜对了，一共猜了" + count + "次");
                break;
            }
        }
    }
}


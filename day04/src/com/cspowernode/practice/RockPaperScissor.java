package com.cspowernode.practice;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/8 14:19
 * @Description
 * 跟计算机来完成石头剪刀布的游戏，你出的石头剪刀布由Scanner来获取，计算机的石头剪刀布是靠随机数来获取的，
 * 你可以简单的来定义一个规则，0代表石头，1代表剪刀，2代表布，那么这样你就只需要随机0-2的随机数就可以得到计
 * 算机的一个手势了，注意，如果你要用字符串的判断，那么要使用equals
 */
public class RockPaperScissor {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("石头剪刀布，你出：");
        String input = sc.next();
        if (!"石头剪刀布".contains(input)){
            System.out.println("输入不正确");
            return;
        }
        Random ran = new Random();
        //获取0到2整数
        int ranNum = ran.nextInt(3);
        String rps = "石剪布";
        System.out.println("电脑出："+rps.charAt(ranNum));
        if (input.charAt(0)==rps.charAt(ranNum)){
            System.out.println("平局");
        }
        else if (input.equals("石头")&&ranNum==1 || input.equals("剪刀")&&ranNum==2
                || input.equals("布")&&ranNum==0){
            System.out.println("你赢了！");
        }
        else {
            System.out.println("你输了");
        }*/
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int count = 0, point=0;
        while (count<10) {
            int pc = ran.nextInt(3);
            //2.提示你输入石头剪刀布
            System.out.println("请输入石头剪刀布:");
            //3.获取你输入的石头剪刀布
            String order = sc.next();

            if (!"石头剪刀布".contains(order)) {
                System.out.println("输入不正确");
                return;
            }
            //4.进行判定
            System.out.println("计算机出的是：" + (pc == 0 ? "石头" : pc == 1 ? "剪刀" : "布"));
            if (pc == 0 && "石头".equals(order) || pc == 1 && "剪刀".equals(order) || pc == 2 && "布".equals(order)) {
                System.out.println("平局");

            } else if (pc == 0 && "剪刀".equals(order) || pc == 1 && "布".equals(order) || pc == 2 && "石头".equals(order)) {
                System.out.println("你输啦~");

            } else if (pc == 0 && "布".equals(order) || pc == 1 && "石头".equals(order) || pc == 2 && "剪刀".equals(order)) {
                System.out.println("你赢啦~");
                point += 1;
            }
            count++;

        }
        System.out.println("你的最终得分是："+point);

    }

}

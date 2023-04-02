package com.cspowernode.practice;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author 徐联理
 * @Date 2023/3/14 9:35
 * @Description
 * 双色球有33个蓝球和16个红球，我们买双色球的时候，是不能出现球重复的，来模拟完成一次购买双色球的机选过程，要求
 * 最后是排好序的；
 */
public class Practice9 {
    public static void main(String[] args) {
        Random random = new Random();
        int [] blue = new int[6];
        int[] pool = new int [33];
        for (int i = 0; i < 33; i++) {
            pool[i]=i+1;
        }
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(33);
            if (pool[index]!=-1){
                blue[i]=pool[index];
                pool[index]=-1;
            }
            else{
                i--;
            }
        }
        Arrays.sort(blue);
        int[] lottery=Arrays.copyOf(blue,7);
        lottery[6]=(int)(Math.random()*16)+1;
        System.out.println("开奖结果为：蓝球"+Arrays.toString(blue)+" 红球["+lottery[6]+"]");
    }
}

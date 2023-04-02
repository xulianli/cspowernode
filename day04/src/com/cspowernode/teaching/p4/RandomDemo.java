package com.cspowernode.teaching.p4;

import java.util.Random;

/**
 * @author 汪洋
 * @Date 2023/3/7 16:10
 * @Description
 * Random类的使用
 * 1.Random类是一个帮助我们生成各种类型的随机数的类；
 * 2.Random类怎么使用
 *  a.实例化操作
 *      Random ran = new Random();
 *  b.确定自己要产生的随机数类型
 *      ①.产生的整数类型：int num = ran.nextInt();
 *      ②.产生指定范围内的整数类型：int num = ran.nextInt(int bounds);
 *      注意:获取到指定范围内的整数，你一旦写了参数，那么取值范围就是[0,bounds-1]
 *      比如：ran.nextInt(5);就代表会取到[0,4]任意一个数字；
 *      ③.产生小数：double num = ran.nextDouble();
 *      ④.产生布尔：boolean flag = ran.nextBoolean();
 *  c.获取到随机数然后来做剩下的操作
 * 3.Math类里面也提供了一个求随机数的方法，并且这个方法不需要我们单独实例化就能够直接使用
 *  Math.random()--->获取到一个0-1的小数随机数
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random ran = new Random();
        //获取随机整数
        System.out.println(ran.nextInt());
        //获取随机指定范围内的整数
        System.out.println(ran.nextInt(100)+1);
        //获取随机小数
        System.out.println(ran.nextDouble());
        //获取随机真假
        System.out.println(ran.nextBoolean());
        //通过Math.random()来获取一个随机小数(0,1)
        System.out.println(Math.random());
        //问：如何通过Math.random()来获取一个1-10范围内的整数？
        System.out.println((int)(Math.random()*10)+1);
    }
}

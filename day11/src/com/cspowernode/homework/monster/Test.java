package com.cspowernode.homework.monster;

/**
 * @Author 徐联理
 * @Date 2023/3/17 19:41
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        snakeMon snake1 = new snakeMon();
        centiMon centi1= new centiMon();
        snake1.attack();
        snake1.healing();
        snake1.movement();
        System.out.println("=================================");
        centi1.attack();
        centi1.movement();
    }
}

package com.cspowernode.homework.monster;

/**
 * @Author 徐联理
 * @Date 2023/3/17 19:38
 * @Description
 */
public class centiMon extends Monster{
    public centiMon() {
        name="蜈蚣乙";
        hp=60;
        dmg=15;
    }

    @Override
    void attack() {
        System.out.println("怪物"+name+"展开攻击"+"\n"+
                "当前生命值是："+hp+"\n"+ "攻击力是："+dmg);
    }

    @Override
    void movement() {
        System.out.println("我是蜈蚣精，御风飞行");;
    }
}

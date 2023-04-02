package com.cspowernode.homework.monster;

/**
 * @Author 徐联理
 * @Date 2023/3/17 19:19
 * @Description
 */
public class snakeMon extends Monster{

    public snakeMon() {
        name="蛇妖甲";
        hp=5;
        dmg=20;
    }

    @Override
    void attack() {
        System.out.println("怪物"+name+"展开攻击"+"\n"+
                "当前生命值是："+hp+"\n"+ "攻击力是："+dmg);
    }

    void healing(){
        if (hp<10){
            hp += 20;
            System.out.println("设施大蛇补血术。。。。，当前生命值是："+hp);
        }
    }

    @Override
    void movement() {
        System.out.println("我是蛇怪，我走S型路线");;
    }
}

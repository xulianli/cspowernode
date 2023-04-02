package com.cspowernode.teaching.p1;

import java.util.Arrays;

/**
 * @Author 汪洋
 * @Date 2023/3/16 10:14
 * @Description
 * 烤地⽠
 * 	需求：有一个地瓜类，地瓜类里面有如下几个属性：被烤的时间和地⽠状态以及地瓜的放了哪些调料(字符串数组)
 * 	如下就是被烤的时间和对应的地⽠状态：
 * 	0-3分钟：⽣的
 * 	3-5分钟：半⽣不熟
 * 	5-8分钟：熟的
 * 	超过8分钟：烤糊了
 * 	然后有一个烤地瓜的方法(参数是时间，每次烤的时候都要积累烤的时长并且更新状态)和添加的调料的方法以及展示
 * 	地瓜状态的方法(toString()、display())：
 */
public class PotatoDemo {
    public static void main(String[] args) {
        Potato p = new Potato();
        p.cook(3);
        p.addSeasoning("辣椒面");
        p.cook(2);
        p.addSeasoning("胡椒");
        p.cook(3);
        p.addSeasoning("盐");
        System.out.println(p);
    }
}
class Potato{
    int totalTime;//总计被烤的时长
    String status;//状态
    String [] seasonings = {};//调料

    public void cook(int time){
        //1.把单次烤的时间和之前已经烤的时间累加起来
        totalTime+=time;
        //2.根据题意来更新状态
        if(totalTime<=3&&totalTime>=0){
            status = "生的";
        }else if(totalTime>3&&totalTime<=5){
            status = "半生不熟";
        }else if(totalTime>5&&totalTime<=8){
            status = "熟的";
        }else{
            status = "烤糊了";
        }
    }

    public void addSeasoning(String seasoning){
        //添加调料之前先扩容
        seasonings = Arrays.copyOf(seasonings, seasonings.length+1);
        //把调料放入到该数组的最后一个位置去
        seasonings[seasonings.length-1] = seasoning;
    }
    public void addSeasoning(String ... seasonings){
        //添加调料之前先扩容
        this.seasonings = Arrays.copyOf(this.seasonings, this.seasonings.length+seasonings.length);
        //把调料放入到该数组的后面去
        System.arraycopy(seasonings,0,this.seasonings,this.seasonings.length-seasonings.length,seasonings.length);
    }

    public String toString() {
        return "地瓜被烤了"+totalTime+"分钟，当前的状态是:"+status + "，它添加了以下调料：\n"+Arrays.toString(seasonings);
    }
}

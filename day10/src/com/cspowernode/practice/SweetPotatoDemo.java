package com.cspowernode.practice;

import java.sql.Array;
import java.util.Arrays;

/**
 * @Author 徐联理
 * @Date 2023/3/16 9:19
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
public class SweetPotatoDemo {
    public static void main(String[] args) {

    }
}

class sweetPotato{
    double time;
    String status;
    String[] ingredients;

    public void cook(double time){
        this.time +=time;
        if (time>=0 && time<=3)
            status = "生的";
        else if (time>3 && time<=5)
            status = "半生不熟";
        else if(time>5 && time<=8)
            status = "熟的";
        else
            status = "烤糊了";
    }

    void addIngrediant(String ingrediant) {
        ingredients = Arrays.copyOf(ingredients, ingredients.length + 1);
        ingredients[ingredients.length - 1] = ingrediant;
    }

    String tostring(){
        return "地瓜是"+status;
    }
}

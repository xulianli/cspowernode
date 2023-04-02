package com.cspowernode.teaching.p3;

import java.util.Arrays;

/**
 * @Author 汪洋
 * @Date 2023/3/16 16:41
 * @Description
 * 有一个家具类，该类里面有如下属性：家具名称、家具占地⾯积，然后有一个展示家具信息的方法toString,然后在此基础上再定义
 * 一个房⼦类,它有如下属性：房⼦地理位置、房⼦占地⾯积、房⼦剩余⾯积、房⼦内家具列表，它有如下方法：搬家具进房子、
 * 显示房屋信息toString；最后构建demo进行测试，往房子里面搬家具，直到放满；
 */
public class HouseDemo {
    public static void main(String[] args) {
        Furniture furniture1 = new Furniture("桌子",2);
        Furniture furniture2 = new Furniture("椅子",6);
        Furniture furniture3 = new Furniture("床",20);
        Furniture furniture4 = new Furniture("柜子",30);
        Furniture furniture5 = new Furniture("游泳池",70);
        House house = new House("南天门108号",120);
        house.addFurniture(furniture1);
        System.out.println(house);
        house.addFurniture(furniture2);
        System.out.println(house);
        house.addFurniture(furniture3);
        System.out.println(house);
        house.addFurniture(furniture4);
        System.out.println(house);
        house.addFurniture(furniture5);
        System.out.println(house);
    }
}
class House{
    String houseLocation;
    double houseSize;
    double remandSize;
    Furniture [] furnitures = {};

    public House(String houseLocation, double houseSize) {
        this.houseLocation = houseLocation;
        this.houseSize = houseSize;
        this.remandSize = houseSize;
    }

    public void addFurniture(Furniture furniture){
        //1.判断剩余面积是否还能容纳的下家具
        if(furniture.furnitureSize>remandSize){
            System.out.println("家具放不进来！");
            return;
        }
        //2.如果能容纳，那么把家具放进来
        furnitures = Arrays.copyOf(furnitures, furnitures.length+1);
        furnitures[furnitures.length-1] = furniture;
        //3.更新剩余面积
        this.remandSize-=furniture.furnitureSize;
    }

    @Override
    public String toString() {
        return "House{" +
                "位置：'" + houseLocation + '\'' +
                ", 房子面积：" + houseSize +
                ", 剩余面积：" + remandSize +
                ", 家具列表：" + Arrays.toString(furnitures) +
                '}';
    }
}
class Furniture{
    String furnitureName;
    double furnitureSize;

    public Furniture(String furnitureName, double furnitureSize) {
        this.furnitureName = furnitureName;
        this.furnitureSize = furnitureSize;
    }

    @Override
    public String toString() {
        return "{" +
                "furnitureName='" + furnitureName + '\'' +
                ", furnitureSize='" + furnitureSize + '\'' +
                '}';
    }
}

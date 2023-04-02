package com.cspowernode.practice;

import java.util.Arrays;

/**
 * @Author 徐联理
 * @Date 2023/3/16 16:05
 * @Description
 * 2.有一个家具类，该类里面有如下属性：家具名称、家具占地⾯积，然后有一个展示家具信息的方法toString,然后在此基础上再定义
 * 一个房⼦类,它有如下属性：房⼦地理位置、房⼦占地⾯积、房⼦剩余⾯积、房⼦内家具列表，它有如下方法：搬家具进房子、
 * 显示房屋信息toString；最后构建demo进行测试，往房子里面搬家具，直到放满；
 */
public class HouseDemo {
    public static void main(String[] args) {

    }
}
class Furniture{
    String name;
    double area;

    @Override
    public String toString() {
        return "Furniture{" +
                "名称：'" + name + '\'' +
                ", 面积：" + area +
                '}';
    }
}

class House{
    String location;
    double hArea;
    double leftArea;
    Furniture[] furList ={};

    public House() {
    }

    public House(String location, double hArea) {
        this.location = location;
        this.hArea = hArea;
        this.leftArea = hArea;
    }

    public void moveFur(Furniture furniture) throws Exception {
        if (leftArea >= furniture.area) {
            furList=Arrays.copyOf(furList,furList.length+1);
            furList[furList.length-1]= furniture;
            leftArea -= furniture.area;
        }
        else {
            throw new Exception("剩余面积不足");
        }
    }


    @Override
    public String toString() {
        return "House{" +
                "location='" + location + '\'' +
                ", hArea=" + hArea +
                ", leftArea=" + leftArea +
                ", furList=" + Arrays.toString(furList) +
                '}';
    }
}

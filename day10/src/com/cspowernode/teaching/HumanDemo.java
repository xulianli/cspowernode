package com.cspowernode.teaching;

/**
 * @Author 汪洋
 * @Date 2023/3/16 9:04
 * @Description
 * 有一个Human类，里面有一个结婚的方法，要求结婚的时候，男女的年龄都不得小于20岁，
 * 并且必须是异性结婚，而且还不能重婚，根据需求来设计该类里面应该具有的属性和方法的参数，
 * 然后书写HumanDemo类来构建多个不同的Human对象，不同Human对象之间来进行结婚来测试结婚方法
 * 是否正确！
 */
public class HumanDemo {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.name = "zhangsan";
        human1.age = 29;
        human1.sex = "男";
        Human human2 = new Human();
        human2.name = "lisi";
        human2.age = 22;
        human2.sex = "女";
        human2.isMarried = false;
        System.out.println(human1.getMarry(human2));
    }
}
class Human{
    String name;
    int age;
    String sex;
    boolean isMarried;

    public boolean getMarry(Human other){
        if(age<20||other.age<20){
            System.out.println("年龄还没到呢，小屁孩");
            return false;
        }else if(sex.equals(other.sex)){
            System.out.println("去美国那边可以让你同性结婚");
            return false;
        }else if(isMarried||other.isMarried){
            System.out.println("你们其中一人已经结过婚了，先去离婚");
            return false;
        }
        System.out.println("新婚快乐，早生贵子");
        return true;
    }
}

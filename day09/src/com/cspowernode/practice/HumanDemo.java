package com.cspowernode.practice;

/**
 * @Author 徐联理
 * @Date 2023/3/14 19:34
 * @Description
 * 3.有一个Human类，里面有一个结婚的方法，要求结婚的时候，男女的年龄都不得小于20岁，并且必须是异性结婚，而且还不能重婚，
 *  * 根据需求来设计该类里面应该具有的属性和方法的参数，然后书写HumanDemo类来构建多个不同的Human对象，
 *  * 不同Human对象之间来进行结婚来测试结婚方法是否正确
 */
public class HumanDemo {
    public static void main(String[] args) throws Exception {
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        Human human4 = new Human();
        human1.name = "徐联理";
        human1.age = 21;
        human1.gender = 0;
        human2.name = "赵美延";
        human2.age = 20;
        human2.gender = 1;
        human3.name = "汪老师";
        human3.age = 30;
        human3.gender = 0;
        human3.married = true;
        human4.name = "小埋";
        human4.age = 15;
        human4.gender = 1;
        human1.getMarry(human1,human2);
        human2.getMarry(human2,human3);
        human3.getMarry(human3,human2);
        human4.getMarry(human1,human4);

    }
}

    class Human{
    String name;
    int age;
    int gender; // 0代表男性，1代表女性
    boolean married;

    void getMarry(Human human1, Human human2) throws Exception {
            if (human1.gender == human2.gender)
                throw new Exception("同性之间无法结婚");
            if (human1.age<20 || human2.age<20)
                throw new Exception("年龄未到合法年龄");
            if (human1.married || human2.married)
                throw new Exception("不能重婚！");
        System.out.println("祝"+human1.name+"和"+human2.name+"两位新人百年好合！");
        human1.married=true;
        human2.married=true;
        }
    }

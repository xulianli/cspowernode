package com.cspowernode.teaching.p2.work;

/**
 * @Author 汪洋
 * @Date 2023/3/14 16:36
 * @Description
 * 编写 Java 程序用于显示人的姓名和年龄。定义一个人类Person。 该类中应该有两个属性：
 *  姓名 （name） 和年龄 （age） 。再定义显示（display()） 方法将姓名和年龄打印出来
 */
public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "zhangsan";
        p1.age = 19;
//        p1.display();
        System.out.println(p1);
    }
}
class Person{
    String name;
    int age;
//    public void display(){
//        System.out.println("name:"+name+",age:"+age);
//    }
    public String toString() {
        return "name:"+name+",age:"+age;
    }
}

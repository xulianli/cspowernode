package com.cspowernode.teaching.p4;

/**
 * @Author 汪洋
 * @Date 2023/3/25 15:41
 * @Description
 * 案例2：使用枚举来约束属性的值类型
 */
public class EnumDemo2 {
    public static void main(String[] args) {
        Person p1 = new Person(1001,"zhangsan",Sex.MALE);
        Person p2 = new Person(1002,"lisi",Sex.FEMALE);
        System.out.println(p1);
        System.out.println(p2);
    }
}
class Person {
    int id;
    String name;
    Sex sex;

    public Person(int id, String name, Sex sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
enum Sex{
    MALE,FEMALE
}
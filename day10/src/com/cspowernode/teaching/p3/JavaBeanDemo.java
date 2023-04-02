package com.cspowernode.teaching.p3;

import java.io.Serializable;

/**
 * @Author 汪洋
 * @Date 2023/3/16 14:20
 * @Description
 * javaBean规范
 * 1.什么是JavaBean规范
 *  JavaBean规范并不是语法规范，它是专门针对实体类的书写格式规范，因为在实际开发过程中，是团队合作进行开发，如果
 *  不规范其对于类的书写方式的话，那么配合起来将带来很大的麻烦，所以就统一使用这种规范来书写实体类；
 * 2.什么是实体类
 *  a.数据库中的表在Java中所对应的类；
 *  b.当某个类你能在现实中找到对应的事务时，这就是实体类；
 * 3.JavaBean规范有哪些细则
 *  a.必须要有包
 *  b.属性私有化(private)
 *  c.提供属性的get、set方法
 *  d.提供无参构造函数
 *  e.实现序列化接口--->IO流的时候讲解
 */
public class JavaBeanDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.setPId(1001);
        p.setPName("zhangsan");
        p.setPAge(19);
        p.setPSex("男");
    }
}
class Person implements Serializable {
    private int pId;
    private String pName;
    private int pAge;
    private String pSex;
    //如果有有参构造函数的需求的话，就单独写无参，否则不需要写构造函数
    /*public Person() {
    }

    public Person(int pId, String pName, int pAge, String pSex) {
        this.pId = pId;
        this.pName = pName;
        this.pAge = pAge;
        this.pSex = pSex;
    }*/

    public int getPId() {
        return pId;
    }

    public void setPId(int pId) {
        this.pId = pId;
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    public int getPAge() {
        return pAge;
    }

    public void setPAge(int pAge) {
        this.pAge = pAge;
    }

    public String getPSex() {
        return pSex;
    }

    public void setPSex(String pSex) {
        this.pSex = pSex;
    }
}

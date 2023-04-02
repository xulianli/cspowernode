package com.cspowernode.teaching.p3;

/**
 * @Author 汪洋
 * @Date 2023/3/14 17:03
 * @Description
 * get、set方法的使用
 * 前言：
 *  在之前的学习过程中，我们发现属性的取值和赋值都是使用同一种写法：对象名.属性，这样的话不大好区分，我们如果
 *  要为属性进行赋值的话，也不方便进行非法校验，以及有些属性名称如果想隐藏起来或者是属性值想换一种表现形式，按照
 *  之前的写法都无法正常使用；
 *  a.取值和赋值方式相同；
 *  b.无法在赋值的时候进行非法校验；
 *  c.无法在取值的时候隐藏属性名称或者是隐藏属性值；
 * 1.get方法用来取代取值
 *  a.get方法的语法：
 *      public 属性的类型 getXXX(){
 *          return 属性
 *      }
 *      比如：
 *      public int getAge(){
 *          return age;
 *      }
 *  b.get方法可以在安全系数要求高的场合隐藏属性的名称--->只有特殊的场合才会使用
 *      比如你的属性名是username，那么我们可以在方法上面写成getUname(){}
 *  c.get方法可以隐藏真实的数据
 *      比如你的性别在数据库里面存储的方式是0代表男，1代表女，那么你如果直接拿值就是拿到
 *      1或者0，我们就可以通过get方法来返回男或者女
 * 2.set方法用来取代赋值
 *  a.set方法的语法
 *      public void setXXX(属性类型 属性变量名){
 *          属性名 = 属性变量名
 *      }
 *      比如：
 *      public void setAge(int age1){
 *          age = age1;
 *      }
 *  b.set方法能够进行数据的非法校验
 *      public void setAge(int age1){
 *          if(age1<0||age1>150){
 *              throw new XXXX()
 *          }
 *          age = age1;
 *      }
 * 3.如何让属性只能通过get、set方法来操作，而不能让你直接使用对象名.属性名的形式来操作--->private
 */
public class GetAndSetDemo {
    public static void main(String[] args) {
        //在没有get、set方法的情况下取值赋值都是直接对象名.属性
        Person person = new Person();
        //赋值
        person.name = "zhangsan";
        //取值
        System.out.println(person.name);
        person.sex = 1;
        System.out.println(person.getSex());
    }
}
class Person{
    int pid;
    String name;
    int sex;//0是男，1是女，2是未知
    int age;
    //为属性添加get方法
    public int getPid(){
        return pid;
    }
    //可以隐藏真实的数据，给用户提供他想看到的以及看的懂的数据
    public String getSex(){
        return sex==0?"男":sex==1?"女":"未知";
    }
    //可以进行赋值的时候完成数据校验
    public void setSex(int sex1){
        if(sex1<0||sex1>2){
            throw new IllegalArgumentException("性别数据有误");
        }
        sex = sex1;
    }

}

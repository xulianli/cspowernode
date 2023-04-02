package com.cspowernode.practice;

/**
 * @Author 徐联理
 * @Date 2023/3/14 16:22
 * @Description
 * 2、编写 Java 程序用于显示人的姓名和年龄。定义一个人类Person。 该类中应该有两个属性：
 *  姓名 （name） 和年龄 （age） 。再定义显示（display()） 方法将姓名和年龄打印出来
 *  再为其姓名和午龄加上对应的get、set方法，并且需要判断年龄和性別的合法，
 *  在 main 方法中创建人类的实例然后信息显示
 */
public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("李武");
        person1.setAge(23);
        person1.display();
    }
}
    class Person{
       private String name;
       private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String input){
        name = input;
    }

    public void setAge(int inputAge){
        if (inputAge<0 || inputAge > 100)
            throw new IllegalArgumentException("年龄数据有误");
        age = inputAge;
    }

    public void display(){
        System.out.println(name+", "+age+"岁");
    }


}

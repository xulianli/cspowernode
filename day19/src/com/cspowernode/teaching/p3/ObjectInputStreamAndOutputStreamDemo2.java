package com.cspowernode.teaching.p3;

import java.io.*;

/**
 * @Author 汪洋
 * @Date 2023/3/28 16:46
 * @Description
 * 序列化和反序列化在使用过程中的注意事项
 * 1.反序列化的验证
 *  当我们的序列化文件想进行反序列化回对象的时候，那么我们必须要遵循一点，这个类对象中的serialVersionUID
 *  值要一样，如果不一样就会造成反序列化失败；
 * 2.serialVersionUID是什么
 *  serialVersionUID是JVM自动通过属性类型、属性名称来生成的一个不会发生重复的long类型的数字，这个数字的
 *  作用就是在反序列的时候用来核实要反序列化的对象是否和序列化的对象所在的类是同一个的；
 * 3.能否绕过serialVersionUID的验证
 *  可以，因为原来serialVersionUID值是通过类型和名称来自动生成的，那么我们可以手动书写一个该数据值，然后
 *  在你修改了属性或者其名称的时候，该值也不变，那么就可以完成反序列化了，但是会造成修改之后的属性赋值失败；
 * 4.我们修改serialVersionUID这个值有什么用
 *  可以直接修改之后不让别人访问
 * 5.我们也可以通过IDEA手动加一个不会发生重复的serialVersionUID
 *  打开IDEA中的setting，然后搜索Serializable，找到without 'serialVersionUID'的地方勾选中就可以了
 */
public class ObjectInputStreamAndOutputStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.先完成序列化操作
        /*ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("dog.ser"));
        Dog dog = new Dog("哮天犬","黑色",100);
        out.writeObject(dog);
        out.close();*/
        //3.反序列化操作
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("dog.ser"));
        Dog other = (Dog) in.readObject();
        System.out.println(other);
        in.close();
    }
}
//2.把属性的名字修改一下
class Dog implements Serializable {
    private static final long serialVersionUID = 28569790874950684L;
    //4.手动加上static final long serialVersionUID = 1L，不让系统自动生成
//    private static final long serialVersionUID = 1L;
    String name1;
    String color;
    int age;

    public Dog(String name1, String color, int age) {
        this.name1 = name1;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name1='" + name1 + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}

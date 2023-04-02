package com.cspowernode.teaching.p3;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author 汪洋
 * @Date 2023/3/28 15:36
 * @Description
 * 深层复制和浅层复制的区别
 * 1.Java中所有自带的复制都是浅层复制
 *  a.clone()
 *  b.System.arraycopy()
 * 2.两种场合来测试对象是深层复制还是浅层复制--->浅层
 *  a.数组里面的元素存的是引用数据类型，然后把该数组对象进行复制，复制一份出去之后，如果
 *  源数组里面的元素修改其内容，影响了另外一个数组里面对应元素的内容，那么就证明，数组的
 *  元素并没有复制一份出来；
 *  b.自定义类里面拥有另外一个自定义类作为该类的属性，那么如果使用clone来赋值这个自定义类
 *  的话，它里面的自定义类属性也会进行复制，但是复制过去的是地址值，于是也出现了修改其中
 *  一个对象里面的自定义属性值会影响另外一个的情况；
 * 3.浅层复制和深层复制的区别
 *  a.浅层复制是Java中的默认复制方式，它的效率很高，在基本数据类型和String作为其属性或者
 *  是元素时不存在浅层和深层；
 *  b.深层复制在Java中都需要额外进行实现(重写clone方法、序列化和反序列化)，但是一般情况下
 *  我们都不会让对象使用深层复制，除非是你需要实现对象的持久化存储或者是数据的传输
 *
 * 注意：此处没有演示clone的基本使用，用兴趣的同学可以去了解下Cloneable接口的使用以及如何
 * 通过重写clone完成深层复制
 */
public class DeepCopyDemo {
    @Test
    public void test(){
        //1.测试数组中的复制
        //1.1.构建一个元素是引用数据类型的数组
        Person [] persons1 = {new Person(1001,"zhangsan"),new Person(1002,"lisi")};
        //1.2.完成复制
        Person[] persons2 = Arrays.copyOf(persons1, persons1.length);
        //1.3.测试复制之后的2个数组对象是否相同
        System.out.println(persons1==persons2);
        //1.4.测试两个数组中的元素地址值是否相同
        System.out.println(persons1[0]==persons2[0]);
        //1.5.修改persons1里面元素的内容会影响到persons2对应元素的内容
        persons1[0].name = "liudehua";
        System.out.println(persons2[0]);
    }
    class Person{
        int id;
        String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}


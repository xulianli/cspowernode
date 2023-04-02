package com.cspowernode.teaching.p3;

import org.junit.Test;

import java.io.*;

/**
 * @Author 汪洋
 * @Date 2023/3/28 15:56
 * @Description
 * 序列化和反序列化的使用
 * 1.序列化是完成对象转为文件的过程，反序列化就是从文件恢复成对象的过程；
 * 2.序列化所对应的类是ObjectOutputStream,使用的方法就是writeObject(Object obj)
 * 反序列化对应的类是ObjectInputStream,使用的方法就是readObject()
 * 3.序列化对象的后缀名是ser,所以看到ser结尾的文件咱们就要知道它是对象所对应的磁盘文件；
 * 4.要实现序列化和反序列化的话，那么你要操作的对象所属的类一定要实现序列化接口才行：Serializable
 * 5.Serializable接口的作用就是为了标识该类支持序列化，JVM只能操作被该接口标识了的类来进行序列化和
 * 反序列化；
 * 6.如果一个类里面拥有另外一个自定义类型作为其属性，那么若要序列化当前类对象的话，那么属性所在的
 * 类也要实现序列化接口，否则会报异常；
 */
public class ObjectInputAndOutputStreamDemo {
    @Test
    public void test() throws IOException, ClassNotFoundException {
        /*//1.序列化过程
        //1.1.构建一个序列化对象
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
        //1.2.创建一个Person对象
        Person person = new Person(1001,"zhangsan");
        //1.3.完成序列化
        out.writeObject(person);
        //1.4.关流
        out.close();
        //2.反序列化
        //2.1.构建一个反序列化对象
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
        //2.2.读取文件并且返回对应的对象
        Person other = (Person) in.readObject();
        //2.3.输出看结果
        System.out.println(other);
        //2.4.关流
        in.close();
        //2.5.对比对象是否完成了复制
        System.out.println(person==other);*/
        //3.演示如何使用序列化和反序列化来实现深层复制
        //3.1.构建一个序列化对象
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person1.ser"));
        //3.2.创建一个Person对象
        Person person = new Person(1001,"zhangsan",new Book(10,"三国志",20));
        //3.3.完成序列化
        out.writeObject(person);
        //3.4.构建一个反序列化对象
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("person1.ser"));
        //3.5.读取文件并且返回对应的对象
        Person other = (Person) in.readObject();
        //3.6.对比对象是否完成了复制
        System.out.println(person==other);
        //3.7.对比里面的属性是否一样
        System.out.println(person.book==other.book);
        //3.8.关流
        in.close();
        out.close();

    }
}
class Person implements Serializable {
    int id;
    String name;
    Book book;
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(int id, String name, Book book) {
        this.id = id;
        this.name = name;
        this.book = book;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", book=" + book +
                '}';
    }
}
class Book implements Serializable {
    int bid;
    String bname;
    double bprice;

    public Book(int bid, String bname, double bprice) {
        this.bid = bid;
        this.bname = bname;
        this.bprice = bprice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", bprice=" + bprice +
                '}';
    }
}


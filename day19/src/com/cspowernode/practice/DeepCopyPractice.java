package com.cspowernode.practice;

import java.io.*;

/**
 * @Author 徐联理
 * @Date 2023/3/28 16:12
 * @Description
 */
public class DeepCopyPractice {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Book book1 = new Book("红楼梦",10001,13.99);
        Student1 stud = new Student1("wangwu",1001, book1);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("bookstud.ser"));
        out.writeObject(stud);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bookstud.ser"));
        Student1 otherstud = (Student1) ois.readObject();
        System.out.println(stud==otherstud);
        System.out.println(stud.book==otherstud.book);
        out.close();
        ois.close();
    }
}

class Student1 implements Serializable {
    String name;
    int sid;
    Book book;

    public Student1(String name, int sid, Book book) {
        this.name = name;
        this.sid = sid;
        this.book = book;
    }

    @Override
    public String toString() {
        return "Student1{name=" + name + ", sid=" + sid + ", book=" + book + '}';
    }
}
class Book implements Serializable{
    String name;
    int bid;
    double price;

    public Book(String name, int bid, double price) {
        this.name = name;
        this.bid = bid;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{name='" + name + ", bid=" + bid + ", price=" + price + '}';
    }
}

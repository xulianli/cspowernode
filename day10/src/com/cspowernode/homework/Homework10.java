package com.cspowernode.homework;

import java.util.Arrays;

/**
 * @Author 徐联理
 * @Date 2023/3/16 17:19
 * @Description
 * 借书案例：
 * 	a.构建一个Book类，该类里面有id、name、price，合理构建构造函数；
 * 	b.构建一个Person类，该类里面有id，name，sex，age，合理构建构造函数；
 * 	c.在Person类里面添加Book属性，增加2个方法，分别是borrowBook和returnBook，要求借书成功，则book属性
 * 	的值就是你借的书，还书成功，那么book属性的值置null，合理构建这两个方法；
 * 	d.假设一个人可以借4本书，那么上述案例怎么改？
 */
public class Homework10 {

}

class Book{
    String ID;
    String Name;
    double Price;

    public Book() {
    }

    public Book(String ID, String name, double price) {
        this.ID = ID;
        Name = name;
        Price = price;
    }

    @Override
    public String toString() {
        return
                "ID:'" + ID + '\'' +
                ", 书名：'" + Name + '\'' +
                ", 价格：" + Price +
                '}';
    }
}

class Person {
    String ID;
    String Name;
    String Sex;
    int Age;
    Book[] bookList = {};
    Book book;

    public Person() {
    }

    public Person(String ID, String name, String sex, int age) {
        this.ID = ID;
        Name = name;
        Sex = sex;
        Age = age;
    }

    public void borrowBook(Book book) {
        this.book = book;
    }

    public void returnBook(Book book) {
        this.book = null;
    }

//    public void borrowBook(Book... books) {
//        if (books.length > 4) {
//            throw new ArrayIndexOutOfBoundsException();
//        } else {
//            bookList = Arrays.copyOf(bookList, bookList.length+books.length);
//            System.arraycopy(books,0,bookList,bookList.length-books.length,books.length);
//        }
//    }
//
//    public void returnBook(Book... books) {
//        if (books.length > 4) {
//            throw new ArrayIndexOutOfBoundsException();
//        } else {
//
//        }
//    }
}
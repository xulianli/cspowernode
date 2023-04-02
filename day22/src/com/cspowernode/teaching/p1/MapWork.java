package com.cspowernode.teaching.p1;

import java.util.*;

/**
 * @Author 汪洋
 * @Date 2023/4/1 14:46
 * @Description
 * 使用List和Map存放多个图书信息，遍历并输出。其中图书属性：编号，名称，单价，出版社；使用商品编号
 * 作为Map中的key
 */
public class MapWork {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>(Arrays.asList(
                new Book(101,"三国演义",19.9,"人民出版社"),
                new Book(102,"操作系统",59.9,"机械工业出版社"),
                new Book(103,"数据结构",69.9,"北京出版社")
        ));
        for (Book book : bookList) {
            System.out.println(book);
        }
        System.out.println("-------------------------------------------------------");
        Map<Integer,Book> bookMap = new HashMap<>();
        bookMap.put(101,new Book(101,"三国演义",19.9,"人民出版社"));
        bookMap.put(102,new Book(102,"操作系统",59.9,"机械工业出版社"));
        bookMap.put(103,new Book(103,"数据结构",69.9,"北京出版社"));
        Set<Map.Entry<Integer, Book>> entries = bookMap.entrySet();
        for (Map.Entry<Integer, Book> entry : entries) {
            System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
        }
    }
}
class Book{
    int id;
    String name;
    double price;
    String publisher;

    public Book(int id, String name, double price, String publisher) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}

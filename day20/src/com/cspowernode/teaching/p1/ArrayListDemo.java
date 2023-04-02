package com.cspowernode.teaching.p1;

import java.io.Serializable;
import java.util.*;

/**
 * @Author 汪洋
 * @Date 2023/3/30 16:48
 * @Description
 * ArrayList的使用
 * 1.ArrayList是List接口下的一个实现类，它通过数组的形式来实现了有序、允许重复以及有下标的功能；
 * 2.ArrayList里面只额外新增了以下2个方法：
 *  a.removeRange():删除范围
 *  b.ensureCapacity():扩容
 *  其他的方法都是以数组的形式来实现了List里面的抽象方法
 * 3.ArrayList里面的很多判断元素是否存在等方法所调用的是equals，所以如果你把该ArrayList里面存放
 * 引用数据类型的话，那么该类型一定要重写equals方法，否则无法完成判定
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //1.这种一次性创建多个对象的方式的特点就是书写快捷方便，但是只能读
        List<Book> books1 = Arrays.asList(
                new Book(101,"三国志",19.9),
                new Book(102,"红楼梦",29.9),
                new Book(103,"西游记",39.9)
        );
        //2.这样创建可以读可以写，但是稍微麻烦一点要借助构造函数来进行优化才行
        List<Book> books2 = new ArrayList<>(Arrays.asList(
                new Book(101,"三国志",19.9),
                new Book(102,"红楼梦",29.9),
                new Book(103,"西游记",39.9)
        ));
        //3.这样创建也可以读和写，它需要借助Collections的addAll方法才能做到
        List<Book> books3 = new ArrayList<>();
        Collections.addAll(books3,
                new Book(101,"三国志",19.9),
                new Book(102,"红楼梦",29.9),
                new Book(103,"西游记",39.9)
        );
        //4.使用contains方法来查看对象是否存在
        Book other = new Book(101,"三国志",19.9);
        System.out.println(books1.contains(other));
    }
}
class Book{
    int id;
    String name;
    double price;
    public Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && Double.compare(book.price, price) == 0 && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
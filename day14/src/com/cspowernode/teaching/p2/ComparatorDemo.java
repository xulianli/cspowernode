package com.cspowernode.teaching.p2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author 汪洋
 * @Date 2023/3/21 10:48
 * @Description
 * 比较器的使用--->Comparator
 * 1.假设我们现在有一个需求，需要对自定义类的对象数组进行自定义排序，我们发现在Arrays类里面有一个sort方法
 * 该方法有2个参数，第二个参数就是Comparator对象，通过观察可以知道Comparator是一个接口，也就是说如果我们
 * 要放该对象就需要定义一个子类去实现该接口并重写里面的compare方法，然后它就会按照我们在compare里面书写的
 * 排序逻辑进行排序；
 * 2.自定义排序的实现步骤
 *  a.先定义一个自定义类
 *  b.定义一个该类对象的数组
 *  c.定义一个子类，该子类实现Comparator接口，并重写compare方法
 *      ①.如果你要按照某个属性升序，那么使用o1.属性-o2.属性
 *      ②.如果你要按照某个属性降序，那么使用o2.属性-o1.属性
 *      ③.如果你要判断在某个属性相同的情况下再来进行下一步的排序，那么写if(o1.属性==o2.属性){下一步的排序}
 *  d.调用Arrays.sort(数组对象,自定义类对象)完成自定义的排序
 * 注意：如果我们要比较的属性是引用数据类型，那么我们就要调用该引用数据类型对象所在类的compareTo方法来进行
 * 排序
 * 问题：如果该类是我们自己建的，里面没有compareTo那么该怎么办呢？
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        Book [] books = {
                new Book(1001,"sanguoyanyi",19.9),
                new Book(1003,"shuihuzhuan",39.9),
                new Book(1002,"hongloumeng",29.9),
                new Book(1004,"xiyouji",29.9)
        };
        Arrays.sort(books);
        Arrays.sort(books,new MyComparator());
        System.out.println(Arrays.toString(books));
    }
}
class MyComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        //id的降序
//        return o2.bid-o1.bid;
        //name的升序
//        return o1.name.compareTo(o2.name);
        //price的降序
//        return (int) (o2.price-o1.price);
        //price的降序，如果price相同，则按照id的升序
        if(o1.price==o2.price){
            return o1.bid-o2.bid;
        }
        return (int) (o2.price*100-o1.price*100);
    }
}
class Book {
    int bid;
    String name;
    double price;

    public Book() {
    }

    public Book(int bid, String name, double price) {
        this.bid = bid;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

package com.cspowernode.teaching.p2;

/**
 * @Author 汪洋
 * @Date 2023/3/16 10:32
 * @Description
 * 构造函数的使用
 * 0.前言
 *  在前面学习如何创建对象的时候，我们知道new后面那个其实是一个函数，那么我们就会有以下2个问题：
 *  a.既然是函数为什么类里面却找不到这个函数？
 *  b.既然是函数为什么不遵循小驼峰命名法，而且要和类名一样？
 * 1.构造函数是什么
 *  我们知道类是一个模板，我们可以通过类来构建出对象，那么类是怎么把对象给构建出来的，这里就要用
 *  到构造函数，所以如果说类是一个用来生产对象的工厂的话，那么构造函数就是该工厂的生产车间；
 * 2.构造函数有什么特点
 *  a.编译器会默认提供一个无参的构造函数，但是如果你手动写了构造函数，那么编译器将不会给你提供构造
 *  函数；
 *  b.构造函数可以写有参和无参两种，但是如果我们写了有参就意味着编译器提供的无参会消失，但是无参构造
 *  函数在后期是有使用的场合的，所以我们一般来说如果你手动写了有参，请把无参也加上；
 *  c.构造函数和成员函数不一样的地方有如下几点：
 *      ①.构造函数没有除了访问控制修饰符(public、private、不写)之外的其他修饰词；
 *      ②.构造函数必须和类名一样
 *      ③.构造函数没有返回类型,连void都没有
 * 3.构造函数里面的代码块到底有什么用，该怎么写
 *  a.为什么默认的构造函数里面没有任何的逻辑也能完成对象的构建
 *      因为我们调用构造函数的时候，此时这个类才会被类加载器去加载，并且才会在堆中生成该对象，以及
 *      堆中的对象会完成属性的初始化；
 *  b.那么有参的构造函数的好处是什么
 *      可以让对象一创建出来属性初始化之后就开始进行赋值，简化了我们创建对象并且赋值的过程
 *  c.构造函数除了可以创建对象、属性赋值之外还能做什么？
 *      你想让对象创建的时候就进行哪些逻辑操作，都可以写在这里面
 * 4.对象创建出来的步骤
 *  a.先是类加载器加载字节码文件
 *  b.然后再在堆中生成对象
 *  c.完成对象中的属性的初始化
 *  d.调用构造函数
 */
public class ConstructorDemo {
    public static void main(String[] args) {
        //如果使用无参构造函数来构建对象
        Book book1 = new Book();
        book1.name = "三国演义";
        book1.bid = 1001;
        book1.price = 19.9;
        //使用了有参构造函数之后
        Book book2 = new Book(1002,"红楼梦",29.9);
        System.out.println(book1);
        System.out.println(book2);

    }
}
class Book{
    int bid;
    String name;
    double price;
    public Book(){
    }
    public Book(int bid,String name,double price){
        this.bid = bid;
        this.name = name;
        this.price = price;
    }
    public String toString() {
        return "bid:"+bid+",name:"+name+",price:"+price;
    }
}

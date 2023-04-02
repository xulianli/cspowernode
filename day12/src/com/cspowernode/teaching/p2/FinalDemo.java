package com.cspowernode.teaching.p2;

/**
 * @Author 汪洋
 * @Date 2023/3/18 11:16
 * @Description
 * final的使用
 * 1.final代表最终的意思，所以它所修饰的资源都有最终的含义；
 * 2.final能修饰哪些资源
 *  a.全局变量：不能被改变
 *  b.局部变量：不能被改变
 *  c.方法：不能被重写
 *  d.类：不能被继承
 * 3.final使用过程中的注意事项
 *  a.final如果修饰的局部变量是基本数据类型，那么就是不能变，但是如果修饰的是对象，那么请注意，是
 *  对象的引用不能变，不代表对象里面的属性不能变；
 *  b.final如果修饰的是全局变量，那么必须保证该对象产生的时候，final修饰的属性是有值的，并且无法
 *  自动初始化
 *      ①.要么在声明的时候就完成赋值；
 *      ②.要么要保证在任何方式构建该对象的时候，该变量都是有值并且不变的；
 *  c.如果在调用方法的时候传递了final修饰的变量或者是形参是final修饰的，那么请注意，传递的只是值，
 *  跟修饰词无关
 */
public class FinalDemo {
    //1.3.final修饰的全局变量无法自动初始化
//    final int x;
    //1.4.要么一开始就有值，要么保证在任何情况下构建的对象里面它都是有值的
    final int x = 100;
    final int y;
    public FinalDemo() {
        y = 100;
    }
    public FinalDemo(int a) {
        y = 200;
    }

    public static void main(String[] args) {
        //1.final修饰的变量
        //1.1.变量是基本数据类型--->单纯的不能改变
        final int a = 100;
//        a = 200;
        //1.2.变量是引用数据类型
        final Book book = new Book();
        book.bid = 1001;
//        book = new Book();
        //1.5.如果调用了方法，那么不关心修饰词，只关心值，至于是否能被修改，取决于形参
        test1(a);
        test2(a);
    }
    //1.5.2.当形参是final修饰的时候，那么该值就是不能变的，跟实参无关
    private static void test2(final int a) {
//        a++;
    }

    //1.5.1.方法的形参没有被final修饰，所以随便你怎么修改，跟实参是否被final修饰无关
    private static void test1(int a) {
        a++;
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
}
//2.final修饰的类无法被继承
//class MyString extends String{
//
//}
class Father{
    public void t1(){}
    public final void t2(){}
}
class Son extends Father{
    //3.final修饰的方法无法被重写
//    public void t2(){
//    }
}
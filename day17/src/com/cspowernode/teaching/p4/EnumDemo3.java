package com.cspowernode.teaching.p4;

/**
 * @Author 汪洋
 * @Date 2023/3/25 15:45
 * @Description
 * 案例3：优化单例设计模式
 * 注意：
 *  1.枚举中的所谓常量名，其实都是调用的构造函数，并且这里的调用构造函数可以为不同的场合来起名字，让
 *  我们之前调用构造函数的方式变的多样化；
 *      以前：要new，每次调用不管逻辑如何名字一样
 *      现在：写名字，可以为不同的逻辑对象提供不同的名字
 *  2.枚举中的所谓常量名输出来的结果其实就是默认的toString，也就是说枚举类默认把toString重写了，并且
 *  重写成输出枚举常量的名称，如果不满意，你可以自己再次重写toString
 *  3.虽然枚举中提供了各种调用构造函数的名称，但是它遵循的是单例设计模式，即本质上你不管怎么通过常量名
 *  来构建对象，它每个常量名只会构建一次对象，所以才能被我们拿来使用在单例设计模式中；
 *  4.枚举中的常量名在有参数的情况下，你需要把数据给写死，所以它不适合需要灵活赋予对象值的场景；它适合于
 *  在需求中有写明具体数据的对象使用枚举来汇总起来；
 */
public class EnumDemo3 {
    public static void main(String[] args) {
        Book book1 = Book.BOOK;
        Book book2 = Book.BOOK;
        System.out.println(book1==book2);
        Book book3 = Book.MYBOOK;
        System.out.println(book3);
    }
}
enum Book{
    BOOK,MYBOOK(1001,"红楼梦",19.9);
    private int bid;
    private String bname;
    private double bprice;

    Book() {
        System.out.println("被调用了吗");
    }
    Book(int bid,String bname, double bprice) {
        this.bid = bid;
        this.bprice = bprice;
        this.bname = bname;
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

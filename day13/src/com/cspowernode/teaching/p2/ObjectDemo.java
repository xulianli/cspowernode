package com.cspowernode.teaching.p2;

import java.util.Objects;

/**
 * @Author 汪洋
 * @Date 2023/3/20 14:09
 * @Description
 * Object类的使用
 * 1.Object类是所有类的基类，包括数组；
 * 2.Object类里面的方法主要分为三大类：
 *  a.模板方法：从功能上来看，是所有子类都有可能会用到的方法，但是父类无法具体化，所以需要子类进行重写；
 *      ①.equals
 *      ②.hashcode
 *      ③.toString
 *  b.线程通信所涉及的方法：所谓线程通信指的就是一个线程在执行的时候可以和另外的线程进行通讯，让其等待
 *  或者唤醒；
 *      ①.notify
 *      ②.notifyAll
 *      ③.wait
 *  c.了解的方法
 *      ①.clone:直接创建出一个新的对象出来
 *      ②.finalized:执行垃圾回收操作,该操作不由我们进行控制，我们如果要调用会去调用System.gc()
 *      ③.getClass:获取到对象所对应的字节码对象，获取到字节码对象之后，也可以构建出对象出来，所以这也是
 *      构建对象的另外一种方式
 * 3.toString的使用
 *  a.返回对象的字符串表现形式,即我们想让某个对象怎么显示出来，我们就把该方法写成我们想要看的样子；
 *  b.默认情况下，它返回的是：getClass().getName() + '@' + Integer.toHexString(hashCode())
 *  即：全限定名+@+对象地址值进行哈希运算之后转为16进制
 *  c.我们在使用print输出对象的时候，都会默认调用该对象的toString方法，所以在输出语句中，我们不用
 *  再加toString方法；
 * 4.equals的使用
 *  a.java中判定对象是否相等有两种方式
 *      ①.判定是否是同一个(地址值是否相等)：双等号
 *      ②.判定对象里面的内容(属性值)是否相等：equals
 *  b.在默认情况下，我们定义出来的类里面的equals方法就是Object类里面的equals方法，而Object类里面的
 *  equals方法其实就是返回的双等号，所以如果我们想要额外进行对象内容的判定的话，就需要手动书写类里面的
 *  equals方法；
 *  c.模仿String类里面的equals方法来确定equals的书写步骤
 *      ①.如果参数为null，则返回false
 *      ②.如果当前对象和参数==为true，则返回true
 *      ③.如果参数对象不属于当前类，那么返回false
 *          1.instanceof
 *          2.getClass
 *      ④.如果参数对象属于当前类，那么进行强转，强转为当前类型
 *      ⑤.然后把当前对象的所有属性和参数对象的所有属性进行逐一比较
 *  问：如果你的Book类没有重写equals方法，又新增了一个Person类，该类里面拥有Book属性，那么你重写Person类
 *  的equals方法之后，测试看是否成功，如果不成功，为什么？
 *  d.如果你自定义类里面拥有另外一个自定义类对象，那么这个自定义类的equals是否能成功，取决于该类里面的那个
 *  自定义类对象所在的类是否重写了equals方法；
 * 5.hashcode方法的使用
 *  a.hashcode方法就是调用本地方法求对象的哈希码值，默认情况下，跟equals在默认情况下一样，都是对对象的地址值
 *  来进行操作；
 *  b.根据常规协定可以了解到hashcode方法需要跟equals方法保持一致：equals如果判定的是内存地址值，那么hashcode方法
 *  就是返回内存地址值的哈希码值，但是如果equals判定的是属性值，那么hashcode方法也要返回属性所对应的哈希码值
 *  c.如何书写hashcode方法
 *      Objects.hashcode(attribute ... attr)
 *  注意：equals里面用来比较了几个属性，那么在hashcode方法里面也必须使用这几个属性，务必保持一致
 * 6.==、equals和hashcode方法的关系
 *  a.==为true，则equals一定为true并且hashcode的值一定相等
 *  b.equals为true，则hashcode的值一定相等，但是==不一定为true
 *  c.hashcode的值相等，但是equals不一定为true，==也不一定为true
 *
 * 验证第三点：构建任意两个大小写字母的组合，然后让其两两之间进行比较hashcode值，看到底有多少个两个字母的组合的hashcode
 * 值是相同的，比如"ac".hashcode()=="de".hashcode()这就是一个；
 *
 */
public class ObjectDemo {
    public static void main(String[] args) {
        //1.演示常见的几种对象的输出toString是什么样子
        //1.1.数组对象
        int [] arr = {1,2,3};
        System.out.println(arr);
        char [] arr1 = {'a','b','c'};
        System.out.println(arr1);
        //1.2.String对象
        String str = "abc";
        System.out.println(str);
        //1.3.自定义类型对象
        Book book = new Book(1001,"三国演义",19.9);
        System.out.println(book);
        System.out.println(book.toString());
        //2.equals的使用
        //2.1.演示字符串来使用==以及equals的一些判定
        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = "ab"+'c';
        String s4 = 'a'+'b'+"c";
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        //2.2.演示在不重写equals的情况下，两个内容相同的Book对象是否equals为true
        Book book1 = new Book(1001,"三国演义",19.9);
        System.out.println(book==book1);
        System.out.println(book.equals(book1));
        //2.3.演示在没有重写Book类的equals的前提下，去重写了Person类的equals，看其是否有效果
        Person p1 = new Person(1001,"zhangsan",new Book(1001,"三国演义",19.9));
        Person p2 = new Person(1001,"zhangsan",new Book(1001,"三国演义",19.9));
        System.out.println(p1.equals(p2));
        //3.hashcode方法的使用
        //3.1.在没有重写Book类里面的hashcode方法，而已经重写了equals方法的时候，来对比其hashcode值是否相等
        System.out.println("---------------------------------------");
        System.out.println(book.equals(book1));
        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());
    }
}
class Person{
    int pid;
    String name;
    Book book;

    public Person(int pid, String name, Book book) {
        this.pid = pid;
        this.name = name;
        this.book = book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return pid == person.pid && this.name.equals(person.name) && this.book.equals(person.book);
    }
}
class Book{
    int bid;
    String name;
    double price;

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
    //优化版本
    public boolean equals(Object other){
        if(other==null||other.getClass() != this.getClass())
            return false;
        if(this==other)
            return true;
        Book book1 = (Book) other;
        return this.bid==book1.bid && this.name.equals(book1.name) && this.price == book1.price;
    }
    public int hashCode(){
        return Objects.hash(bid,name,price);
    }
    //原始写法
    public boolean equals1(Object other){
//        ①.如果参数为null，则返回false
        if(other==null)
            return false;
//        ②.如果当前对象和参数==为true，则返回true
        if(this==other)
            return true;
//        ③.如果参数对象不属于当前类，那么返回false
        if(other instanceof Book){
//        ④.如果参数对象属于当前类，那么进行强转，强转为当前类型
            Book book1 = (Book) other;
//        ⑤.然后把当前对象的所有属性和参数对象的所有属性进行逐一比较
            return this.bid==book1.bid && this.name.equals(book1.name) && this.price == book1.price;
        }
        return false;
    }
}

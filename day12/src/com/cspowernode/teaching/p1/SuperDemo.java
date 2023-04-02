package com.cspowernode.teaching.p1;

/**
 * @Author 汪洋
 * @Date 2023/3/18 10:02
 * @Description
 * super关键字的使用
 * 0.前言
 *  在前面的知识点中，我们发现了以下2个问题：
 *  a.如果子类重写了父类的方法，那么如何才能在子类中区分地调用父类和子类的方法呢？
 *  b.我们都知道子类可以调用父类的所有属性和方法，按照类的实例化过程来看，那么这个父类
 *  肯定也是在堆中会存在对象，这样我们才能调用其父类的资源的，那么父类的对象又是怎么创建
 *  出来的呢？
 * 1.super是什么
 *  我们知道this代表当前类对象，那么super就代表当前类的直接父类对象
 * 2.super能够干什么
 *  this能调用属性、方法、构造函数，那么super也可以调用属性、方法和构造函数
 * 3.在子类中使用super来调用资源和使用this来调用资源有什么区别？
 *  this会先找本类，再找父类，而super是直接找父类，所以当子类和父类有被覆盖的资源的时候，那么
 *  此时就可以使用super来区分开具体是哪个类的资源
 * 4.super在使用过程中的注意事项
 *  a.super调用构造函数和this一样，都只能位于构造函数的第一行，所以它们不可能同时出现；
 *  b.在子类的每个构造函数里面，都会默认出现一个super()，来调用父类的无参构造函数，如果你手动
 *  写了该调用构造函数的代码，那么默认的会消失；它所需要遵循的原则就是：在所有子类的构造函数执行
 *  之前，都会先执行父类的构造函数
 *  c.因为在所有子类的构造函数中都会默认执行super()，所以如果你父类去掉了无参构造函数，那么所有
 *  的子类构造函数都会报错，因为super()找不到父类的无参了，先解决该问题，要么强制给父类加无参，
 *  要么手动把所有子类的构造函数中的super()来进行改写指定调用哪个具体的有参；
 *
 */
public class SuperDemo {
    public static void main(String[] args) {
        Son son = new Son();
    }
}
class Father{
    int a = 10;
    int c = 40;
    public Father() {
        System.out.println("父类的构造函数");
    }
    public void test1(){
        System.out.println("父类的test1方法");
    }
}
class Son extends Father{
    int a = 20;
    int b = 30;

    public Son() {
        System.out.println("子类的构造函数");
    }
    public Son(int a) {
        this();
    }
    public void test1(){
        System.out.println("子类的test1方法");
    }
    public void test2(){
        System.out.println("子类的test2方法");
    }
    //该方法是用来测试调用资源的
    public void test3(){
        //当使用this和super来访问被覆盖后的属性时，它的访问顺序：
        //1.加不加this都代表有this，都代表先找本类的资源，找到之后，返回该资源
        //2.super就是直接找父类资源，跳过本类
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
        //当使用this和super来访问只有子类有，父类没有的资源时
        //使用super会报错
        System.out.println(this.b);
//        System.out.println(super.b);
        //当使用this和super来访问只有父类有，子类没有的资源时
        //this的访问顺序是先本类，再父类
        //super的访问顺序是直接跳过本类访问父类
        System.out.println(this.c);
        System.out.println(super.c);
    }
}

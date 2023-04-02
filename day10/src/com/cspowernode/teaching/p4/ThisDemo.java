package com.cspowernode.teaching.p4;

/**
 * @Author 汪洋
 * @Date 2023/3/16 15:34
 * @Description
 * this关键字的使用
 * 1.this是什么
 *  this代表的是当前对象，当对象在堆里面创建出来的时候，就会有this来指向创建出来的那个对象；
 * 2.this能够调用哪些资源
 *  a.属性
 *  b.方法
 *  c.构造函数
 *  注意：this调用构造函数是直接写this()，参数里面写什么，就对应匹配哪个构造函数
 * 3.this调用这三个资源的作用
 *  a.调用属性是为了区分全局变量和局部变量
 *  b.调用方法和构造函数是为了重载，减少代码量，优化代码结构
 * 4.this使用过程中的注意事项
 *  a.this调用构造函数只能在构造函数里面调，并且不允许自己调用自己，并且必须位于第一行；
 *  b.this关键字不允许出现在static方法中；
 *  c.this如果在构造函数里面，代表的是当前刚刚创建的这个对象，this如果在普通方法里面，代表
 *  的是谁调用这个方法，那么谁就是this
 */
public class ThisDemo {
    public static void main(String[] args) {
        //this如果出现在构造函数里面，代表的是刚刚新建的对象，而该对象是没有名字的；
        Test t1 = new Test(1,2);
        //this如果出现在普通方法里面，谁调用该方法，那么this就代表谁
        t1.test1();
    }
}
class Test{
    int a;
    int b;
    public Test(){
        //调用构造函数只能放在第一行
        System.out.println(123);
        //不能自己调用自己
//        this();
    }
    public Test(int a){
        this.a = a;
    }
    public Test(int a,int b){
        this.a = a;
        this.b = b;
    }
    public void test1(){
        //只能在构造函数里面调用构造函数
//        this();
        System.out.println(this.a);
    }
    public static void test2(){
        //static方法里面不允许出现this
//        System.out.println(this.a);
//        this.t1();
    }
}

package com.cspowernode.teaching.p3;

/**
 * @Author 汪洋
 * @Date 2023/3/18 14:19
 * @Description
 * 多态的使用
 * 1.什么是多态
 *  一个动作在不同场合的不同表现形式，多态是继承基础上的一种优化方式
 * 2.多态使用过程中的注意事项
 *  a.必须要有继承
 *  b.必须要使用父类指向子类对象
 *  c.必须要子类重写父类的方法
 * 3.多态的两种使用场景
 *  a.在参数上使用父类接收子类对象--->animal的案例
 *  b.在返回类型上使用父类接收子类对象--->phone的案例
 * 4.多态在使用过程中会碰到的问题
 *  a.父类接收子类对象的方式所得到的对象无法调用子类独有的资源
 *  b.父类接收子类对象的方式所得到的对象调用被覆盖之后的属性发现得到是父类的
 * 5.上面2个问题的解决方案所对应的知识点
 *  a.如何才能在多态的场合下来调用子类独有的资源--->引用数据类型的类型转换
 *      ①.向上转型：小类型转为大类型，自动转换
 *      ②.向下转型：大类型转为小类型，强制转换
 *      注意：Java中的向下转型只要是转为继承体系中的子类，那么都不会编译报错，但是如果你类型不匹配
 *      就会出现ClassCastException的异常
 *  b.向下转型的必要判断：instanceof关键字
 *      语法：对象 instanceof 类型--->boolean
 *  c.动态绑定和静态绑定
 *      ①.动态绑定：动态绑定就是子类重写了父类的方法，然后不管类型怎么变，方法都是随着对象走
 *      ②.静态绑定：静态绑定就是子类覆盖了父类的属性，然后不关心对象，只跟类型有关
 *      总结：动态绑定是方法，看的是对象，静态绑定是属性，看的是类型
 *      注意：静态方法跟重写无关，虽然能够子类和父类都存在相同的方法，但是它不是重写，它跟着
 *      类型走
 */
public class PolymorphismDemo {
    public static void main(String[] args) {
        //情况1：如果直接Son son = new Son()的话，那么该对象可以调用父类和子类中的所有资源
        //情况2：如果直接Father father = new Father()的话，那么该对象可以调用父类的所有资源
        //情况3：模拟多态的使用场景，使用父类来接收子类对象：Father father = new Son();
        Father son = new Son();
        //3.1.单独调用子类的所有资源：无法调用
//        System.out.println(son.c);
//        son.test3();
        //3.2.单独调用父类的独有资源：都可以调用
        System.out.println(son.a);
        son.test2();
        //3.3.调用被覆盖的资源：
        System.out.println(son.b);
        son.test1();
        //情况4：为了解决情况3中子类无法访问自己独有资源的问题，所以使用类型转换来强转
        Son son1 = (Son)son;
        System.out.println(son1.c);
        son1.test3();
        //情况5：我们可以在引用数据类型的转换过程中允许一个父类随意转为另外一个子类
//        AnotherSon son2 = (AnotherSon)son;
//        System.out.println(son2.d);
//        son2.test4();
        //优化上面的强转
        if(son instanceof Son){
            Son son3 = (Son) son;
            son3.test3();
        }else if(son instanceof AnotherSon){
            AnotherSon son3 = (AnotherSon) son;
            son3.test4();
        }
        System.out.println("--------------------------------------------");
        //动态绑定和静态绑定
        //1.当类型和对象都是子类时，此时被覆盖的属性和方法都是调用子类的
        Son s = new Son();
        System.out.println(s.b);
        s.test1();
        s.t1();
        //2.把子类对象的类型转为父类时
        Father f = s;
        System.out.println(f.b);
        f.test1();
        f.t1();
        //3.再把该类型强转为子类
        Son s1 = (Son)f;
        System.out.println(s1.b);
        s1.test1();
        s1.t1();
    }
}
class Father{
    int a = 10;
    int b = 20;
    public void test1(){
        System.out.println("父类独有的方法test1");
    }
    public void test2(){
        System.out.println("父类需要子类重写的方法test2");
    }
    public static void t1(){
        System.out.println("父类的静态方法");
    }
}
class Son extends Father{
    int b = 30;
    int c = 40;
    public void test1(){
        System.out.println("Son子类重写父类的方法test1");
    }
    public void test3(){
        System.out.println("Son子类独有的方法test3");
    }
    public static void t1(){
        System.out.println("子类的静态方法");
    }
}
class AnotherSon extends Father {
    int b = 50;
    int d = 60;
    public void test1(){
        System.out.println("AnotherSon子类重写父类的方法test1");
    }
    public void test4(){
        System.out.println("AnotherSon子类独有的方法test4");
    }
}
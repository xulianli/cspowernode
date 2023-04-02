package com.cspowernode.practice;

/**
 * @Author 徐联理
 * @Date 2023/3/18 11:03
 * @Description
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
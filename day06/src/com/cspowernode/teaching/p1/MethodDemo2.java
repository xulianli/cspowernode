package com.cspowernode.teaching.p1;

import org.junit.Test;

/**
 * @Author 汪洋
 * @Date 2023/3/10 14:18
 * @Description
 * 书写几个不同的方法结构来使用
 * 1.无返回类型、无参数
 * 2.有返回类型、无参数
 * 3.无返回类型、有参数
 * 4.有返回类型、有参数
 */
public class MethodDemo2 {
    @Test
    public void test(){
        //1.这种方法只能干调用，不能接收和传递数据
        t1();
        //2.这种有返回类型的方法，我们调用之后可以接收数据、直接把返回的数据打印出来、不做任何操作
        //2.1.接收数据
        float x = t2();
        //2.2.直接把返回的数据打印出来
        System.out.println(t2());
        //2.3.不做任何操作--->这个方法相当于你白调用了
        t2();
        //3.这种方法更加灵活，会根据你传递的数据来发生变化--->print(xxx)
        t3(10);
        t3(20);
        //4.这种方式最灵活，会随着你传递的数据来变化，并且把结果返回给你，你来决定这个数据是要展示
        //还是要进行下一步运算
        System.out.println(t4(3,2));
        int max = Math.max(t4(3,5),10);
        System.out.println(max);
    }
    //无返回类型、无参数：所做的事情非常单一并且不灵活，只能固定做某件事情
    public void t1(){
        System.out.println("这个方法永远只能做这件事情");
    }
    //有返回类型、无参数：会把数据返回给调用者让调用者进行进一步处理，仍然不够灵活
    public long t2(){
        return (int)(Math.random()*10);
    }
    //无返回类型、有参数：方法的执行结果会随着参数的变化而发生变化
    public void t3(int a){
        System.out.println("程序随着你的参数的变化而变化--->"+a*a*a);
    }
    //有返回类型、有参数：方法的执行结果会随着参数的变化而发生变化，并且我们会把结果返回给调用者，让调用者
    //拿到结果来做剩下的逻辑
    public int t4(int a,int b){
        for (int i = 0; i < b-1; i++) {
            a = a*2;
        }
        return a;
    }
}

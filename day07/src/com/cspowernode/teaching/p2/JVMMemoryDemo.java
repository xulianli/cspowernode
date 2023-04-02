package com.cspowernode.teaching.p2;

import java.util.Arrays;

/**
 * @Author 汪洋
 * @Date 2023/3/11 11:38
 * @Description
 * java虚拟机中的内存讲解
 * 1.栈结构(stack)
 *  a.栈结构在不同的线程里面是分为不同的线程栈(在没有学习多线程之前，JVM里面所执行的是main线程栈，所以
 *  所有的栈数据都在该main线程栈中)，在相同的线程栈中，不同的方法又拥有各自的方法栈，它们之间是互相隔离；
 *  b.栈用来存储局部变量的值还有变量名还有基本数据类型的值；
 *  c.栈是一个先进后出(FILO)的结构,里面存储的数据都是有序的存在，里面的数据被放进栈里面我们称之为压栈(入栈)，
 *  数据从栈里面使用然后消除我们称之为弹栈(出栈)
 * 2.堆结构(heap)
 *  a.堆是一个共享结构，所以的线程栈共享同一个堆里面的数据；
 *  b.堆是用来存储全局变量还有对象的;(只要是new出来的都是存在堆里面)
 *  c.堆里面存储数据是随机存储，存放完毕之后会存在一个内存地址值，地址值再交给栈里面的变量来指向，堆里面的对象
 *  一旦失去了栈里面变量的指向，那么将会被GC系统进行回收
 * 3.数组在堆里面是怎么存储的
 * 4.案例：基本数据类型和数组在内存中调用方法时的存储方式
 * 总结：
 *  a、如果参数传递的是基本数据类型，除非你又用实参变量名去接收方法的结果，否则形参无论怎么修改和实参无关；
 *  b、如果参数传递的是引用数据类型，那么形参的任何修改会直接影响到实参，除非形参重新指向了新的对象；
 *  在Java的方法中，传递的参数都是值传递；
 */
public class JVMMemoryDemo {
    public static void main(String[] args) {
        //针对基本数据类型的传递方法操作
        int a = 10;
        test1(a);
        a = test2(a);
        //针对数组的传递方法操作
        int [] arr = {1,2,3,4};
        test3(arr);
        int [] arr2 = test4(arr);
        int [] arr3 = test5(arr);
        //查看结果
        //1.arr和arr2指向同一个地址
        System.out.println(arr==arr2);
        arr[2] = 100;
        System.out.println(Arrays.toString(arr2));
        //2.arr3已经和arr以及arr2没有任何关系了，是一个新的对象，在方法里面创建出来的对象
        System.out.println(Arrays.toString(arr3));
    }
    private static int[] test5(int[] arr) {
        arr = new int[]{4,3,2,1};
        return arr;
    }
    private static int[] test4(int[] arr) {
        arr[0] = 10;
        return arr;
    }
    private static void test3(int[] arr) {
        arr[0] = 10;
    }
    private static int test2(int a) {
        a = a+10;
        return a;
    }
    private static void test1(int a) {
        a = a+10;
    }
}

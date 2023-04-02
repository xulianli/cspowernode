package com.cspowernode.teaching.p1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 汪洋
 * @Date 2023/3/23 10:18
 * @Description
 * Error的介绍以及常见Error的演示
 * 1.Throwable是所有异常的父类，它下面根据严重程度划分为两个大的体系：
 *  a.Error:一般来说跟程序员无关，是虚拟机或者是内存等硬件问题所导致的，所以这类错误一旦出现
 *  一般都要去看配置文件或者是硬件等相关信息；属于非常严重的错误；
 *  b.Exception:属于非严重错误，这种错误都可以由程序员来进行解决
 * 2.Exception的分类
 *  a.运行时异常(uncheckedException):RuntimeException及其子类属于运行时异常
 *  特点：运行时异常一旦出现，程序会停止，让你去改错误，一般来说运行时异常都是程序写错了，这里异常出现的
 *  时候编译器不会去检查你是否处理了这个错误，它希望错误出现让程序停掉
 *  b.检查时异常(checkedException):除了RuntimeException之外的所有Exception的子类就是检查时异常
 *  特点：检查时异常一旦出现，如果你不解决该错误，那么编译报错，直到你把错误给解决掉，检查时错误一般都
 *  跟程序逻辑无关，一般都是因为别人传递参数传错了导致的错误；
 * 3.Error中的几个常见的错误
 *  a.OutOfMemoryError:堆溢出
 *  b.stackOverFlowError：栈溢出
 */
public class ErrorDemo {
    public static void main(String[] args) {
//        test();
        List list = new ArrayList<>();
        while (true) {
            list.add(123);
        }
    }

    private static void test() {
        test();
    }

    //这里的代码是演示运行时和检查时这两大类异常的区别的
    public static void main1(String[] args) {
        //运行时异常：编译的时候不会去检查程序是否出错，在运行的时候出错就让程序停止下来
        String str = null;
//        System.out.println(str.length());
        //检查时异常：编译的时候会检查你调用的方法上面是否声明了异常类型，如果声明了并且声明的是检查时异常时
        //那么我们调用该方法的时候，就一定要给出这个异常一旦出现你要如何处理的预案；
        try {
            FileInputStream fis = new FileInputStream("d:/HelloWorld.java");
        } catch (FileNotFoundException e) {
            System.out.println("出现文件未找到的问题啦，这里可以写具体的逻辑");
        }
        System.out.println("运行到这里了吗");
    }
}

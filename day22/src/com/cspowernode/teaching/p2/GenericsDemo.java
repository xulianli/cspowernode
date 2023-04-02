package com.cspowernode.teaching.p2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 汪洋
 * @Date 2023/4/1 16:01
 * @Description
 * 泛型的使用
 * 0.前言
 *  在我们之前的学习过程中，我们会使用泛型来约束集合中元素的类型以及比较器方法里面指定具体的类型，那么
 *  使用泛型还有其他的好处吗？
 *  如果我们想在自己定义的类里面去使用泛型，那么我们该怎么做？
 * 1.通过案例来演示带泛型的好处
 *  a.把错误置前，让我们在编译阶段就能解决运行期会发生的异常
 *  b.避免进行强转，使用泛型之后，获取的数据就是泛型的类型
 * 2.泛型中会出现的一些考点
 *  a.泛型是JDK1.5出现的一个优化功能，并且该优化功能是基于编译器的，即这些泛型在class文件里面是不存在的
 *  ，因为JVM在处理同一种类型的时候效率是最高的，所以Sun公司就设置了泛型让我们在书写代码的时候约束我们
 *  的使用，但是进行编译的时候就会把所有的类型都转为Object来进行处理，像这一种在编译期约束类型，运行期
 *  抹掉类型的方式我们称之为《泛型的擦除》；
 *  b.我们在使用泛型来放元素之后，当我们要把数据给取出来的时候，我们发现数据其实是按照泛型的设置来得到的
 *  类型，那么这个类型其实就是在泛型擦除之前保存下来，然后让我们使用的时候再加进去的，所以这种技术我们称之
 *  为《泛型的擦除补偿》
 */
public class GenericsDemo {
    public static void main(String[] args) {
        //1.不带泛型的容器的一些问题
        List list = new ArrayList();
        list.add("abc");
        list.add(123);
        //1.1.添加进去的数据虽然是任意类型，但是取出来也会是任意类型(Object)，但是实际操作
        //肯定不能用Object，还是得多一道强转的过程
        Object o = list.get(0);
        String str = (String)list.get(0);
        System.out.println(str.length());
        //1.2.在取出元素的时候，因为类型不统一，所以会导致转换异常的出现
        String str1 = (String)list.get(1);
        //2.使用泛型来处理容器的时候
        List<String> list1 = new ArrayList<>();
        list1.add("aaa");
        //2.1.改进1：把原来使用的时候会发生的转换异常置前了，让我们编译的时候就能够处理掉，避免后期
        //运行异常；
//        list1.add(123);
        //2.2.改进2：获取元素可以不需要强转
        String s = list1.get(0);
    }
}

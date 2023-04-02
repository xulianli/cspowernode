package com.cspowernode.teaching.p2;

import java.util.*;

/**
 * @Author 汪洋
 * @Date 2023/4/1 16:26
 * @Description
 * 泛型的应用场合2--泛型定义在方法上
 * 1.泛型定义在方法上那么整个类就只有定义了泛型的这个方法能够使用该泛型，其他地方都不能使用该泛型，
 * 这种写法往往出现在工具类中，一个工具类只有某些方法提供了泛型；比如Arrays、Collections
 * 2.泛型定义在方法上的作用就是让该方法中的多个参数的类型或者是跟返回类型保持一致的；
 * 比如Collections.addAll(Collection<T>,T ... element)这个方法，就是让前面参数的泛型类型和
 * 后面可变参数的数据类型保持一致；
 * 比如Collections.max(Collection<T>)这个方法，就是让参数的泛型类型和返回值的类型保持一致的；
 * 3.如何使用
 *  a.在返回值前面声明该泛型
 *  b.然后就可以在参数上使用该泛型
 *  c.然后也可以在返回类型上使用该泛型
 */
public class GenericsMethodDemo {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(10,20,30,40));
        Integer max1 = Collections.max(list1);
        List<String> list2 = new ArrayList<>(Arrays.asList("10","20","30","40"));
        String max2 = Collections.max(list2);
        //调用自己写的方法
        List<Integer> list3 = new ArrayList<>(Arrays.asList(10,20,30,40));
        Integer max3 = GenericsMethod.max(list1);
        List<String> list4 = new ArrayList<>(Arrays.asList("10","20","30","40"));
        String max4 = GenericsMethod.max(list2);
        System.out.println(max3);
        System.out.println(max4);
    }
}
class GenericsMethod{
    public static <T extends Comparable> T max(Collection<T> col){
        //1.首先获取到迭代器对象
        Iterator<T> i = col.iterator();
        //2.拿到第一个元素
        T first = i.next();
        //3.判断是否还有第二个元素
        while (i.hasNext()) {
            //4.取出下一个
            T next = i.next();
            //5.调用compareTo方法来比较两个元素谁大，如果下一个大于前面的first
            if (next.compareTo(first) > 0)
                //6.那么就把下一个元素赋予给first
                first = next;
        }
        return first;
    }
}

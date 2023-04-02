package com.cspowernode.teaching.p2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author 汪洋
 * @Date 2023/3/21 14:59
 * @Description
 * Java中的永久比较器--->Comparable的使用
 * 1.Comparable也是一个接口，但是这个接口是需要直接写在你要进行排序的类中的，所以
 * 它带来的效果就是让实现了该接口的类永久具备某个固定的排序功能；
 * 2.只有实现了Comparable接口并重写了compareTo方法的类对象作为元素的数组才能直接
 * 调用Arrays.sort(Object [] arr)来进行指定规则的排序；
 * 3.Comparable比较器怎么用
 *  a.在你需要实现排序功能的类上实现该接口；
 *  b.重写该接口里面的compareTo方法，注意该方法只有一个参数，它的逻辑跟我们之前的
 *  compare方法是一样的，只不过compare中的o1相当于此时的this，o2相当于此时的参数对象；
 *  c.此时该类对象所在的任何容器就具备了默认的排序功能；
 * 4.总结和建议
 *  虽然这两种比较器都能对自定义进行排序，但是仍然建议同学们使用Comparator比较器，因为
 *  它比较灵活，想更换就可以马上写个比较工具然后完成新的排序，而Comparable更加适合于那种
 *  你确定以后不会发生变化的类来使用某个固定的排序规则；
 */
public class ComparableDemo {
    public static void main(String[] args) {
        Teacher [] teachers = {
                new Teacher(1001,"sanguoyanyi",19),
                new Teacher(1003,"shuihuzhuan",20),
                new Teacher(1002,"hongloumeng",19),
                new Teacher(1004,"xiyouji",21)
        };
        Arrays.sort(teachers);
        System.out.println(Arrays.toString(teachers));
    }
}
class Teacher implements Comparable<Teacher>{
    int pid;
    String name;
    int age;

    public Teacher() {
    }

    public Teacher(int pid, String name, int age) {
        this.pid = pid;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Teacher o) {
        //id的降序
//        return o.pid-this.pid;
        //name的升序
//        return this.name.compareTo(o.name);
        //age的降序
//        return o.age-this.age;
        //age的降序，如果age相同，则按照id的升序
        if(this.age==o.age){
            return this.pid-o.pid;
        }
        return o.age-this.age;
    }
}

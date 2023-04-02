package com.cspowernode.teaching.p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author 汪洋
 * @Date 2023/3/31 15:53
 * @Description
 * ListIterator的使用
 * 1.ListIterator是Iterator的子类，它在父类的基础上增加了以下几个功能：
 *  a.set:允许迭代过程中进行元素的修改
 *  b.add:允许迭代过程中进行元素的追加
 *  c.hasPrevious:允许从右往左边进行判断
 *  d.previous:允许从右往左获取元素
 *  e.list.listIterator(int index):允许通过集合构建ListIterator对象的时候指定其
 *  下标从哪里开始
 *  f.nextIndex、previousIndex:允许获取到下一个、上一个下标；
 * 2.如何选择Iterator和ListIterator
 *  你如果只是简单的删除或者是从头到尾的遍历，那么直接用Iterator即可，如果需求更加的
 *  复杂，那么就用ListIterator
 * 3.注意事项
 *  a.如果我们使用list.listIterator(int index)来构建ListIterator对象的话，那么该
 *  对象的next方法返回的就是index所对应的元素；
 *  b.如果一个ListIterator对象已经遍历到了尾部，此时它的nextIndex就等于该集合的长度
 *  c.如果一个ListIterator对象已经遍历到了首部，此时它的previousIndex就等于-1
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        //1.构建一个默认的ListIterator对象
        ListIterator<Integer> ite = list.listIterator();
        while (ite.hasNext()) {
            int next = ite.next();
            //1.1.add方法的使用
            if(next==30){
                ite.add(100);
            }
            //1.2.set方法的使用和nextIndex的使用
            if(ite.nextIndex()==3){
                ite.set(666);
            }
        }
        System.out.println(list);
        //2.直接拿着已经迭代结束的ListIterator来使用
        System.out.println(ite.nextIndex());//如果已经循环到末尾了，那么nextIndex等于该集合的size
        System.out.println(ite.previousIndex());//如果已经到首位了，则返回-1
        while(ite.hasPrevious()){
            int pre = ite.previous();
            System.out.print(pre+"\t");
        }
        //3.指定位置
        ite = list.listIterator(2);
        //你指定下标为几，那么next方法返回的就是该下标所对应的元素
        System.out.println(ite.next());
        System.out.println(ite.previous());
    }
}

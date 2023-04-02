package com.cspowernode.practice;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author 汪洋
 * @Date 2023/3/31 10:05
 * @Description
 * LinkedList的使用
 * 1.LinkedList是List接口下的一个实现类，它的底层是靠双向链表来实现的相关功能，因为底层
 * 是双向链表，所以该类的首尾操作速度快、元素的增删速度快、元素的查找速度慢；
 * 2.LinkedList的几个父接口都提供了对应的功能
 *  a.List:提供了有下标的对应操作方法-->略
 *  b.Collection:提供了元素的增删以及获取信息等操作方法-->略
 *  c.Iterable:提供了iterator方法能够完成元素的迭代-->略
 *  d.Queue:提供了首位删除、尾部添加的相关方法
 *      ①.element、peek：获取首位元素
 *      ②.remove、poll：删除首位元素
 *      ③.add、offer：尾部添加元素
 *  e.Deque:提供了针对首部和尾部的所有操作、还有针对栈的所有操作
 *      ①.getFirst、peekFirst：首位获取
 *      ②.getLast、peekLast：尾部获取
 *      ③.removeFirst、pollFirst:删除首位
 *      ④.removeLast、pollLast:删除尾部
 *      ⑤.addFirst、offerFirst：添加首位
 *      ⑥.addLast、offerLast：添加尾部
 *      ⑦.push:压栈，把数据压入到首位，等同于addFirst
 *      ⑧.pop:弹栈，把首位的数据删除掉，等同于removeFirst
 * 3.如果我们有针对栈的操作，那么尽量使用LinkedList或者是ArrayDeque来操作，不要使用
 * Stack类；
 * 4.List接口下的三个子类使用场景
 *  a.ArrayList：适合于经常查找的场景，因为底层是数组，自带下标，查找速度飞快；
 *  b.LinkedList:适合于经常进行首尾操作的场景，或者是增加和删除的场景，因为底层是链表；
 *  c.Vector：适合于多线程安全并且需要使用查找的场景，因为它和ArrayList的关系就类似于StringBuffer对应
 *  StringBuilder的关系；
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        //1.针对Queue接口所提供的操作方法演示
        Queue<Integer> queue = new LinkedList<>();
        Collections.addAll(queue, 10,20,30,40);
        //1.1.获取首位元素
        System.out.println(queue.element());
        System.out.println(queue.peek());
        //1.2.删除首位元素
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue);
        //1.3.尾部添加
        queue.add(50);
        queue.offer(60);
        System.out.println(queue);
        //2.针对Deque接口所提供的操作方法演示
        Deque<Integer> deque = new LinkedList<>();
        Collections.addAll(deque, 10,20,30,40);
        //2.1.首位添加操作
        deque.addFirst(50);
        deque.offerFirst(60);
        System.out.println(deque);
        //2.2.首位删除操作
        deque.removeFirst();
        deque.pollFirst();
        System.out.println(deque);
        //2.3.首位获取操作
        System.out.println(deque.getFirst());
        System.out.println(deque.peekFirst());
        //2.4.尾部添加操作
        deque.addLast(50);
        deque.offerLast(60);
        System.out.println(deque);
        //2.5.尾部删除操作
        deque.removeLast();
        deque.pollLast();
        System.out.println(deque);
        //2.6.尾部获取操作
        System.out.println(deque.getLast());
        System.out.println(deque.peekLast());
        //2.7.栈操作
        deque.push(100);
        System.out.println(deque.pop());
        System.out.println(deque);
    }
}

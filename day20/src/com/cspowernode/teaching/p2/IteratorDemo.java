package com.cspowernode.teaching.p2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @Author 汪洋
 * @Date 2023/3/30 16:57
 * @Description
 * 集合中的迭代器的使用
 * 1.因为Collection接口下面的各种子接口存放元素的方式都不一样，有些有序有些无序，所以导致使用
 * 传统的for循环以及foreach循环都有可能出现问题；
 *  a.for循环：在for循环过程中，如果你要添加或者删除元素的话，你必须要考虑到下标的增减问题，否则
 *  会出现遗漏元素；而且有些集合是没有下标的
 *  b.foreach循环：在循环过程中无法修改结构，一旦修改，就会发生异常：ConcurrentModificationException
 * 2.Iterable接口就是Collection框架里面所有类的一个迭代器接口，它里面提供了一个iterator的方法，所有
 * 的Collection子类都可以调用该方法从而获取到一个Iterator对象，该对象里面提供了对集合元素的迭代操作
 * 3.Iterator类提供的迭代方法
 *  a.hasNext():判断是否有下一个元素
 *  b.next():获取下一个元素
 *  c.remove():删除当前迭代到的元素
 *  注意：当我们通过Collection接口中的iterator方法得到一个Iterator对象时，此时就会把容器里面的所有
 *  元素按照当前排序规则放入到一个新的容器中，并且该容器里面具备指针，而且指向-1的位置；
 */
public class IteratorDemo {
    public static void main(String[] args) {
        //1.演示for循环和foreach循环在循环元素的时候如果操作元素会出现的BUG
        List<String> list = new ArrayList<>(Arrays.asList("aaa","bbb","ccc","ddd"));
        //1.1.使用for循环来演示
        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            if("bbb".equals(list.get(i))){
                list.remove(i);
            }
        }*/
        //1.2.使用foreach循环来演示
        /*for (String s : list) {
            if("bbb".equals(s)){
                list.remove(s);
            }
        }*/
        //2.使用Iterator迭代器进行迭代操作
        //2.1.调用Collection集合子类对象中的iterator方法：即把现有数据按照现有顺序存入到一个新的容器中
        //并且这两者之间存在映射关系，也就是说你修改了iterator里面的数据也会同步影响Collection容器里的
        //数据，此时文件指针指向-1
        Iterator<String> ite = list.iterator();
        //2.2.调用hasNext判断是否有下一个：看下标+1的地方是否不为null，但是并没有修改文件指针的值
        while(ite.hasNext()){
            //2.3.调用next方法把文件指针+1，然后获取对应的值
            //注意：如果你要查看数据，请使用断点，不要把next方法放入到输出语句中来使用，这样会跳过数据
//            System.out.println(ite.next());
            String next = ite.next();
            //2.4.做删除操作
            if("bbb".equals(next)){
                //注意：remove方法没有参数，迭代到了哪个元素就删哪个
                ite.remove();
            }
        }
        System.out.println(list);
    }
}

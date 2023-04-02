package com.cspowernode.teaching.p1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.*;
import java.util.Set;

/**
 * @Author 汪洋
 * @Date 2023/4/1 11:28
 * @Description
 * Map接口的使用
 * 1.Map接口是一个完全不同于Collection接口的另外一个体系结构，所以我们之前所学习的类型是
 * Collection的一些方法在此时是不通用，比如Collection中所有子类的构造函数写的就是Collection对象，
 * Map接口的特点就是里面的元素存储的是键值对；
 * 2.键值对的特点
 *  a.键不能重复
 *  b.值可以重复
 *  c.如果键相同、值不同的话，会进行覆盖；
 * 3.Map接口下的一些实现类
 *  a.HashMap-->HashSet:key具备HashSet的所有特点，其他就是多一个键值对的特点；
 *  b.LinkedHashMap-->LinkedHashSet:同上，只是多一个键值对的特点
 *  c.TreeMap-->TreeSet:同上，只是多一个键值对的特点
 * 4.键值对的相关API方法
 *  a.put(key,value):添加
 *  b.remove(key):删除
 *  c.get(key):根据key来获取到该key所对应的value
 *  d.containsKey(key):是否包含key
 *  e.containsValue(value):是否包含value
 *  f.keySet():把value舍弃掉，保留key得到一个Set集合
 *  g.entrySet():把键值对的数据打包成一个个Map.Entry对象，然后把该对象打包到一个Set集合里去
 * 5.Entry中的方法
 *  a.getKey()
 *  b.getValue()
 *
 * 练习：熟悉HashMap里面的方法，然后通过对TreeSet以及LinkedHashSet的了解来熟悉下对应的map类中的使用；
 * 练习：使用List和Map存放多个图书信息，遍历并输出。其中图书属性：编号，名称，单价，出版社；使用商品编号
 * 作为Map中的key。
 */
public class MapDemo {
    public static void main(String[] args) {
        //1.HashMap的使用
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101,"zhangsan");
        map.put(102,"lisi");
        map.put(103,"wangwu");
        //尝试放重复的数据
//        map.put(103,"wangwu");
        //尝试放key相同，value不同的数据--->修改
        map.put(103,"wangwu1");
        map.put(104,"zhaoliu");
        System.out.println(map);
        System.out.println(map.containsKey(105));
        System.out.println(map.containsValue("lisi"));
        map.remove(103);
        System.out.println(map);
        System.out.println(map.get(101));
//        System.out.println(map.size());
//        map.clear();
//        System.out.println(map.size());
        //迭代1：entrySet
        Set<Entry<Integer, String>> entries = map.entrySet();
        for(Entry<Integer, String> entry:entries){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
        //迭代2：keySet
        Set<Integer> set = map.keySet();
        Iterator<Integer> ite = set.iterator();
        while(ite.hasNext()){
            int key = ite.next();
            System.out.println(key+"-"+map.get(key));
        }
    }
}

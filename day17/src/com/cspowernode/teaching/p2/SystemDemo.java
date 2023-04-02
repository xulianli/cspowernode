package com.cspowernode.teaching.p2;

import java.util.Enumeration;
import java.util.Properties;

/**
 * @Author 汪洋
 * @Date 2023/3/25 11:28
 * @Description
 * System类的使用
 * 1.System类是lang包下的一个类，该类属于系统类，里面提供了很多系统相关的方法
 * 2.对应的方法有
 *  a.System.in
 *  b.System.out
 *  c.System.exit(0)
 *  d.System.currentTimeMillis()
 *  e.System.gc()
 *  f.System.getProperties():获取到相关的系统资源
 *  注意：user.dir这个属性
 */
public class SystemDemo {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        System.out.println(properties);
        //迭代Properties对象
        Enumeration enumeration = properties.propertyNames();
        while(enumeration.hasMoreElements()){
            String key = (String)enumeration.nextElement();
            System.out.println("key:"+key+",value:"+properties.getProperty(key));
        }
        System.out.println("-----------------------------------------------------");
        System.out.println(properties.getProperty("user.dir"));
    }
}

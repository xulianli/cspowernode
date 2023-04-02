package com.cspowernode.teaching.p2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author 汪洋
 * @Date 2023/3/25 11:18
 * @Description
 * Properties类的使用
 * 1.Properties类是Map接口下面的一个子类，它的特点有如下2点：
 *  a.存储数据是以键值对的形式来存储，比如name=zhangsan,age=19
 *  b.该类允许你创建一个后缀为properties的文件，并且在里面书写信息
 *  然后可以通过代码来把文件里面的数据给读取出来；
 * 2.properties对象如何加载properties文件里面的内容
 *  a.实例化Properties对象
 *  b.调用load方法来加载指定文件所对应的输入流
 *  c.使用getProperty方法来传入你要获取数据的key从而拿到对应的value
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        //1.实例化Properties对象
        Properties props = new Properties();
        //2.使用load方法来加载指定的输入流
        props.load(new FileInputStream("day17/src/info.properties"));
        //3.通过key来获取对应的value
        System.out.println("username:"+props.getProperty("username"));
        System.out.println("password:"+props.getProperty("password"));
    }
}

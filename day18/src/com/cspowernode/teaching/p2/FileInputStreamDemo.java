package com.cspowernode.teaching.p2;

import java.io.*;

/**
 * @Author 汪洋
 * @Date 2023/3/27 15:55
 * @Description
 * IO流的介绍及字节流的使用
 * 1.IO流需要熟悉的一些概念
 *  a.IO代表什么含义：I(Input),O(Output)
 *  b.I代表输入对应的是读，需要指定你要读取的源文件，O代表输出对应的是写，不需要你创建
 *  目标文件，只需要你指定目标文件是进行覆盖操作还是追加操作
 *  c.了解Stream流它所代表的含义其实就是byte数据在源文件、程序以及目标文件中进行流动
 *  的意思；
 *  d.熟悉IO流中的一些分类
 *      ①.你是用来处理文件还是文本
 *          如果是文件，那么使用字节流，如果是文本，那么使用字符流
 *      ②.你是读还是写
 *          如果是读，那么就是输入流，如果是写，那么就是输出流
 *      ③.你是否需要增强程序读写的效率
 *          如果不需要，那么使用基本流，如果需要那么就是包装流
 * 2.字节流使用
 *  a.字节输入流：InputStream
 *  b.字节输出流：OutputStream
 * 3.InputStream里面的方法
 *  a.read(byte):读取一个字节
 *  b.read(byte [] arr):读取一个byte数组数据
 *  c.read(byte [] arr,int off,int length):读取指定长度的数据
 *  d.close():关闭读取流
 *  e.available():获取数据源的字节数
 *  注意：如果你想针对文件指针的相关操作的话，推荐使用RandomAccessFile类来操作
 * 4.InputStream的使用
 *  a.我们如果要读写文件的话，那么都是使用FileInputStream这个子类，该子类的构造函数里面
 *  允许你直接放File对象，也可以直接指定路径，只要该路径存在即可；
 *  b.我们可以通过read方法中的参数来调整你是想一次性读一个字节还是一次性读完一个byte数组；
 *  c.我们可以通过available()来把数据源的完整长度都放入到一个byte数组里来让你进行一次性读取
 *  但是不建议这样用，因为当数据源超过JVM的内存时那么就会造成内存溢出，所以byte数组的大小，
 *  我们一般都是手动控制，通过1024来代表1K，通过1024*1024代表1M，再根据文件的大小来适当调整
 *  该数组的大小；
 *  d.使用缓冲区byte数组来操作文件读取可以极大提升读取效率，但是我们需要通过while循环来进行控制
 *  循环的结束条件：while((length=is.read(myBuffer))!=-1)
 *  e.如果文件大小无法被缓冲区整除的话，那么我们需要使用指定范围来使用的方式，
 *  比如：new String(byte [] buff,0,length);
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //1.指定数据源
        File file = new File("d:/abc.txt");
        //2.构建一个FileInputStream对象
        InputStream is = new FileInputStream(file);
        //3.读取文件的内容
        byte data1 = (byte) is.read();
        byte data2 = (byte) is.read();
        System.out.println(data1);
        System.out.println(data2);
        //4.跳过2个字节
        is.skip(2);
        byte data3 = (byte) is.read();
        System.out.println(data3);
        //5.重新实例化一次，按照数组来进行读取
        //5.1.通过不使用File对象的形式来构建一个FileInputStream对象
        is = new FileInputStream("d:/abc.txt");
        //5.2.定义一个文件大小的缓冲区用来容纳读取到的数据
        byte [] buff = new byte[is.available()];
        //5.3.读取数据并放入到缓冲区中
        is.read(buff);
        //5.4.通过String的构造函数，把读取到的数据转为字符串并且展示
        System.out.println(new String(buff));
        //6.优化读取过程，因为available()方法在读取源文件比较大的时候会容易导致内存溢出
        is = new FileInputStream("d:/abc.txt");
        //6.1.定义一个指定大小的缓冲区
        byte [] myBuffer = new byte[1024];//大小为1K的缓存
        //6.2.定义一个变量用来作为读取的长度控制
        int length = 0;
        //6.3.因为需要一直读，直到读到的结果是-1就结束读取
        while((length=is.read(myBuffer))!=-1){
            //6.4.每次读完一个myBuffer就输出一次里面的内容
            System.out.println(new String(myBuffer,0,length));
        }
    }
}

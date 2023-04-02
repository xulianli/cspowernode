package com.cspowernode.teaching.p2;

import java.io.*;

/**
 * @Author 汪洋
 * @Date 2023/3/27 17:03
 * @Description
 * OutputStream的使用
 * 1.OutputStream的子类关于文件操作的类就是FileOutputStream，那么该类在创建的时候
 * 只需要指明目标文件是覆盖还是续写，不关心文件是否存在；
 *  a.new FileOutputStream(String path):覆盖
 *  b.new FileOutputStream(String path,boolean append):第二个参数写true就代表追加
 * 2.FileOutputStream的相关方法
 *  a.close():关闭资源
 *  b.flush():刷新缓冲区
 *  c.write():写数据
 * 3.演示如何进行同时读写操作
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("dest.txt");
        //1.直接在数据量小的时候，把数据一次性写入到指定文件里面去
//        out.write("HelloWorld!!!".getBytes());
        //2.如果数据量大的话，那么我们还是需要单独定义缓冲区
        //2.1.定义一个输入流，指定要读取的源文件位置
        InputStream is = new FileInputStream("d:/abc.txt");
        //2.2.定义一个缓冲区，代表把读取的数据都往缓冲区里面进行存放
        byte [] myBuffer = new byte[1024];//大小为1K的缓存
        //2.3.定义一个变量用来作为读取的长度控制
        int length = 0;
        //2.4.因为需要一直读，直到读到的结果是-1就结束读取
        while((length=is.read(myBuffer))!=-1){
            //2.5.每次读完一个myBuffer就写入到目标文件中
            out.write(myBuffer,0,length);
            //2.6.刷新
            out.flush();
        }
        //2.7.关流
        is.close();
        out.close();
    }
}

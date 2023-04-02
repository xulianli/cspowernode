package com.cspowernode.teaching.p2;

import java.io.*;
import java.util.Scanner;

/**
 * @Author 汪洋
 * @Date 2023/3/28 14:02
 * @Description
 * 字符流以及对应的缓冲流的使用
 * 1.字符流所对应的输入流是Reader，输出流是Writer，那么这两个抽象类的具体
 * 实现类是FileReader和FileWriter，虽然这两个类可以进行字符的读取，但是
 * 读取仍然不能以行为单位进行操作，所以我们一般都是直接使用它们的缓冲流来操作
 * 2.字符流的缓冲流
 *  a.输入流缓冲流：BufferedReader
 *  b.输出流缓冲流：BufferedWriter
 * 3.输出流的打印流
 *  我们可以对输出流进行进一步封装，使用PrintWriter来进行操作，该类具备了各种print和println
 *  方法的重载，方便我们直接一次性把文本完成输出
 */
public class WriterAndReaderDemo {
    public static void main(String[] args) throws IOException {
        //构建一个字符流输入流的缓冲流
        BufferedReader br = new BufferedReader(new FileReader("dest.txt"));
        //构建一个字符流输出流的缓冲流
//        BufferedWriter bw = new BufferedWriter(new FileWriter("source.txt"));
        //构建一个打印流
        PrintWriter pw = new PrintWriter("myWord.txt");
        //一行一行的读取
//        System.out.println(br.readLine());
//        System.out.println(br.readLine());
//        System.out.println(br.readLine());
        //一次性读完
        String str;
        while((str=br.readLine())!=null){
            //使用BufferedWriter来写
//            bw.write(str);
//            bw.newLine();
//            bw.flush();
            //用PrintWriter来写,这个方法在换行的时候就自动完成了刷新
            pw.println(str);
        }
        br.close();
        pw.close();
    }
}

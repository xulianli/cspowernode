package com.cspowernode.homework;

import java.io.*;
import java.util.Arrays;

/**
 * @Author 徐联理
 * @Date 2023/3/28 19:59
 * @Description
 * 1.熟练操作字节流、字符流和过滤器的使用
 * 2.完成文件的合并
 * 3.完成IO流作业的非编程题
 * 4.使用IO包中的类读取D盘上exam.txt文本文件的内容，每次读取一行内容，将每行作为一个输入放入数组中并将数组中的内容
 * 使用加强for进行输出显示。
 * 额外：看看装饰者设计模式以及阿里巴巴开发手册的面向对象部分以及异常部分(只挑看的懂的)
 */
public class IOhomework {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new FileReader("c:\\exam.txt"));
        String[] content = {};
        String len;
        while ((len=bis.readLine())!=null){
            content= Arrays.copyOf(content,content.length+1);
            content[content.length-1]=len;
        }
        bis.close();
        for (String s : content) {
            System.out.println(s);
        }
    }
}

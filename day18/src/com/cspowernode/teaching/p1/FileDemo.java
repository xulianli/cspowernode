package com.cspowernode.teaching.p1;

import java.io.File;
import java.io.IOException;

/**
 * @Author 汪洋
 * @Date 2023/3/27 10:01
 * @Description
 * File类的使用
 * 1.File类是java提供的可以让我们操作文件或者文件夹的类，不能操作
 * 文件的内容；
 * 2.File类的常用构造函数
 *  a.File(String pathname):指定文件的路径然后构建该文件对应的File对象
 *  b.File(String parent, String child):跟上面相比，可以指定父路径
 *  c.File(File parent, String child):跟上面相比，父路径是对应的File对象
 * 3.路径的分类
 *  a.绝对路径
 *      带盘符的就是绝对路径
 *  b.相对路径
 *      没带盘符的就是相对路径，如果你用相对路径，那么你必须清楚当前相对的
 *      路径在哪里
 *  注意：工作中的时候，我们一般都使用相对路径，因为相对路径可以消除掉不同计算机
 *  磁盘的差异性问题
 * 4.构建文件及文件夹的方式
 *  a.exists():判断该File对象是否存在
 *  b.mkdir():创建一个文件夹，注意如果你指定的路径下不存在该父路径的话，会创建失败
 *  比如：d:/aaa/bbb，如果aaa文件夹就不存在，那么bbb是创建不出来的；
 *  c.mkdirs():创建一个文件夹，如果你指定的路径下的父路径不存在，则一起创建出来
 *  比如：d:/aaa/bbb,如果aaa文件夹不存在，则跟着bbb文件夹一起创建出来；
 *  d.createNewFile():创建一个文件
 * 注意：
 *  a.书写盘符和文件之间的符号时，是可以不加/的，但是如果不加而你又要创建文件夹的话，会失败；
 *  b.到底是创建文件还是文件夹，跟你文件名是否带后缀无关，只跟方法有关
 *  c.构造函数的后面2种如何选择主要取决于你的父路径是否存在，如果不存在则需要通过File对象
 *  来创建，于是就可以使用参数是File的构造函数，如果父路径存在，则直接放路径的文件名即可；
 *  e.如果父路径是一个文件的话，那么运行会报以下异常：
 *      java.io.IOException: 系统找不到指定的路径。
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        //1.演示不同路径的情况下使用不同的构造函数来构建File对象
        //1.1.直接使用相对和绝对路径来调用一个String参数的File构造函数
        File file1 = new File("abc.txt");
        File file2 = new File("d:abc.txt");//盘符和文件之间不打斜杠
//        File file2 = new File("d:/abc.txt");//打斜杠
//        File file2 = new File("d:\\abc.txt");//打反斜杠
        //1.2.构建这两个File对象，从而来了解到相对路径在哪里
//        if(!file1.exists()){
//            file1.createNewFile();
//        }
//        if(!file2.exists()){
//            file2.createNewFile();
//        }
        //1.3.是否可以直接创建带后缀的文件夹
        File file3 = new File("abc.txt");
        File file4 = new File("d:/abc.txt");
        if(!file3.exists()){
            file3.mkdir();
        }
        if(!file4.exists()){
            file4.mkdir();
        }
        //1.4.测试mkdir和mkdirs
        File file5 = new File("d:/aaa/bbb");
        if(!file5.exists()){
            file5.mkdirs();
        }
        //2.使用能够指定父路径的File对象创建:适合多个File对象使用同一个父路径的情况
        String parent = "d:/aaa";
        File file6 = new File(parent,"t1.txt");
        File file7 = new File(parent,"t2.java");
        File file8 = new File(parent,"t3.png");
        file6.createNewFile();
        file7.createNewFile();
        file8.createNewFile();
        //3.使用File对象来作为父路径的场景
        File parentFile = new File("d:/ccc");
        parentFile.mkdir();
        File file9 = new File(parentFile,"t1.txt");
        File file10 = new File(parentFile,"t2.java");
        File file11 = new File(parentFile,"t3.png");
        file9.createNewFile();
        file10.createNewFile();
        file11.createNewFile();
        //4.使用文件作为父路径，会报异常
        File file12 = new File(file10,"t4.png");
        file12.createNewFile();
    }
}

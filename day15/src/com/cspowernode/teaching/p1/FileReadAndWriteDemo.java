package com.cspowernode.teaching.p1;

import java.io.*;

/**
 * @Author 汪洋
 * @Date 2023/3/23 17:09
 * @Description
 * 案例演示：完成一个文件的读和写，从指定的位置读取里面的内容，然后写入到另外一个文件里面去
 * 问题：
 *  a.我们有可能会忘记关闭资源，造成资源的浪费，从而导致效率的降低；
 *  b.在关闭资源的时候有可能仍然有异常需要处理，这样代码很难看
 * 解决方案：try..with..resource
 * 为了解决资源需要单独在finally里面进行关闭并且里面有可能还需要进行单独处理try..catch的情况，所以从JDK1.8开始，异常
 * 的所有需要关闭的资源引入了一个新的接口：AutoCloseable接口，这个接口的作用可以让我们使用新的语法来构建需要关闭的资源
 * 对象，只要我们使用新语法来构建该对象的话，那么该对象就会自动关闭，不需要我们进行手动关闭
 *
 * try..with..resource语法：
 * try(需要自动关闭资源的对象实例化代码){}
 *
 * 注意：这种语法不适用于你需要进行频繁使用的资源，因为这些频繁使用的资源如果被自动关闭的话，那么后面又要重新开，你不
 * 开，就无法使用，就得重新又构建，那么这样一开一关太浪费资源，只适合那种你确定只临时使用一次然后需要快速关闭的场景；
 */
public class FileReadAndWriteDemo {
    public static void main(String[] args) {
        try(
                //1.构建文件读取流
                BufferedReader br = new BufferedReader(new FileReader("d:/abc.txt"));
                //2.构建文件写入流
                PrintWriter pw = new PrintWriter("day15/src/hehe.txt");
        ) {
            //3.把读取流里面的内容拿出来
            String line = br.readLine();
            //4.把内容写入到指定位置
            pw.println(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main1(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            //1.构建文件读取流
            br = new BufferedReader(new FileReader("d:/abc.txt"));
            //2.构建文件写入流
            pw = new PrintWriter("day15/src/hehe.txt");
            //3.把读取流里面的内容拿出来
            String line = br.readLine();
            //4.把内容写入到指定位置
            pw.println(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(pw!=null){
                pw.close();
            }
        }
    }
}

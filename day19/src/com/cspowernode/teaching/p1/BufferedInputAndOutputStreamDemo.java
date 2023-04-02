package com.cspowernode.teaching.p1;

import java.io.*;

/**
 * @Author 汪洋
 * @Date 2023/3/28 10:38
 * @Description 包装流之缓冲流的使用
 * 1.在InputStream/OutputStream类下面有一个FilterInput/OutputStream的子类,该子类
 * 下面的所有类都是属于过滤流(包装流)，这些包装流都是在基础流之上进行了一些功能的封装
 * 能够让我们的流操作变的更加的方便和适合各种的场景
 * 2.BufferedInputStream/BufferedOutputStream增加的功能
 * 这两个类里面多了一个缓冲区，默认大小为8K，那么我们可以使用该缓冲流来替代之前的
 * 缓冲区的写法，但是它的效率甚至低于我们字节流+缓冲区的写法，所以有时候我们会见到
 * 有人使用缓冲流+缓冲区的写法
 * 3.BufferedInputStream/BufferedOutputStream的使用
 *  a.构建缓存流对象
 *  b.跟基本流一样的进行读以及写
 * 练习：尝试对比下以下三种读写文件的效率
 *  a.字节流+缓冲区
 *  b.缓冲流
 *  c.缓冲流+缓冲区
 *  然后可以尝试多去修改下缓冲区的大小，看不同的文件设置多少缓冲区效率最高
 */
public class BufferedInputAndOutputStreamDemo {
    public static void main(String[] args) {
        try (
                //1.定义输入和输出流
                FileInputStream fis = new FileInputStream("d:/PotPlayer播放器.exe");
                FileOutputStream fos = new FileOutputStream("d:/PotPlayer播放器_复制.exe");
        ) {
            //3.定义缓冲区
            byte [] buffer = new byte[1024];
            //4.读取文件
            int len;
            while ((len = fis.read(buffer)) != -1) {
                //5.写文件
                fos.write(buffer,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main2(String[] args) {
        try (
                //1.定义缓存输入和输出流
                BufferedInputStream bis = new BufferedInputStream(
                        new FileInputStream(
                                new File("d:/PotPlayer播放器.exe")));
                BufferedOutputStream bos = new BufferedOutputStream(
                        new FileOutputStream(
                                new File("d:/PotPlayer播放器_复制.exe")));
        ) {
            //3.定义缓冲区
            byte [] buffer = new byte[1024];
            //4.读取文件
            int len;
            while ((len = bis.read(buffer)) != -1) {
                //5.写文件
                bos.write(buffer,0,len);
                //6.刷新--->一定要刷
                bos.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main1(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1.创建一个缓存输入流
            bis = new BufferedInputStream(
                    new FileInputStream(
                            new File("d:/PotPlayer播放器.exe")));
            //2.创建一个缓存输出流
            bos = new BufferedOutputStream(
                    new FileOutputStream(
                            new File("d:/PotPlayer播放器_复制.exe")));
            //3.读取文件
            int len;
            while ((len = bis.read()) != -1) {
                //4.写文件
                bos.write(len);
                //5.刷新--->一定要刷
                bos.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

package com.cspowernode.teaching.p1;

import java.io.File;

/**
 * @Author 汪洋
 * @Date 2023/3/27 15:23
 * @Description
 * 查询出指定目录下的所有子文件；
 */
public class FileWork1 {
    public static void main(String[] args) {
        File source = new File("D:/course/code");
        showFile(source,0);
    }

    private static void showFile(File source, int level) {
        //1.把level进行循环，是多少层就输出多少个-
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        //2.直接输出文件/文件夹的名字
        System.out.println(source.getName());
        //3.判断该File对象是否是文件夹，如果是文件夹，那么获取到里面的子文件
        if(source.isDirectory()){
            //4.获取到该文件里面的子文件
            File[] files = source.listFiles();
            //5.遍历该子文件
            for (File file : files) {
                //6.判断是否是文件夹
                showFile(file, level + 1);
            }
        }
    }
}

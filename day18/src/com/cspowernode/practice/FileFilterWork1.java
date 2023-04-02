package com.cspowernode.practice;

import java.io.File;

/**
 * @Author 徐联理
 * @Date 2023/3/27 20:11
 * @Description
 * 查询出指定目录下的所有子文件；
 */
public class FileFilterWork1 {
    public static void main(String[] args) {
        File file = new File("c:/workspace/code/day17");
        showFiles(file);
        showFile(file,0);
    }

    private static void showFiles(File file) {
        //输出文件或文件夹名
        System.out.println(file.getName());
        //判断是否为文件夹
        if (file.isDirectory()) {
            //若是文件夹则获取子文件
            File[] files = file.listFiles();
            //遍历该数组并递归
            for (File f : files) {
                showFiles(f);
            }
        }
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

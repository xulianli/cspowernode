package com.cspowernode.teaching.p1;

import java.io.File;


/**
 * @Author 汪洋
 * @Date 2023/3/27 15:31
 * @Description
 * 文件夹的删除
 */
public class FileWork2 {
    public static void main(String[] args) {
        File src = new File("d:/test");
        deleteFile(src);
    }

    private static void deleteFile(File src) {
        //1.判断你要删除的File对象是否是文件夹
        if(src.isDirectory()){
            //2.如果是文件夹，那么取出里面的所有子文件及文件夹
            File[] files = src.listFiles();
            //3.遍历该子文件及文件夹的数组
            for (File file : files) {
                //4.继续回调该函数，把子文件对象传入进去
                deleteFile(file);
            }
        }
        //5.如果不是文件夹，那么直接删除掉即可；
        src.delete();
    }
}

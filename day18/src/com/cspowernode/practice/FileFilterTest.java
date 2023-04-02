package com.cspowernode.practice;

import java.io.File;

/**
 * @Author 徐联理
 * @Date 2023/3/27 14:05
 * @Description
 * 1.查询出指定目录下的所有子文件；
 * 2.删除指定的目录，目录里面的子文件以及子文件夹数量未知；
 */
public class FileFilterTest {
    public static void main(String[] args) {
        File f = new File("C:/tools");
        listfiles(f);
//        delete(f);
    }


    private static void delete(File files) {
            if (files.isDirectory()){
                File[] files1 = files.listFiles();
                if (files1 != null){
                    for (File f:files1) {
                        delete(f);
                    }
                }
            }
        files.delete();
    }

    private static void listfiles(File file) {
        if (!file.exists()){
            return;
        }
        if (file.isDirectory()){
            File[] files = file.listFiles();
            if (files != null){
                for (File f:files){
                    if (f.isFile()){
                        System.out.println(f.getName());
                    } else if (f.isDirectory()){
                        listfiles(f);
                    }
                }
            }
        }
    }
}

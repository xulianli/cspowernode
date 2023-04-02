package com.cspowernode.practice;

import java.io.File;

/**
 * @Author 徐联理
 * @Date 2023/3/27 20:48
 * @Description
 */
public class DeleteWork {
    public static void main(String[] args) {
        File file = new File("C://code");
        delete(file);
    }

    private static void delete(File file) {
        if (file.isDirectory()){
            File[] files = file.listFiles();
            for (File f : files) {
                delete(f);
            }
        }
        file.delete();
    }
}

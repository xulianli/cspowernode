package com.cspowernode.practice;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author 徐联理
 * @Date 2023/3/29 17:04
 * @Description
 */
public class Tests {
    public static void main(String[] args) {
        String str = "Hello World";
        FileWriter fw = null;
        try {
            fw = new FileWriter("c:\\test/hello.txt");
            fw.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw!=null){
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

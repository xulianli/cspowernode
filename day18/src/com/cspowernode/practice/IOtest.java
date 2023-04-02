package com.cspowernode.practice;

import java.io.*;

/**
 * @Author 徐联理
 * @Date 2023/3/27 21:04
 * @Description
 */
public class IOtest {
    public static void main(String[] args) throws IOException {
//        split();
        merge();
    }

    private static void merge() throws IOException {
        File f1 = new File("C:\\workspace\\Code\\day18\\testmerge.txt");
        if(!f1.exists()){
            f1.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(f1,true);
        File f = new File("c:\\test");
        File[] files={};
        if (f.isDirectory()){
            files = f.listFiles();
        }
        byte[] buff = new byte[1024];
        for (File fs : files) {
            if (fs!=null){
                FileInputStream fis = new FileInputStream(fs);
                int len;
                while ((len=fis.read(buff))!=-1){
                    fos.write(buff,0,len);
                    fos.flush();
                }
                fis.close();
                fs.delete();
            }
        }
        fos.close();
    }

    private static void split() throws IOException {
        FileInputStream is = new FileInputStream("c://workspace/Code/day18/src/com/cspowernode/practice/IOTest.txt");
        byte[] buff = new byte[is.available()/10];
        int length;
        int count = 0;
        while ((length = is.read(buff))!=-1){
            FileOutputStream os = new FileOutputStream("c://test/split"+count++ +".txt");
            os.write(buff,0,length);
            os.flush();
            os.close();
        }
        is.close();
    }
}

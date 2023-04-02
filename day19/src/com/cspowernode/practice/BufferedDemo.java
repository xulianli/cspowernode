package com.cspowernode.practice;

import java.io.*;

/**
 * @Author 徐联理
 * @Date 2023/3/28 11:19
 * @Description
 */
public class BufferedDemo {

    public static void main(String[] args) throws IOException {
        //字节流+缓冲区
//        FileInputStream fis = new FileInputStream("c://workspace/Code/day18/src/com/cspowernode/practice/IOTest.txt");
//        FileOutputStream fos = new FileOutputStream("C:\\\\test/IOTest复制3.txt");
//        byte[] buff = new byte[1024];
//        int len;
//        while ((len = fis.read(buff)) != -1) {
//            fos.write(buff, 0, len);
//        }
//        fis.close();
//        fos.close();

        //字节缓冲流+缓冲区
//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(
//                "c://workspace/Code/day18/src/com/cspowernode/practice/IOTest.txt"));
//        BufferedOutputStream bos = new BufferedOutputStream((new FileOutputStream("C:\\test/IOTest复制2.txt")));
//        int len;
//        byte[] buff = new byte[1024];
//        while ((len=bis.read(buff))!=-1){
//            bos.write(buff,0,len);
//            bos.flush();
//        }
//        bis.close();
//        bos.close();

        //字符缓冲流
        BufferedReader br = new BufferedReader(new FileReader(
                "c://workspace/Code/day18/src/com/cspowernode/practice/IOTest.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\test/IOTest复制4.txt",true));
        String str;
        while ((str=br.readLine())!=null) {
            bw.write(str);
            bw.flush();
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}

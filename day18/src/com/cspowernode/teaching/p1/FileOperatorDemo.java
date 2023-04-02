package com.cspowernode.teaching.p1;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * @Author 汪洋
 * @Date 2023/3/27 11:30
 * @Description
 * File类里面的操作类方法
 * 1.delete
 * 2.renameTo
 * 3.list
 *  a.list():把指定目录下的所有文件及文件夹的名字返回形成一个String数组
 *  b.list(FilenameFilter filter):可以通过匿名内部类的形式来重写FilenameFilter接口
 *  下的accept方法，该方法里面的第一个参数是路径，第二个参数就是该路径下的所有子文件/文件夹
 *  那么我们就可以写过滤规则，满足就返回true，否则返回false
 * 4.listFile
 *  a.listFile():把指定目录下的所有文件及文件夹的路径返回形成一个File数组
 *  b.listFile(FilenameFilter filter):这里跟3.b里面的过滤是一样的，只不过上面返回的
 *  是String数组，而这里返回的是File数组而已；
 *  c.listFile(FileFilter filter):这里的FileFilter也是一个接口，它里面的方法也是
 *  accept方法，只不过参数值有一个File对象，代表该目录下的每个File对象，那么我们就可以
 *  在这里使用更多的过滤模式
 * 总结：
 *  虽然list和ListFile这两个方法都提供了多种过滤方式，但是我们选择其实很简单
 *  1.如果你想要返回文件名，那么直接使用list即可，如果你想要File对象，那么直接使用listFile即可；
 *  2.如果你有过滤需求，那么一律直接使用listFile(FileFilter filter)即可解决所有问题，除非你
 *  又有过滤需求，又想拿到String数组，才使用list(FilenameFilter filter)来操作；
 *
 * 注意：
 *  1.delete方法只能删除文件或者是没有子文件的文件夹，如果目录中还存在子文件，那么该目录
 *  就无法被删除；
 *  2.renameTo需要在参数上指定File对象，所以我们就不仅仅可以进行改名，还可以进行移动文件
 *  位置；
 */
public class FileOperatorDemo {
    public static void main(String[] args) {
        //delete的使用
        File file1 = new File("D:\\course\\code");
        file1.delete();
        //renameTo的使用
        File file2 = new File("D:/test.txt");
//        file2.renameTo(new File("d:/test1.txt"));
        file2.renameTo(new File("d:/aaa/test.txt"));
        //list()
        File file3 = new File("D:\\software\\Snipaste-2.7.3-Beta-x64");
        String[] list = file3.list();
        System.out.println(Arrays.toString(list));
        //list(FilenameFilter filter):可以针对文件名以及父路径进行过滤
        //案例：过滤掉该目录下的所有非dll文件
        list = file3.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
//                System.out.println(dir);
                return name.endsWith(".dll") ? true : false;
            }
        });
        System.out.println(Arrays.toString(list));
        //listFile()
        File[] files = file3.listFiles();
        System.out.println(Arrays.toString(files));
        //listFile(FilenameFilter filter)
        files = file3.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
//                System.out.println(dir);
                return name.endsWith(".dll") ? true : false;
            }
        });
        System.out.println(Arrays.toString(files));
        //listFile(FileFilter filter)
        files = file3.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory()?true:false;
            }
        });
        System.out.println(Arrays.toString(files));
    }
}

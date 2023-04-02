package com.cspowernode.teaching.p1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @Author 汪洋
 * @Date 2023/3/27 10:28
 * @Description
 * File类中获取信息的方法
 * 1.canXXX:返回boolean
 *  a.canExecute() :测试文件是否可执行
 *  b.canRead() :测试文件是否可读
 *  c.canWrite() :测试文件是否可写
 * 2.isXXX:返回boolean
 *  a.isFile():是否是文件
 *  b.isDirectory():是否是文件夹
 *  c.isAbsolute():是否是绝对路径
 *  d.isHidden():是否隐藏
 * 3.getXXX:返回字符串/对象
 *  a.getAbsoluteFile() :返回绝对路径，返回类型是File类型
 *  b.getAbsolutePath() :返回绝对路径，返回类型是String类型
 *  c.getCanonicalFile():返回绝对路径的规范化形式，返回类型是File类型
 *  d.getCanonicalPath():返回绝对路径的规范化形式，返回类型是String类型
 *  e.getName():返回File对象的文件名
 *  f.getParent():返回此抽象路径名父目录的路径名字符串；如果此路径名没有指定父目录，则返回 null。
 *  g.getParentFile():返回此抽象路径名父目录的File对象；如果此路径名没有指定父目录，则返回 null。
 *  h.getPath():返回File对象的路径
 * 4.其他
 *  a.length():获取文件的长度
 *  b.lastModified():获取到文件修改时间
 * 注意：
 *  a.getXXXFile和getXXXPath的区别在于你的下一步是想继续进行File操作还是String操作
 *  b.XXXCanonical和XXXAbsolute的区别在于你构建File对象的格式是否正规，如果不正规那么使用
 *  XXXCanonical方法会帮你进行预处理，然后你就可以拿到正规格式的文件路径；
 */
public class FileGetInfoDemo {
    public static void main(String[] args) throws IOException {
        //1.测试can类方法
        File file = new File("d:/aaa/aaa.txt");
        System.out.println("可读："+file.canRead());
        System.out.println("可写："+file.canWrite());
        System.out.println("可执行："+file.canExecute());
        System.out.println("=============================");
        File file1 = new File("d:/bbb.123");
        System.out.println("可读："+file1.canRead());
        System.out.println("可写："+file1.canWrite());
        //TODO 现在看来是只能被windows打开不报错，都算成可执行
        System.out.println("可执行："+file1.canExecute());
        //2.isAbsolute()
        File file3 = new File("a/a.txt");
        if(!file3.exists())
            file3.mkdirs();
        System.out.println(file.isAbsolute());
        System.out.println(file3.isAbsolute());
        //3.getXXX的方法
        File file4 = new File("../a.txt");
        if(!file4.exists()){
            file4.createNewFile();
        }
        System.out.println("getAbsoluteFile:"+file4.getAbsoluteFile());
        System.out.println("getAbsolutePath:"+file4.getAbsolutePath());
        System.out.println("getCanonicalPath:"+file4.getCanonicalPath());
        System.out.println("getCanonicalFile:"+file4.getCanonicalFile());
        System.out.println("getName:"+file4.getName());
        System.out.println("getPath:"+file4.getPath());
        System.out.println("getParent:"+file4.getParent());
        System.out.println("getParentFile:"+file4.getParentFile());
        System.out.println("=============经过处理之后再来获取================");
        System.out.println("getName:"+file4.getCanonicalFile().getName());
        System.out.println("getPath:"+file4.getCanonicalFile().getPath());
        System.out.println("getParent:"+file4.getCanonicalFile().getParent());
        System.out.println("getParentFile:"+file4.getCanonicalFile().getParentFile());
        //length
        File file5 = new File("d:/test.txt");
        System.out.println(file5.length());
        //lastModified
        System.out.println(new Date(file5.lastModified()));
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file5.lastModified()));
    }
}

package com.cspowernode.teaching.p2;


import java.util.Scanner;

/**
 * @author 汪洋
 * @Date 2023/3/6 14:54
 * @Description
 * Scanner类的使用
 * 1.Scanner有什么用处
 *  用来扫描指定的文件或者数据输入源，我们一般用它来进行控制体信息的录入
 * 2.Scanner怎么用
 *  a、先完成Scanner的实例化，构建一个可以让你来使用的实例
 *      Scanner sc = new Scanner(System.in);
 *      注意：只要看到有new就代表是在进行实例化，并且这里只有sc变量名可以随便变化
 *  b、输入提示语句
 *      System.out.println("请输入XXXX");
 *  c、根据你的题意来判定你要输入的信息类型：
 *      ①.整数：int 变量名 = sc.nextInt();
 *      ②.浮点数：double 变量名 = sc.nextDouble();
 *      ③.字符串：String 变量名 = sc.next();
 *      注意1：你输入的数据的类型要和代码的类型匹配，否则会报异常--->InputMismatchException
 *      注意2：字符串的获取是按照空格来获取数据的，如果你想获取整行数据，我们使用sc.nextLine()
 *  d、拿到你输入的数据然后来进行后续的操作
 * 注意：实例化的时候需要你指定系统的Scanner类是哪个，我们选择第一个
 *
 * 小练习：把之前字符串的案例中那几个变量使用Scanner来录入进去
 *
 */
public class ScannerDemo {
    public static void main(String[] args) {
        //1.实例化Scanner类
        Scanner sc = new Scanner(System.in);
        //2.输入提示语句
        System.out.println("请输入您的年龄：");
        //3.根据题意来获取你输入的内容
        int age = sc.nextInt();
        //4.拿到数据做后续的操作
        if(age>=18){
            System.out.println("你可以浏览学习网站");
        }else{
            System.out.println("自由、明主...");
        }
        //字符串的获取
        System.out.println("请输入您的爱好：");
        String hobby = sc.next();
        System.out.println(hobby);
        String hobby2 = sc.next();
        System.out.println(hobby2);
        if(hobby.length()<5){
            System.out.println("你的爱好比较贫乏");
        }else{
            System.out.println("你的爱好非常丰富");
        }
    }
}

package com.cspowernode.teaching.p1;

/**
 * @author 汪洋
 * @Date 2023/3/9 11:32
 * @Description
 * while和do..while循环的使用
 * 1.while循环的语法
 *  while(条件判断表达式){
 *      循环体
 *  }
 *  其实本质上for循环的底层就是while循环,其实最开始就是while循环，只是为了方便初学者来使用这种
 *  循环，所以把循环中必须要用到的一些东西固定在一起，就变成了for循环，所以这两者其实是共通的；
 * 2.while循环和for循环的区别
 *  a、如果你变量需要在循环外面用，那么使用while循环更方便点；
 *  b、如果写死循环的话，那么使用while循环也更方便点；--->while(true){}
 *  注意：因为while循环不像for循环那样给你预留了变量变化的那块区域，所以你使用while循环的时候
 *  请留意你的循环是否会变成一个死循环
 * 3.do..while循环的使用
 *  do{
 *      循环体
 *  }while(条件判断表达式);
 *  解析：先运行一次循环体，然后再判断条件表达式是否为true，如果为true再次执行循环体，否则结束循环；
 * 4.while循环和do..while循环的区别
 *  while循环有可能一次都不循环，而do..while循环至少会执行一次
 *
 * 练习题1：把之前的4道for循环的题目随便修改2道成while循环；
 * 练习题2：分别使用for循环和while循环来完成求某个数字是否是质数-->如果某个数字只能被自己和1整除那么这个
 * 数字就是质数；
 * 提示：这个题目可能需要我们在循环外部定义一个标记(任何类型都可以)，该标记用来判断是否被整除了
 */
public class WhileDemo {
    public static void main(String[] args) {
        //1.书写一个简单的while循环
        int i = 1;
        while(i<=100){
            System.out.print(i+"\t");
            i++;
        }
        //变化成for循环
        int j = 1;
        for(;j<=100;){
            System.out.print(j+"\t");
            j++;
        }
        //2.书写一个简单的do..while循环
        do{
            System.out.println("你好啊");
        }while(false);
    }
}

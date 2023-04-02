package com.cspowernode.teaching.p1;

/**
 * @author 汪洋
 * @Date 2023/3/9 9:50
 * @Description
 * for循环的使用
 * 1.为什么需要循环结构
 *  因为在很多场合中，我们都需要让某些业务能够重复执行，而且我们生活中也充满了各种的循环；
 * 2.循环结构有哪几种写法
 *  a、for
 *  b、while
 *  c、do..while
 *  d、foreach--->针对容器进行循环
 * 3.for循环的语法结构
 *     for(控制循环的变量初始化①;变量的判断条件②;对该变量进行修改③){
 *         循环体④
 *     }
 *     a.控制循环的变量初始化：一般来说我们会定义一个变量初始化为0，为的就是日后使用容器的时候，0代表
 *     首位元素的下标，但是比较特殊的场景下，我们也会跟着业务来变化，比如要求输出10-0的数字，这里就
 *     初始化为10；
 *     b.变量的判断条件：如果此时为true，则会继续进行循环，否则循环结束，所以这个地方是控制循环是否能够
 *     继续往下执行的关键条件，比如要求循环10次，那么我们就会在这里来设置10次的条件，不满足了就结束循环；
 *     c.对该变量的修改：因为变量初始化之后，如果不对其进行修改，那么判断条件将永远为真，所以我们需要根据
 *     不同的情况对该变量进行+或者-或其他的算术运算；
 * 4.for循环的执行流程
 *  1(243)*,直到2为false就结束循环
 * 5.循环的傻瓜式写法
 *  a.如果题目要求你循环多少次，那么我们就把下列中的n改成对应的次数，其他代码不变
 *      for(int i = 0;i<n;i++){
 *          循环体
 *      }
 *  b.如果题目要求你从几循环到几的话，那么我们就把下列中的n设置为起始，m设置为结束，如果m大于
 *  n，那么i就是++，如果m小于n，那么i就是--
 *      for(int i = n;i<=m;i++){
 *
 *      }
 *      for(int i = n;i>=m;i--){
 *
 *      }
 * 6.for循环几种奇葩的写法
 *  a、for(;;){}
 *  b、循环的初始化变量i会在其他地方也有用
 *      int i = 0;
 *      for(;i<10;){
 *          i++;
 *      }
 */
public class ForDemo {
    public static void main(String[] args) {
//        1、输出0(包含)到100(包含)之间的数，分别以递增和递减的方式实现；
        for(int i = 0;i<=100;i++){
            System.out.print(i+"\t");
        }
        //换行
        System.out.println();
        for(int i = 100;i>=0;i--){
            System.out.print(i+"\t");
        }
        //换行
        System.out.println();
//        2、输出1到100之间的奇数和偶数；
        for(int i = 1;i<=100;i++){
            System.out.println(i%2==0?i+"是偶数":i+"是奇数");
        }
        //换行
        System.out.println();
        //优化
        for(int i = 1;i<=100;i+=2){
            System.out.println(i+"是奇数");
        }
        for(int i = 0;i<=100;i+=2){
            System.out.println(i+"是偶数");
        }
        //奇葩的写法1
//        for(;;){
//
//        }
        //不能在没有结束语句的死循环后面写代码
//        System.out.println(123);
        //奇葩的写法2
        int a = 0;
        for(;a<10;){
            System.out.println(a);
            a++;
        }
        System.out.println(a);
    }
}

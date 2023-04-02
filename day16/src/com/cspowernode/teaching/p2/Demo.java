package com.cspowernode.teaching.p2;

/**
 * @Author 汪洋
 * @Date 2023/3/24 15:29
 * @Description
 * 1.字符串中的优化
 *  所谓字符串的优化，指的是在我们定义字符串的过程中，如果等号右边的数据不是一个连续的值，而是一个
 *  表达式的话，那么这个表达式里面如果都是字面量或者是常量的话，那么会在编译阶段完成拼接，那么给
 *  虚拟机看的其实就已经是拼在一起的字符串；
 * 2.变量是无法参与字符串的优化的，因为在编译阶段，变量是无法找到具体的地址值的，所以就没法在编译
 * 阶段完成拼接；
 * 问题1：String s1 = "abc";String s2 = s1+"123";请问这里总共产生了几个对象；
 * 问题2：请问字符串中的+号到底是怎么完成拼接的？
 */
public class Demo {
    public static final int value = 123;
    public static void main(String[] args) {
        //3.使用final修饰的变量
        final int x = 123;
        String s1 = "abc123";
        //1.使用直接量进行+号拼接
        String s2 = "abc"+"123";
        //2.使用常量
        String s3 = "abc"+value;
        String s4 = "abc"+x;
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println("========================");
        String x1 = "123";
        String s5 = "abc"+x1;
        System.out.println(s1==s5);
        //+号拼接符的底层运作模式
        StringBuilder sb = new StringBuilder();
        sb.append("abc");
        sb.append(x1);
        s5 = sb.toString();

    }
}

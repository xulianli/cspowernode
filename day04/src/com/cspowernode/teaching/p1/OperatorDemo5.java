package com.cspowernode.teaching.p1;

/**
 * @author 汪洋
 * @Date 2023/3/7 10:29
 * @Description
 * 三目运算符的使用
 * 1.三目运算符也称之为条件运算符、三元运算符，它主要就是用来简化if..else的操作的；
 * 2.语法：
 *  条件表达式?表达式1:表达式2
 *  如果条件表达式为true，则执行表达式1，否则执行表达式2
 * 3.三目运算符使用需要注意的事项
 *  a.if..else语句必须里面只有一行代码才替换成三目运算符，如果逻辑复杂，那么还是使用if..else语句
 *  b.三目运算符使用不要嵌套超过2层，否则阅读会很困难
 *
 * 三目运算符的练习：
 * 1.使用三目运算符来判断某个数字是奇数还是偶数
 * 2.使用三目运算符来判断2个数字中的最大值是哪个，再来判断3个数字中的最大值是哪个
 * 注意：可以无视等于号的情况
 */
public class OperatorDemo5 {
    public static void main(String[] args) {
        //1.使用输出某个语句的方式来展示三目运算符
        int age = 18;
        if(age>=18){
            System.out.println("成年了，可以看学习网站了");
        }else{
            System.out.println("自由明主");
        }
        //换成三目运算符
        System.out.println(age>=18?"成年了":"小屁孩");
        //复杂化，增加额外的一个条件
        if(age>=15&&age<18){
            System.out.println("你还在读高中呢，老实点，别谈恋爱");
        }else if(age>=18&&age<=22){
            System.out.println("开始读大学了，这时候不谈恋爱就晚了");
        }else{
            System.out.println("开始工作赚钱啦");
        }
        //换成三目运算符
        System.out.println(age>=15&&age<18?"你还在读高中呢，老实点，别谈恋爱":
                (age>=18&&age<=22?"开始读大学了，这时候不谈恋爱就晚了":"开始工作赚钱啦"));
        //2.使用三目运算符来赋值和运算
        int a = 10;
        int b = 10;
        if(a>b){
            a = b + a;
        }else{
            a = b - a;
        }
        //换成三目运算符
        a = a>b?b+a:b-a;
    }
}

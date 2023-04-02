package com.cspowernode.teaching.p1;

import java.util.Scanner;

/**
 * @Author 汪洋
 * @Date 2023/3/20 9:55
 * @Description
 * 组卷：使用有参构造函数来构建2个单选题对象和2个多选题对象，然后使用数组一起进行操作
 * 操作：
 *  a.打印具体的题目
 *  b.让你回答标准答案是什么
 *  c.判断答案是否正确
 *  d.给出得分
 */
public class PaperDemo {
    public static void main(String[] args) {
        //1.初始化题库
        ChoiceQuestion [] questions = initQuestion();
        //2.初始化Scanner
        Scanner sc = new Scanner(System.in);
        //3.定义一个计数器
        int count = 0;
        System.out.println("--------欢迎参加2023年公务员考试----------");
        //4.对数组进行循环
        for (ChoiceQuestion question : questions) {
            //5.打印出题目
            question.print();
            //6.拿到答案
            System.out.println("请输入答案(若多选则用逗号隔开)：");
            String [] answers = sc.next().split(",");
            //7.计分
            if(question.check(answers)){//多态
                count++;
            }
        }
        System.out.println("考试结束，您做对了"+count+"个题目，得分为:"+count*25);
    }

    private static ChoiceQuestion[] initQuestion() {
         return new ChoiceQuestion[] {
                new SingleChoiceQuestion(1,"中国历史上唯一一个女皇帝是谁",
                        new String[]{"A.吕雉","B.慈禧","C.武则天","D.伊丽莎白"},"C"),
                new SingleChoiceQuestion(2,"现在人工智能ChatGPT更新到第几版本了",
                        new String[]{"A.1.0","B.2.0","C.3.5","D.4.0"},"D"),
                new MulChoiceQuestion(3,"下列哪些国家在东亚",
                        new String[]{"A.中国","B.朝鲜","C.德国","D.印度"},new String[]{"A","B"}),
                new MulChoiceQuestion(4,"在2022年所发生的最大国际冲突是哪两个国家",
                        new String[]{"A.法国","B.德国","C.大毛","D.二毛"},new String[]{"C","d"}),
        };
    }
}

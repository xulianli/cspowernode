package com.cspowernode.teaching.p3;

import java.util.Scanner;

/**
 * @Author 汪洋
 * @Date 2023/3/13 17:16
 * @Description
 * 有三个班级，第一个班级3个学生，第二个班级4个学生，第三个班级5个学生。
 * 要求通过键盘录入三个班级学生的成绩，并计算每个班级学生的的平均成绩。
 */
public class TwoArrayWork1 {
    public static void main(String[] args) {
        //1.初始化一个不规则的二维数组，因为我们能确定每个一维数组中的元素个数，所以先初始化为默认值
        double [][] scores = {{0,0,0},{0,0,0,0},{0,0,0,0,0}};
        //2.初始化Scanner
        Scanner scanner = new Scanner(System.in);
        //3.进行循环
        //3.1.这里循环的是班级
        for (int i = 0; i < scores.length; i++) {
            System.out.println("当前录入的是第"+(i+1)+"班的成绩");
            //4.在外循环里面初始化一个求和的变量
            double sum = 0;
            //3.2.这里循环的是班级的学生
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println("请输入第"+(j+1)+"个的学生成绩：");
                double score = scanner.nextDouble();
                //5.累加进去
                sum += score;
            }
            //6.在班级的学生循环完毕之后，求出该班级的总分和平均分
            System.out.println("当前"+(i+1)+"班的学生总分数为："+sum+"," +
                    "平均分为："+sum/scores[i].length);
        }
    }
}

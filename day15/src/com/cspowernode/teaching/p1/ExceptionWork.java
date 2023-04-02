package com.cspowernode.teaching.p1;

import java.util.Scanner;

/**
 * @Author 汪洋
 * @Date 2023/3/23 16:07
 * @Description
 * 1.编写程序接收用户输入分数信息，如果分数在0—100之间，输出成绩。
 * 如果成绩不在该范围内，抛出异常信息，提示分数必须在0—100之间。
 */
public class ExceptionWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数(0-100之间)：");
        double score = sc.nextDouble();
        try {
            if(checkScore(score)){
                System.out.println(score);
            }
        } catch (ScoreNotBoundsException e) {
            e.printStackTrace();
        }
    }

    private static boolean checkScore(double score) throws ScoreNotBoundsException {
        if(score<0||score>100){
            throw new ScoreNotBoundsException(score);
        }
        return true;
    }

}
class ScoreNotBoundsException extends Exception{
    public ScoreNotBoundsException() {
        super("分数必须在0—100之间");
    }
    public ScoreNotBoundsException(double score) {
        super("分数必须在0—100之间--->"+score);
    }
}

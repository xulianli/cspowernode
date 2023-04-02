package com.cspowernode.teaching.p1;

import java.util.Arrays;

/**
 * @Author 汪洋
 * @Date 2023/3/20 9:53
 * @Description
 * 属性：answer[]-->正确答案
 * 方法：check(String [] answers)--->检查答案是否正确，需要无视大小写和顺序
 * 构造函数
 *
 */
public class MulChoiceQuestion extends ChoiceQuestion{
    String [] answers;

    public MulChoiceQuestion(int id, String text, String[] options, String[] answers) {
        super(id, text, options);
        this.answers = answers;
    }

    public static void main(String[] args) {
        String s1 = "acd";

    }

    @Override
    public boolean check(String[] answers) {
        //1.直接把数组里面的大小写都转为大写
        char [] a1 = stringArray2String(answers).toUpperCase().toCharArray();
        char [] a2 = stringArray2String(this.answers).toUpperCase().toCharArray();
        //2.排序
        Arrays.sort(a1);
        Arrays.sort(a2);
        //3.判断
        return Arrays.equals(a1,a2);
    }

    public String stringArray2String(String [] src){
        String result = "";
        for (String s : src) {
            result+=s;
        }
        return result;
    }
}

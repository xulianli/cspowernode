package com.cspowernode.teaching.p1;

/**
 * @Author 汪洋
 * @Date 2023/3/20 9:53
 * @Description
 * 属性：answer-->正确答案
 * 方法：check(String [] answers)--->检查答案是否正确，只需要获取第一个元素即可
 * 构造函数
 *
 */
public class SingleChoiceQuestion extends ChoiceQuestion{
    String answer;

    public SingleChoiceQuestion(int id, String text, String[] options, String answer) {
        super(id, text, options);
        this.answer = answer;
    }

    @Override
    public boolean check(String[] answers) {
        if(answer==null||answers.length!=1){
            return false;
        }
        return this.answer.equalsIgnoreCase(answers[0]);
    }
}

package com.cspowernode.teaching.p1;

/**
 * @Author 汪洋
 * @Date 2023/3/20 9:52
 * @Description
 * 属性：String options[]-->代表选项
 * 方法：
 *  a、print-->把一道题的题号、题干、选项都打印在控制台的方法
 *  b、check(String [] answer)-->子类进行具体实现
 */
public class ChoiceQuestion extends Question{
    String [] options;

    public ChoiceQuestion(int id, String text, String[] options) {
        super(id, text);
        this.options = options;
    }
    public void print(){
        System.out.println(id+"."+text);
        for (String option : options) {
            System.out.println(option);
        }
    }
    public boolean check(String [] answers){
        return false;
    }
}

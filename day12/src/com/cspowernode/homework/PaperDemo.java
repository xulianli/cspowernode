package com.cspowernode.homework;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/19 16:43
 * @Description
 *  a.写一个Question.java的类，里面有题号id和题干text；1.你家谁力气最大
 * 	b.写一个ChoiceQuestion.java的类，它是Question的子类，里面有选项String options[]和打印的方法（print）
 * 	-->把一道题的题号、题干、选项都打印在控制台的方法
 * 	和一个检查答案正确性的一个方法(check(String [] answer))--->需要子类来重写；
 * 	c.写两个ChoiceQuestion的子类，分别是SingleChoice.java和MulChoice.java，这两个方法里面分别对check方法进行了重写，
 * 	他们里面各有各自的answer(正确答案，注意单选题是String类型，多选题是String[]类型)这个属性,以及有各自的构造器；
 * 	d.写一个PaperDemo.java的类，使用之前的类进行一个试卷类的书写，要求能够写入两个单选题跟两个多选题，并且能够使用控制台
 * 	输入答案的形式来进行题目的打印和答案的判断--->所有题目的数据都在该类里构建，通过构造函数传递数据构建对象
 * 	拓展(作业)：可以思考下，如果还有问答题、判断题，那么这个案例该怎么写？
 * 	提示：如何把一个字符串转为字符串数组："a,b,c"-->split(",")--->["a","b","c"]
 */
public class PaperDemo {
    public static void main(String[] args) {

        //定义两个单选题
        String [] options1 ={"A.Base method",
                "B.Child methodB",
                "C.Base method\n" + "Child methodB",
                "D.编译错误"};
        String [] options2 ={"A.多态不仅可以减少代码量，还可以提高代码的可扩展性和可维护性",
                "B.把子类转换为父类，称为向下转型，自动进行类型转换",
                "C.多态是指实现同一个父类，使用不同的子类实例来执行不同的操作",
                "D.继承是多态的基础，没有继承就没有多态"};
        //定义ChoiceQuestion class数组
        ChoiceQuestion[] ChoiceQuestions = new ChoiceQuestion[4];
        ChoiceQuestions[0]=new SingleChoice(1,"编译运行如下Java代码，输出结果是（  ）。（选择一项）",
                options1, "B");
        ChoiceQuestions[1]=new SingleChoice(2,"关于Java中的多态，以下说法不正确的为（  ）。（选择一项）",
                options2, "B");
        ChoiceQuestions[2] = new MulChoice(3,"编译运行如下Java代码，输出结果是（  ）。（选择一项）",
                options1, new String[]{"B", "C"});
        ChoiceQuestions[3] = new MulChoice(2,"关于Java中的多态，以下说法不正确的为（  ）。（选择一项）",
                options2, new String[]{"C", "d"});
        //打印题目并判断答案对错
        for (ChoiceQuestion q:ChoiceQuestions){
            q.print();
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的答案：");
            String[] answers = sc.next().split(",");
            System.out.println(q.check(answers));
        }
    }
}

class Question{
    int id;
    String text;

    public Question() {}

    public Question(int id, String text) {
        this.id = id;
        this.text = text;
    }
}

class ChoiceQuestion extends Question{
    String options[] = {};

    public ChoiceQuestion() {}

    public ChoiceQuestion(int id, String text, String[] options) {
        super(id, text);
        this.options = options;
    }

    void print(){
        System.out.println(id+". "+text);
        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i]);
        }
    }

    boolean check(String [] answer){
        return false;
    }
}

class SingleChoice extends ChoiceQuestion{
    String correctAnswer;

    public SingleChoice(int id, String text, String[] options, String correctAnswer) {
        super(id, text, options);
        this.correctAnswer = correctAnswer;
    }

    @Override
    boolean check(String [] answer) {
        if (answer == null || answer.length != 1)
            return false;
        return correctAnswer.equalsIgnoreCase(answer[0]);
    }
}

class MulChoice extends ChoiceQuestion{
    String [] correctAnswers;

    public MulChoice() {}

    public MulChoice(int id, String text, String[] options, String[] correctAnswers) {
        super(id, text, options);
        this.correctAnswers = correctAnswers;
    }

    @Override
    boolean check(String[] answer) {
        char[] a =Arrays.toString(answer).toUpperCase().toCharArray();
        char[] ca = Arrays.toString(correctAnswers).toUpperCase().toCharArray();
        Arrays.sort(ca);
        Arrays.sort(a);
        return Arrays.equals(ca,a);
    }


}

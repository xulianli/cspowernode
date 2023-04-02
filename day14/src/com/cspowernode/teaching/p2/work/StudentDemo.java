package com.cspowernode.teaching.p2.work;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @Author 汪洋
 * @Date 2023/3/21 14:25
 * @Description
 * 由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息，当输入的内容为exit退出；
 * 将输入的学生信息分别封装到一个Student对象中，再将每个Student对象加入到一个数组中，
 * 要求数组中的元素按照年龄大小正序排序；输出数组里面的学生信息，然后再按照姓名的
 * 长度来降序排列，输出数组里面的学生信息；
 *
 * 总结：通过本题目进行观察，我们会发现其实Comparator比较器更像是一种额外的比较工具，它
 * 可以构建出N多个不同的比较规则，当我们需要哪个就使用哪个，用完之后还可以继续使用其他的
 * 不管怎么使用这个工具，其实它不会对我们要排序的元素所在的类有任何的影响，我们对比下String
 * 这个类，同样是属于引用数据类型，那么为什么String类排序就不需要我们使用Comparator比较器呢？
 * 它仿佛本身就具备了一些排序规则，那么如果我们也想让某个类像String一样永远具备某个排序规则
 * 那么我们又该如何操作呢？
 */
public class StudentDemo {
    public static void main(String[] args) {
        //1.因为不确定学生数量，所以动态初始化学生数组
        Student [] students = {};
        //2.因为需要录入学生信息，所以初始化Scanner
        Scanner scan = new Scanner(System.in);
        //3.开始使用死循环来录入学生信息
        while(true){
            //4.提示并拿到你输入的内容
            System.out.println("请输入学生信息，按照以下格式:学号,姓名,年龄(结束的话使用exit)：");
            String input = scan.next();
            //5.判断是否是exit
            if("exit".equalsIgnoreCase(input)){
                break;
            }
            //6.把输入的字符串进行拆分
            String info[] = input.split(",");
            //7.对数组进行扩容
            students = Arrays.copyOf(students, students.length+1);
            //8.把新的数组对象放入到刚刚新增的数组位置上去:Integer.parseInt(String str):字符串转int
            students[students.length-1] =
                    new Student(Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2]));
        }
        //9.对数组进行自定义排序：按照age的升序排列
        Arrays.sort(students,new MyComparator1());
        System.out.println(Arrays.toString(students));
        //10.继续排序：按照name的长度降序
        Arrays.sort(students,new MyComparator2());
        System.out.println(Arrays.toString(students));
    }
}
//按照年龄的升序
class MyComparator1 implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age-o2.age;
    }
}
//按照姓名长度的降序
class MyComparator2 implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.name.length()-o1.name.length();
    }
}
class Student{
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

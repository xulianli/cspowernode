package com.cspowernode.homework;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

/**
 * @Author 徐联理
 * @Date 2023/3/30 19:50
 * @Description
 * 由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息，当输入的内容为exit退出；
 * 将输入的学生信息分别封装到一个Student对象中，再将每个Student对象加入到一个集合中，
 * 要求集合中的元素按照年龄大小正序排序；最后遍历集合，将集合中学生信息写入到记事本，每
 * 个学生数据占单独一行。写完文件之后，在文本中输入一串横杠作为分隔符，然后再把所有学
 * 生数据按照id降序的方式再写进文件里
 */
public class StudentInfo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        inputInfo(students);
        printInfo(students);
    }

    private static void inputInfo(List<Student> students) {
        System.out.println("输入学生姓名和分数（格式：编号#姓名#年龄）：");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            if ("exit".equalsIgnoreCase(input)) {
                break;
            }
            String[] info = input.split("#");
            students.add(new Student(Integer.parseInt(info[0]),info[1],Integer.parseInt(info[2])));
        }
        Collections.sort(students);
    }

    private static void printInfo(List<Student> students) {
        try {
            PrintWriter pw = new PrintWriter("c:\\test/studentsInfo.txt");
            for (Student student : students) {
                pw.println(student.toString());
            }
            pw.println("-----------------------------------");
            students.sort((o1, o2) -> o2.sid-o1.sid);
            for (Student student : students) {
                pw.println(student.toString());
            }
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Student implements Comparable<Student>{
    int sid;
    String name;
    int age;

    public Student(int sid, String name, int age) {
        this.sid = sid;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{ sid: " + sid + ", name: " + name + ", age: " + age + '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}

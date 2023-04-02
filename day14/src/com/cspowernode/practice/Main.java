package com.cspowernode.practice;

/**
 * @Author 徐联理
 * @Date 2023/3/21 14:45
 * @Description
 * 由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息，当输入的内容为exit退出；
 * 将输入的学生信息分别封装到一个Student对象中，再将每个Student对象加入到一个数组中，
 * 要求数组中的元素按照年龄大小正序排序；输出数组里面的学生信息，然后再按照姓名的
 * 长度来降序排列，输出数组里面的学生信息；
 * 1、构建Student类，里面有id、name、age和sex；
 * 2、让该类实现Comparable接口，并且重写里面的compareTo方法
 * 3、分别实现如下几种排序的要求：
 *     a、按照id降序；
 *     b、按照age升序；
 *     c、按照name升序；
 *     d、按照name的最后一个字母的降序；
 *     e、按照age进行升序，如果年龄一样，则按照id降序；
 * 注意：student里面的name都用英文，否则不好判断是否正确；。
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student[] students = {};
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("输入学生信息（学号，姓名，年龄）：如要退出请输入exit");
            String input = sc.nextLine();
            if ("exit".equalsIgnoreCase(input))
                break;
            String [] info = input.split(",");
            students = Arrays.copyOf(students,students.length+1);
            students[students.length-1] = new Student(Integer.parseInt(info[0]), info[1],Integer.parseInt(info[2]));
        }
        Arrays.sort(students);
        System.out.println("按照学生年龄升序排：");
        for (Student s:students) {
            System.out.println(s);
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.name.length()-o1.name.length();
            }
        });

        System.out.println("按照学生名字长度降序排：");
        for (Student s:students) {
            System.out.println(s);
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
        return "{ sid:" + sid + ", name:" + name + ", age:" + age + '}';
    }

    @Override
    public int compareTo(Student o) {
        //a、按照id降序；
//        return o.sid-this.sid;
        //b、按照age升序；
//        return this.age-o.age;
        //c、按照name升序；
        return this.name.compareTo(o.name);
        //d、按照name的最后一个字母的降序；
//        char[] ochar = o.name.toCharArray();
//        char[] thischar = this.name.toCharArray();
//        return ochar[ochar.length-1]-thischar[thischar.length-1];
        //e、按照age进行升序，如果年龄一样，则按照id降序；
//        if (this.age==o.age)
//            return o.sid - this.sid;
//        else
//            return this.age - o.age;

    }
}
/*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("请输入学生信息，格式为：学号，姓名，年龄。如需退出，请输入exit");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            String[] info = input.split(",");
            String id = info[0].trim();
            String name = info[1].trim();
            int age = Integer.parseInt(info[2].trim());
            Student student = new Student(id, name, age);
            students.add(student);
        }

        Collections.sort(students);
        System.out.println("按照年龄正序排列后的学生信息：");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getName().length() - s1.getName().length();
            }
        });
        System.out.println("按照姓名长度降序排列后的学生信息：");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

class Student implements Comparable<Student> {
    private String id;
    private String name;
    private int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Student s) {
        return this.age - s.age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
*/


package com.cspowernode.pratice;

import java.util.*;

/**
 * @Author 徐联理
 * @Date 2023/4/1 14:06
 * @Description
 */
public class HashMapPractice {
    public static void main(String[] args) {
//        hashMapBooks();
//        hashMapFind();
//        listToMap();
        mapToList();


    }

    private static void mapToList() {
        Map<Integer, Student> studs = new HashMap<>();
        studs.put(1001,new Student(1001,"wangwu",19,"male"));
        studs.put(1002,new Student(1002,"lisi",20,"female"));
        studs.put(1003,new Student(1003,"zhangsan",18,"female"));
        studs.put(1004,new Student(1004,"liu",12,"male"));
        List<Student> students = new ArrayList<>();
        Set<Map.Entry<Integer, Student>> entries = studs.entrySet();
        for (Map.Entry<Integer, Student> entry : entries) {
            students.add(entry.getValue());
        }
    }

    private static void listToMap() {
        List<Student> students = new ArrayList<>(Arrays.asList(new Student(1001,"wangwu",19,"male"),
                new Student(1002,"lisi",20,"female"),
                new Student(1003,"zhangsan",18,"female"),
                new Student(1004,"liu",12,"male")) );
        Map<Integer,Student> stud = new HashMap<>();
        Iterator<Student> it = students.iterator();
        while (it.hasNext()){
            Student st = it.next();
            stud.put(st.id, st);
            System.out.println(st.toString());
        }
        System.out.println("----------------------------------------");
        Set<Map.Entry<Integer, Student>> entries = stud.entrySet();
        for (Map.Entry<Integer, Student> entry : entries) {
            System.out.println("key="+entry.getKey()+", value: "+entry.getValue());
        }


    }

    private static void hashMapFind() {
        HashMap<Character, Integer> table = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一串字母：");
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char key = input.charAt(i);
            if (!table.containsKey(key)){
                table.put(key,1);
            }else {
                int val = table.get(key);
                table.put(key, val + 1);
            }
        }
        Iterator<Character> charIt = table.keySet().iterator();
        while (charIt.hasNext()){
            char key = charIt.next();
            System.out.println(key+"="+table.get(key));
        }


    }

    private static void hashMapBooks() {
        HashMap<Integer, Book> books = new HashMap<>();
        Book book1 = new Book(1001,"三国演义",19.9,"人民出版社");
        Book book2 = new Book(1002,"红楼梦",29.9,"人教出版社");
        Book book3 = new Book(1003,"水浒传",49.9,"湖南出版社");
        Book book4 = new Book(1004,"西游记",39.9,"湖南出版社");
        books.put(book1.bid,book1);
        books.put(book2.bid,book2);
        books.put(book3.bid,book3);
        books.put(book4.bid,book4);
        Iterator<Integer> it = books.keySet().iterator();
        while (it.hasNext()){
            int next = it.next();
            System.out.println(next+"-"+books.get(next));
        }
    }
}

class Book{
    int bid;
    String name;
    double price;
    String publisher;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return bid == book.bid && Double.compare(book.price, price) == 0 && Objects.equals(name, book.name) && Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bid, name, price, publisher);
    }

    public Book(int bid, String name, double price, String publisher) {
        this.bid = bid;
        this.name = name;
        this.price = price;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid:" + bid +
                ", name:《" + name + '》' +
                ", price:" + price +
                "元, publisher:" + publisher  +
                '}';
    }
}

class Student{
    int id;
    String name;
    int age;
    String sex;

    public Student(int id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return id == student.id && age == student.age && Objects.equals(name, student.name) && Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, sex);
    }
}

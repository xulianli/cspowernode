package com.cspowernode.practice;

/**
 * @Author 徐联理
 * @Date 2023/3/16 11:38
 * @Description
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("10001","Alex","male",15,89);
        Student student2 = new Student("10002","Bob","male",16,98);
        Student student3 = new Student("10003","Cindy","female",15,60);
        Student student4 = new Student("10004","Dylan","male",14,80);
        Student student5 = new Student("10005","Flora","female",15,74);
        double average = (student1.getJava()+student2.getJava()+student3.getJava()
                +student4.getJava()+student5.getJava())/5;
        System.out.println(student1+"\n"+student2+"\n"+student3+"\n"+student4+"\n"+student5);
        System.out.println("平均分："+average);
    }
}
class Student {
    String sNO;
    String sName;
    String sSex;
    int sAge;
    double sJava;

    Student() {

    }

    public Student(String id, String name, String sex, int age, double grade) {
        sNO = id;
        sName = name;
        sSex = sex;
        sAge = age;
        sJava = grade;
    }

    public String getNO() {
        return sNO;
    }

    public String getName() {
        return sName;
    }

    public String getSex() {
        return sSex;
    }

    public int getAge() {
        return sAge;
    }

    public double getJava() {
        return sJava;
    }

    public String toString() {
        return "NO:" + sNO + ", Name:" + sName + ", Sex:" + sSex + ", Age:" + sAge + ", Java grade:" + sJava;
    }
}
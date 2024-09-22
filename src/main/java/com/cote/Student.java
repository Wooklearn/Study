package com.cote;

public class Student {
    private String Name;
    private int age;
    private int studentNumber;

    public Student() {
    }

    public Student(String name, int age, int studentNumber) {
        Name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Application04{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", studentNumber=" + studentNumber +
                '}';
    }
}

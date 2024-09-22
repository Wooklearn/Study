package com.cote;

public class Application04 {
//    학생 클래스 생성:
//
//    Student라는 클래스를 생성하세요. 이 클래스는 이름, 나이, 학번 속성을 가지고 있어야 합니다.
//    이 클래스를 사용하여 학생 객체를 생성하고, 각 학생의 정보를 출력하는 프로그램을 작성하세요.

    public static void main(String[] args) {
        Student student = new Student("김용욱", 20, 145214);
        Student student1 = new Student("김용팔", 20, 145214);


        System.out.println(student);
        System.out.println(student1);



    }



}

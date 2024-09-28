package com.Siwoolecture;

public class Application {

    public static void main(String[] args) {

        //생성자는 클래스 안에 있는 함수 / 형식이 대문자로 시작 / 클래스 이름과 같음
        //기본생성자라는게 있고, 매개변수를 활용하여 오버로딩 가능
        //생성자 = 객체를 생성할 때 쓰는것  ->  클래스를 복제하는거와 같다

        // 생성자(UserDTO)를 호출해서 객체(new UserDTO();)를 생성한다.
        // 클래스는 기본 생성자가 있고 컴파일할 때 생김 UserDTO(){}
        // 생성자는 오버로딩 해서 매개변수를 여러개 받아서 ㅅ
        UserDTO user = new UserDTO();
//
//        Siwoo sw = new Siwoo();
//
//        System.out.println(sw.sum(5,4,4));
//        // 메소드 : 기능을 재사용하기 위해 만듦, 소문자로 시작함.
//        System.out.println(sw.sumf(5,4));

    }
}



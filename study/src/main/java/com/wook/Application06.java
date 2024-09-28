package com.wook;

import java.util.Scanner;

public class Application06 {

    public static void main(String[] args) {

//문제 설명: 정수를 입력받아 해당 정수가 짝수인지 홀수인지 판별하는 메소드를 작성하시오. 결과는 "짝수" 또는 "홀수"로 반환해야 합니다.
//입력: 정수 n (예: 7)
//출력: "홀수" 또는 "짝수" (예: "홀수")
//힌트: 삼항 연산자를 사용하여 짝수와 홀수를 판별하세요.


        System.out.println("정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("입력하신 정수는 : " + number + "입니다.");

        Application06 app = new Application06();
        String aa = app.oddEven(number);
        System.out.println("입력하신 정수는 : " + aa + "입니다.");



    }
    public String oddEven (int a) {

        return (a % 2 == 0) ? "짝수" : "홀수";


    }
}

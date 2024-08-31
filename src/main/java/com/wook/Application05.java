package com.wook;

import java.util.Scanner;

public class Application05 {

    public static void main(String[] args) {
// 사용자에게 0 ~ 100까지의 정수를 입력받아 점수에따라 A,B,C,D,E 로 평가하는 프로그램을 만드시오.
// 평가기준은 다음과 같습니다.
// 90 점 = A
// 80 점 = B
// 70 점 = C
// 60 점 = D
// 그 이외 = F
        //정수를 입력하는 코드
        System.out.print("정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("입력하신 정수는 : " + number + "입니다.");

        Application05 unit = new Application05();
        String score = unit.score(number);
        System.out.println("학점은 : " + score + "입니다.");

    }
    //점수를 계산하여 학점을 반환하는 코드
    public String score (int a) {


        String grade = (a >= 90) ? "A" : (a >= 80) ? "B" : (a >= 70) ? "C" : (a >= 60) ? "D": "F";
        return grade;
    }
}

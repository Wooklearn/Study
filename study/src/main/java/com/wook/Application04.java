package com.wook;

import java.util.Scanner;

public class Application04 {

    public static void main(String[] args) {
// 사용자로부터 정수를 입력받아 그 수가 짝수인지 홀수인지 판별하는 프로그램

        System.out.print("숫자를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("입력한 숫자는 : " + number + "입니다.");

        Application04 app = new Application04();
        String oddEven = app.program(number);

        System.out.println("입력하신 값은 : " + oddEven + "입니다.");

    }
    public String program (int a) {

        String oddEven = (a % 2 == 0) ? "짝수":"홀수";
        return oddEven;

    }

}

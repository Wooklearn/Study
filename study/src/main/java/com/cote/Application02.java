package com.cote;

import java.util.Scanner;

public class Application02 {
    // 사용자로부터 1부터 9 사이의 정수를 입력받아 해당 숫자의 구구단을 출력하는 프로그램을 작성하세요.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }

    }

}

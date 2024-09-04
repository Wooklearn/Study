package com.wook02;

import java.util.Scanner;

public class Problem04 {
    public void practice() {
        // 문제 01
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum+=i;
        }
        System.out.println("1~10까지 합 : " + sum);
    }

    public void practice02() {
        // 문제 08
        int random = (int)(Math.random()*10); //랜덤 객체

        Scanner sc = new Scanner(System.in);

        int trynum = 1;
        while (true) {
            System.out.print("정수를 입력해주세요 : ");
            int num = sc.nextInt();


            if (num < random) {
                System.out.println("입력하신 정수보다 큽니다.");
                trynum++;
            } else if (num > random) {
                System.out.println("입력하신 정수보다 작습니다.");
                trynum++;
            } else {
                System.out.println("정답입니다. " + trynum + "회 만에 맞추셨습니다.");
                break;
            }
        }
    }

    public void practice03() {
        /* 2보다 큰 정수를 하나 입력 받아 그 수가 소수인지 아닌지를 판별해서 출력하세요.
         * 소수인 경우 "소수다." 출력, 소수가 아닌 경우 "소수가 아니다."를 출력하면 됩니다.
         *
         * 단, 2보다 큰 정수가 아닌 경우 "잘못 입력하셨습니다. 다시 입력하세요." 라고 출력 후
         * 정수를 다시 입력 받도록 하세요.
         *
         * 참고) 소수란?
         * 어떤 수를 1부터 자기 자신까지 차례대로 나누었을 때
         * 나누어 떨어지는 수가 1과 자기 자신만 존재하는 수를 소수라고 한다.
         *
         * -- 입력 예시 --
         * 2보다 큰 정수를 하나 입력하세요 : 7
         *
         * -- 출력 예시 --
         * 소수다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();








    }

    public void practice04() {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");

        int num = sc.nextInt();


        for (int i = 1; i <= num; i++) {
            System.out.println();
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
        }

    }
    }

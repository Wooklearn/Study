package com.wook02;

import java.util.Scanner;

public class Problem04 {
    public void practice() {
        // 문제 01
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1~10까지 합 : " + sum);
    }

    public void practice02() {
        // 문제 08
        int random = (int) (Math.random() * 10); //랜덤 객체

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

    public void practice05() {
        // 반복문 01
        int sum = 0;

        for (int i = 1; i <= 10; i++) {

            sum += i;
        }


        System.out.println("sum = " + sum);
    }

    public void practice06() {
        // 반복문 02
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i++) {

            sum += i;


        }
        System.out.println("1부터 " + num + "까지의 합계는 : " + sum + "입니다.");
    }

    public void practice07() {
        /* 1부터 입력 받은 정수까지의 짝수의 합을 출력하세요.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 10
         *
         * -- 출력 예시 --
         * 1부터 10까지 짝수의 합 : 30
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(sum);
                sum += i;
            }
        }
        System.out.print("입력한 정수까지의 짝수의 합은 : " + sum + "입니다.");

    }

    public void practice08() {
        /* 문자열을 입력 받아서 문자열의 각 인덱스별로 한 글자씩 출력하세요.
         * 참고) 문자열의 길이는 String 클래스의 length() 메소드를 이용할 수 있습니다.
         *
         * -- 입력 예시 --
         * 문자열을 입력하세요 : apple
         *
         * -- 출력 예시 --
         * 0 : a
         * 1 : p
         * 2 : p
         * 3 : l
         * 4 : e
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();
//        System.out.println(str.charAt(0));

        for (int i = 0; i < str.length(); i++) {



            System.out.println(str.charAt(i));




        }
//
//
//            System.out.println();
//
//
//        }

    }

}

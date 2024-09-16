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
        // 반복문 03
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
        // 반복문 04
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            System.out.println(str.charAt(i));

        }
    }

    public void practice09() {
        // 반복문 05
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i);
        }
    }

    public void practice10() {
        // 반복문 06
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();


        for (int i = 1; i <= num; i++) {

            if (i % 2 == 0) {
                System.out.print("마");

            } else if (i % 2 != 0) {
                System.out.print("토");
            }
        }
    }

    public void practice11() {
        /* 1부터 100 사이의 난수를 발생시키고
         * 정수를 입력 받아서 입력받은 정수가 발생한 난수보다 큰 경우 "입력하신 정수보다 큽니다."를,
         * 입력받은 정수보다 난수가 작은 경우 "입력하신 정수보다 작습니다."를 출력하며
         * 입력한 정수와 난수와 같은 경우가 될 때까지 난수 맞추기를 반복하는 프로그램을 만드세요.
         *
         * 단, 입력한 정수와 난수가 같은 경우 "정답입니다. n회 만에 정답을 맞추셨습니다."라고
         * 정답을 입력한 횟수도 함께 출력되도록 해야 합니다.
         * 첫 회부터 바로 난수를 맞추는 경우는 1회만에 정답을 맞춘 것입니다.
         *
         * 정답을 맞추는 경우 위 내용을 출력하고 프로그램이 종료되도록 작성하세요.
         *
         * -- 프로그램 예시 --
         * 정수를 입력하세요 : 5
         * 입력하신 정수보다 작습니다.
         * 정수를 입력하세요 : 3
         * 입력하신 정수보다 큽니다.
         * 정수를 입력하세요 : 4
         * 정답입니다. 3회만에 정답을 맞추셨습니다.
         * */
        int random = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);



        int count = 1;

        while (true) {
            System.out.print("정수를 입력하세요 : ");

        }



    }



}








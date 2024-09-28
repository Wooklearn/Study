package com.wook02;

import com.sun.jdi.connect.ListeningConnector;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem02 {
    public void problem01() {
        //문제 01
        System.out.print("나이가 어떻게 되세요? : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 19) {
            System.out.println("판매 가능합니다.");
        } else if (age <= 18) {
            System.out.println("판매 불가능합니다. 음료 코너에서 골라주세요.");
        }
    }
    public void problem02() {
        //문제 02
        System.out.print("짝,홀 그 결과는? : ");
        Scanner sc = new Scanner(System.in);
        int oddEven = sc.nextInt();

        if (oddEven % 2 == 0) {
            System.out.println("짝수입니다 ~ !");
        } else {
            System.out.println("홀수입니다 ~ !");
        }
    }

    public void problem03() {
        // 문제 03
        System.out.print("당첨 번호가 어떻게 되세요? : ");
        Scanner sc = new Scanner(System.in);
        int winningNumber = sc.nextInt();

        if (winningNumber >= 10) {
            System.out.println("당첨 번호는 1 ~ 10 사이에만 있어요.");
        } else if (winningNumber % 2 != 0) {
            System.out.println("홀수네요, 인형 선물입니다!");
        } else if (winningNumber % 2 == 0) {
            System.out.println("짝수네요, 모자 선물입니다!");
        }
    }

    public void problem04() {
        //문제 04
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 키를 입력하세요(m) : ");
        double height = sc.nextDouble();
        System.out.print("당신의 몸무게를 입력하세요(kg) : ");
        double weight = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("bmi 수치는 : " + bmi);

        if (bmi < 20) {
            System.out.println("저체중입니다. 축제 음식을 왕창 드세요!");
        } else if (bmi > 20 && bmi < 25) {
            System.out.println("정상 체중입니다. 축제 재미있게 즐기세요~");
        } else if (bmi > 25 && bmi < 30) {
            System.out.println("축제에서 10,000보를 걷고 오시면 상품을 드려요!");
        } else if (bmi > 30) {
            System.out.println("댄싱 부스에 참가하시고 도장을 받아오시면 선물을 드려요!");
        }
    }

    public void problem05() {
        // 문제 05
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수를 입력하세요 : ");
        int second = sc.nextInt();
        System.out.print("연산기호를 입력하세요 (+, -, *, /, %) : ");
//        char ch = sc.next().charAt(0);
        String num = sc.next();


        int result = 0;

        switch (num) {
            case "+" : result = first + second;
            break;
            case "-" : result = first - second;
                break;
            case "/" : result = first / second;
                break;
            case "%" : result = first % second;
                break;
            case "*" : result = first * second;
                break;

            default:
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
                return;

        } System.out.println(first + " " +  num + " " + second + " = " + result);
    }
    public void problem06() {
        // 문제 06
        System.out.print("간식 이름을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String snack = sc.nextLine();

        int price = 0;

        switch (snack) {
            case "캬라멜팝콘" :
                System.out.println("캬라멜팝콘을 입력하셨습니다.");
                price = 15500;
                break;
            case "츄로스" :
                System.out.println("츄로스을 입력하셨습니다.");
                price = 3000;
                break;
            case "통감자" :
                System.out.println("츄로스을 입력하셨습니다.");
                price = 2000;
                break;
            case "도토리탕후루" :
                System.out.println("도토리탕후루을 입력하셨습니다.");
                price = 5000;
                break;
            default:
                System.out.println("해당 상품은 판매하지 않습니다.");
                return;

        }
        System.out.println(snack + "의 가격은 : " + price + "입니다." );
    }

    public void problem07() {
        // 문제 07
        Scanner sc = new Scanner(System.in);
        System.out.print("성실점수를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("서비스점수를 입력하세요 : ");
        int b = sc.nextInt();
        System.out.print("미소점수를 입력하세요 : ");
        int c = sc.nextInt();

        int average = (a + b + c) / 3;

        if (average >= 60 && a > 40 && b > 40 && c > 40) {
            System.out.println("합격입니다!");
        } else {
            if (a < 60) {
                System.out.println("성실점수 미달로 불합격입니다.");
            }
            if (b < 60) {
                System.out.println("서비스점수 미달로 불합격입니다.");
            }
            if (c < 60) {
                System.out.println("미소점수 미달로 불합격입니다.");
            }
        }

    }

    public void problem08() {
        // 문제 08
        Scanner sc = new Scanner(System.in);
        System.out.print("급여액을 입력하세요 : ");
        int salary = sc.nextInt();
        System.out.print("매출액을 입력하세요 : ");
        int sales = sc.nextInt();

        double bonus = 0;
        int totalsalary = 0;

        if (sales >= 50000000) {
            bonus = 0.05;
        } else if (sales >= 30000000) {
            bonus = 0.03;
        } else if (sales >= 10000000) {
            bonus = 0.01;
        } else if (sales < 10000000) {
            bonus = 0;
        }
        totalsalary = salary + (int)(sales * bonus);
        System.out.println("매출액은 : " + sales + "입니다.");
        System.out.println("보너스율은 : " + (bonus * 100) + " % " + "입니다.");
        System.out.println("월 급여는 : " + salary + "입니다.");
        System.out.println("보너스 금액은 : " + (int)(sales * bonus) + "입니다.");
        System.out.println("==========================================");
        System.out.println("총 급여는 : " + totalsalary + "입니다." );
    }

    public void problem09() {
//        9세 이상이면서 110cm 이상인 사람만 놀이기구를 탑승 가능 한 프로그램 만들기
//        조건 : 나이 조건에 만족하지 않으면 출력문으로 9살 넘으면 오시오.
//                키 조건에 만족하지 않으면 키 더 크고 오시오.
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.print("키를 입력하세요 : ");
        int height = sc.nextInt();

        if (age >= 9 && height >= 110) {
            System.out.println("놀이기구 탑승 가능");
        } else {
            if (age < 9) {
                System.out.println("나이 더 먹고 오세요.");
            }
            if (height <= 110) {
                System.out.println("키 더 크고 오세요.");
            }
        }
    }
}

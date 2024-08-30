package com.wook;

import java.util.Random;
import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

// 최소값, 최대값 입력하는거 정하기
// 프로그램 만들기

        System.out.print("최소값을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        System.out.println("입력한 최소값은 " + min + "입니다.");


        System.out.print("최대값을 입력하세요 : ");
        int max = sc.nextInt();
        System.out.println("입력한 최대값은 " + max + "입니다.");

        Application01 app = new Application01();
        int number = app.getRandomNumber(min, max);

        System.out.println("랜덤 숫자는 : " + number + "입니다.");

        //(최소값=5 과 최대값=10의 크기) + (최소값)
    }
    public int getRandomNumber(int a, int b) {
        Random rand = new Random();
        int number = rand.nextInt(b - a) + a;

        return number;

    }


}
// 첫 번째 인자의 최소값 부터 두 번쨰 인자까지 범위의 난수를 출력 (randomNumber 호출
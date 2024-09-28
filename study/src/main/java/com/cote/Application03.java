package com.cote;

import java.util.Scanner;

public class Application03 {
//    문자열 길이: 사용자로부터 문자열을 입력받아 그 문자열의 길이를 출력하는 프로그램을 작성하세요.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String st = sc.nextLine();

        int str = st.length();

            System.out.println("입력하신 문자열의 길이는 " + str + "입니다");
        }

    }


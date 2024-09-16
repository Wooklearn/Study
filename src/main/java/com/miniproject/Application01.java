package com.miniproject;

import java.util.Scanner;

import static com.miniproject.Crops.*;

public class Application01 {

    public static void main(String[] args) {

        private static String selectedCrop = ""; // 선택된 작물 저장
        private static int growthStage = 0; // 작물 성장 단계
        private static int money = 0; // 현재 돈
        Scanner sc = new Scanner(System.in);

        String selectedCrop = "옥수수";


        while (true) {

            System.out.println("게임을 시작합니다.");
            System.out.println("현재 돈: " + money + "원");
            System.out.println("1. 작물 선택");
            System.out.println("2. 작물 성장 (가위바위보)");
            System.out.println("3. 작물 팔기");
            System.out.println("0. 게임 설명");
            System.out.print("숫자를 입력하세요 : ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    selectCrop(sc);
                    break;
                case 2:
                    growCrop(sc);
                    break;
                case 3:
                    sellCrop();
                    break;
                case 0:
                    System.out.println("이 게임은 농장 게임입니다. 작물을 키우고 성장시킬 수 있으며, " +
                            "잘 키워진 작물을 팔아 1000원을 모으면 끝나는 게임입니다.");
                    break;
                default:
                    System.out.println("잘못 누르셨습니다. 다시 입력해주세요.");
                    return;
            }

            // 1000원이 되면 프로그램 종료
            if (money >= 1000) {
                System.out.println("축하합니다! 1000원을 모았습니다. 게임을 종료합니다.");
                return;
            }

            System.out.println("============================================================================================");
        }
    }
}

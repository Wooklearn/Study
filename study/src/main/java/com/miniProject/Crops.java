package com.miniProject;

import java.util.Random;
import java.util.Scanner;

public class Crops {
    private static String selectedCrop = ""; // 선택된 작물 저장
    private static int growthStage = 0; // 작물 성장 단계
    private static int money = 0; // 현재 돈
    static void selectCrop(Scanner sc) {
        System.out.println("작물을 선택하세요:");
        System.out.println("1. 옥수수 (가위바위보 1회, 판매 가격: 50원)");
        System.out.println("2. 감자 (가위바위보 2회, 판매 가격: 200원)");
        System.out.println("3. 토마토 (가위바위보 3회, 판매 가격: 500원)");
        System.out.print("작물 번호를 입력하세요: ");
        int cropChoice = sc.nextInt();

        switch (cropChoice) {
            case 1:
                selectedCrop = "옥수수";
                growthStage = 0; // 초기 성장 단계
                break;
            case 2:
                selectedCrop = "감자";
                growthStage = 0; // 초기 성장 단계
                break;
            case 3:
                selectedCrop = "토마토";
                growthStage = 0; // 초기 성장 단계
                break;
            default:
                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                return;
        }
        System.out.println(selectedCrop + "를 선택하셨습니다.");
    }

    static void growCrop(Scanner sc) {
        if (selectedCrop.isEmpty()) {
            System.out.println("먼저 작물을 선택하세요.");
            return;
        }

        int requiredRounds = 0;
        switch (selectedCrop) {
            case "옥수수":
                requiredRounds = 1; // 옥수수는 1번
                break;
            case "감자":
                requiredRounds = 2; // 감자는 2번
                break;
            case "토마토":
                requiredRounds = 3; // 토마토는 3번
                break;
        }

        System.out.println("가위, 바위, 보 중 하나를 선택하세요:");
        System.out.println("1. 가위");
        System.out.println("2. 바위");
        System.out.println("3. 보");
        int userChoice = sc.nextInt();

        Random random = new Random();
        int aiChoice = random.nextInt(3) + 1; // 1~3 사이의 랜덤 숫자 생성

        System.out.print("AI의 선택: ");
        switch (aiChoice) {
            case 1:
                System.out.println("가위");
                break;
            case 2:
                System.out.println("바위");
                break;
            case 3:
                System.out.println("보");
                break;
        }

        if (userChoice == aiChoice) {
            System.out.println("비겼습니다! 작물이 성장하지 않습니다.");
        } else if ((userChoice == 1 && aiChoice == 3) ||
                (userChoice == 2 && aiChoice == 1) ||
                (userChoice == 3 && aiChoice == 2)) {
            System.out.println("졌습니다! 작물이 처음부터 다시 성장합니다.");
            growthStage = 0; // 성장 단계 초기화
        } else {
            if (growthStage < requiredRounds) {
                growthStage++;
                System.out.println("이겼습니다! " + selectedCrop + "이(가) 성장했습니다. 현재 성장 단계: " + growthStage);
            } else {
                System.out.println(selectedCrop + "은(는) 이미 최대 성장 단계에 도달했습니다.");
            }
        }
    }
    static void sellCrop() {
        if (selectedCrop.isEmpty()) {
            System.out.println("먼저 작물을 선택하세요.");
        } else {
            int sellingPrice = 0;
            switch (selectedCrop) {
                case "옥수수":
                    sellingPrice = 50; // 판매 가격 (50원)
                    break;
                case "감자":
                    sellingPrice = 200; // 판매 가격 (200원)
                    break;
                case "토마토":
                    sellingPrice = 500; // 판매 가격 (500원)
                    break;
            }

            if (growthStage == (selectedCrop.equals("옥수수") ? 1 : (selectedCrop.equals("감자") ? 2 : 3))) { // 각 작물의 최대 성장 단계에서만 판매 가능
                money += sellingPrice;
                System.out.println(selectedCrop + "을(를) 판매하였습니다. 현재 돈: " + money + "원");
                selectedCrop = ""; // 판매 후 작물 초기화
                growthStage = 0; // 성장 단계 초기화
            } else {
                System.out.println(selectedCrop + "은(는) 아직 성장하지 않았습니다. 최대 성장 단계에 도달해야 판매할 수 있습니다.");
            }
        }
    }
}

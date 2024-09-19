package practice.practice01_CropsMinigame;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        int money = 0;

        while (true) {
            Crops crops = new Crops();
            Scanner sc = new Scanner(System.in);

            System.out.println("게임을 시작합니다.");
            System.out.println("현재 돈은 " + money + "원 입니다.");
            System.out.println("1. 작물 선택");
            System.out.println("2. 작물 성장 (가위바위보)");
            System.out.println("3. 작물 팔기");
            System.out.println("0. 게임 설명");

            System.out.println("숫자를 입력하세요 : ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    crops.selectCrop(sc);
            }



        }








    }
}

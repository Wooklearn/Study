package game;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {
        /* comment.
         *   프로그램 설계하기
         *   1. 필요한 객체 도출
         *   -> 플레이어(사용자), 카레이서, 자동차
         *   2. 객체 간의 상호작용
         *   -> 카레이서가 수신할 수 있는 메세지(카레이서가 해야 할 일)
         *   1. 시동을 걸어라
         *   2. 엑셀을 밟아라
         *   3. 브레이크를 밟아라
         *   4. 시동을 꺼라
         *   -> 자동차가 수신할 수 있는 메세지(자동차가 해야 할 일)
         *   1. 시동을 걸어라
         *   2. 앞으로 가라
         *   3. 멈춰라
         *   4. 시동을 꺼라
         *   */

        CarRacer01 Racer = new CarRacer01();




        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("======자동차 프로그램======");
            System.out.println("1. 시동 걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동 끄기");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴를 선택해주세요 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1 : Racer.start();
                    break;
                case 2 : Racer.go();
                    break;
                case 3 : Racer.stop();
                    break;
                case 4 : Racer.off();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("숫자를 잘못 입력하셨습니다.");
                    break;
            }
            if (menu == 9) {
                break;
            }

        }

    }
}

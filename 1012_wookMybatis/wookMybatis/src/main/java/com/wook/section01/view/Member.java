package com.wook.section01.view;

import com.wook.section01.controller.Controller;

import java.util.Scanner;

public class Member {

    public void member() {

        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller();

        do {
            System.out.println("====== 직원관리 프로그램 ======");
            System.out.println("1.직원 조회");
            System.out.println("2.이름으로 직원 조회");
            System.out.println("3.직원 입사");
            System.out.println("4.직원 정보 수정");
            System.out.println("5.직원 퇴사");
            System.out.println("9.프로그램 종료");
            System.out.println("============================");
            System.out.print("실행할 메뉴를 선택하세요 : ");

            int no = sc.nextInt();

            switch (no) {
                case 1:
                    controller.selectAllEmployee();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 9:
                    return;

            }

        } while (true);

    }

}

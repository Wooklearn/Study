package cote;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // 사용자로부터 정수를 입력받아, 그 수가 홀수인지 짝수인지 판별하는 프로그램을 작성하세요.

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + "은 짝수입니다.");
        } else {
            System.out.println(num + "은 홀수입니다.");
        }



    }
}

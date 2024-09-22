package com.cote;

public class Application05 {
    public static void main(String[] args) {

//        짝수와 홀수의 합: 1부터 100까지의 숫자 중 짝수와 홀수의 합을 각각 계산하여 출력하는 프로그램을 작성하세요.

        int even = 0;
        int odd = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {

                even += i;

            } else if (i % 2 != 0) {
                odd += i;
            }

        }System.out.println("짝수의 합은" + even + "입니다.");
        System.out.println("홀수의 합은" + odd + "입니다.");



    }
}

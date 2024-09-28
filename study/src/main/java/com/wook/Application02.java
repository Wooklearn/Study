package com.wook;

import java.util.Random;
import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {
// 앞면, 뒷면 중 한 가지를 출력함 (tossCoin 호출)

        Application02 coin = new Application02();
        String a = coin.coin();

        System.out.println("코인은 : " + a + "면 입니다.");
    }
    public String coin () {
        Random rd = new Random();

        return rd.nextBoolean() ? "앞":"뒤";
    }
}


//    public static void main(String[] args) {
//
//        // 앞면, 뒷면 중 한 가지를 출력함 (tossCoin 호출)
//        Application04 app = new Application04();
//        String aa = app.tossCoin();
//        System.out.println(aa);
//
//
//    }
//    public String tossCoin () {
//        Random coin = new Random();
//        coin.nextInt(2);
//
//        String result = (coin.nextInt(2) == 0) ? "앞면" : "뒷면";
//        return result;
//
//
//
//
//    }
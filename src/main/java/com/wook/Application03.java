package com.wook;

import java.util.Random;

public class Application03 {

    public static void main(String[] args) {

// 가위, 바위, 보 중 한 가지를 출력함 (rockPaperScissors 호출)

        Application03 app = new Application03();
        String a = app.rockPaperScissors();
        System.out.println(a);

    }
    public String rockPaperScissors () {

        Random rd = new Random();
        int rps = rd.nextInt(3);
        return (rps == 0) ? "가위" : (rps == 1) ? "바위" : "보";
    }
}

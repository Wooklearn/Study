package com.game;

public class CarRacer01 {

        Car01 car = new Car01();



        public void start() { // 시동
            car.start();

        }
        public void go() { //전진
            car.go();

        }
        public void stop() { //정지
            car.stop();

        }
        public void off() { //시동 끄기
            car.off();

        }





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
    }


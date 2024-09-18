package com.game;

public class Car01 {

    boolean onoff;
    int sum;

    public void start() {
        if (onoff) {
            System.out.println("시동을 먼저 걸어주세요");
        } else {
            this.onoff = true;
            System.out.println("시동을 켭니다.");
        }
    }
    public void go() {
        if (onoff) {
            this.sum += 10;
            System.out.println("앞으로 나아갑니다. " + this.sum + "속도로 나아갑니다.");
        } else {
            System.out.println("시동을 먼저 켜주세요.");
        }
    }
    public void stop() {
        if (onoff) {
            if (sum > 0) {
                sum = 0;
                System.out.println("끼익 멈췄습니다.!!");
            } else {
                System.out.println("이미 정지해있습니다.");
            }
        } else {
            System.out.println("시동을 걸어주세요");
        }
    }
    public void off() {

        if (onoff) {
            if (sum > 0) {
                System.out.println("속도를 줄여주세요, 브레이크 밟으세요");
            } else {
                System.out.println("시동을 끕니다.");
            }
        } else {
            System.out.println("이미 시동이 꺼져있습니다.");
        }
    }
}

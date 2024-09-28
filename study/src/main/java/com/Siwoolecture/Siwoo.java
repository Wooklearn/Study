package com.Siwoolecture;

public class Siwoo {
    public int sum (int a, int b) {
        return a+b;
    }

    public int sum (int[] list) {
        int result = 0;
        for (int i=0; i<list.length; i++){
            result += list[i];
        }

        return result;
    }
//
//    public int sum (int a, int b) {
//        return a/b;
//    }

//    public void sdajflk2 () {
//        return a/b;
//    }
}

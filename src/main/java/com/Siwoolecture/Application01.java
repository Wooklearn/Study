package com.Siwoolecture;

public class Application01 {

    public static void main(String[] args) {
        Method(1,1.5);
        Method(1.5,1);

    }

    public static void Method (int a, double b) {
        System.out.println("int a, double b");
    }
    public static void Method (double a, int b) {
        System.out.println("double b, int a");

    }




}

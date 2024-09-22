package com.calculator01;

public class Calculrator {

    public void plus(int first, int second) {
        System.out.println(first + " + " + second + " = " + (first + second));
    }
    public void minus(int first, int second) {
        System.out.println(first + " - " + second + " = " + (first - second));
    }
    public void Multiply(int first, int second) throws MultipleNotZeroException {

        if (first == 0 || second == 0) {
            throw new MultipleNotZeroException();
        }

        System.out.println(first + " * " + second + " = " + (first * second));
    }

    public void divide(int first, int second) throws DivideNotZeroException {

        if (first == 0 || second == 0) {
            throw new DivideNotZeroException();
        }

        System.out.println(first + " / " + second + " = " + (first / second));
    }
    public void share(int first, int second) {
        System.out.println(first + " % " + second + " = " + (first % second));
    }

}

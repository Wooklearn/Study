package com.calculator;

public class Calculrator {

    public void calculate (int first, int second) {

        int result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    public void calculate2 (int first, int second) {
        int result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    public void calculate3(int first, int second) throws MultipleNotZeroException {

        if (first == 0 || second == 0) {
            throw new MultipleNotZeroException();
        }

        int result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    public void calculate4(int first, int second)  throws DivideNotZeroException{

        if(first == 0 || second == 0){
            throw new DivideNotZeroException();
        }

        int result = first / second;
        System.out.println(first + " / " + second + " = " + result);

    }

    public void calculate5(int first, int second) {
        int result = first % second;
        System.out.println(first + " % " + second + " = " + result);
    }
}

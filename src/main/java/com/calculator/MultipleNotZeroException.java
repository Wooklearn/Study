package com.calculator;

public class MultipleNotZeroException extends Exception {

    public MultipleNotZeroException () {

        super("곱하는 수는 0이 될 수 없습니다.");

    }

}

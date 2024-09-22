package com.calculator01;

public class MultipleNotZeroException extends RuntimeException {
    public MultipleNotZeroException() {
        super("곱하는 수는 0이 될 수 없습니다");
    }
}

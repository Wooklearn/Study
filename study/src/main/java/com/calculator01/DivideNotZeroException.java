package com.calculator01;

public class DivideNotZeroException extends RuntimeException {
    public DivideNotZeroException() {
        super("나눌 수는 0이 될 수 없습니다.");
    }
}

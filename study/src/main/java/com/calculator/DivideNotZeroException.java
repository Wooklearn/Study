package com.calculator;

public class DivideNotZeroException extends Exception {
    public DivideNotZeroException(){
        super("나눌 수는 0이 될 수 없습니다");
    }

}

package com.lernen.math;

public class NumObject {
    private Integer firstNum;
    private Integer secondNum;

    public NumObject(Integer firstNum, Integer secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public NumObject() {
    }

    public Integer getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(Integer firstNum) {
        this.firstNum = firstNum;
    }

    public Integer getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(Integer secondNum) {
        this.secondNum = secondNum;
    }
}

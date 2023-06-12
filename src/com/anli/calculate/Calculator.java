package com.anli.calculate;

import com.anli.calculate.common.enums.Operator;
import com.anli.calculate.expression.ExpFactory;

import java.math.BigDecimal;
import java.util.Deque;
import java.util.LinkedList;

public class Calculator{
    private Deque<BigDecimal> resultStack = new LinkedList<>();

    public int calculate(Operator operator, int num1, int num2) {
        return calculate(operator, BigDecimal.valueOf(num1), BigDecimal.valueOf(num2)).intValue();
    }

    public float calculate(Operator operator, int num1, float num2) {
        return calculate(operator, BigDecimal.valueOf(num1), BigDecimal.valueOf(num2)).floatValue();
    }
    public long calculate(Operator operator, int num1, long num2) {
        return calculate(operator, BigDecimal.valueOf(num1), BigDecimal.valueOf(num2)).longValue();
    }
    public double calculate(Operator operator, int num1, double num2) {
        return calculate(operator, BigDecimal.valueOf(num1), BigDecimal.valueOf(num2)).doubleValue();
    }
    public float calculate(Operator operator, float num1, int num2) {
        return calculate(operator, BigDecimal.valueOf(num1), BigDecimal.valueOf(num2)).floatValue();
    }
    public float calculate(Operator operator, float num1, float num2) {
        return calculate(operator, BigDecimal.valueOf(num1), BigDecimal.valueOf(num2)).floatValue();
    }
    public double calculate(Operator operator, float num1, double num2) {
        return calculate(operator, BigDecimal.valueOf(num1), BigDecimal.valueOf(num2)).doubleValue();
    }
    public float calculate(Operator operator, float num1, long num2) {
        return calculate(operator, BigDecimal.valueOf(num1), BigDecimal.valueOf(num2)).floatValue();
    }
    public double calculate(Operator operator, double num1, float num2) {
        return calculate(operator, BigDecimal.valueOf(num1), BigDecimal.valueOf(num2)).doubleValue();
    }
    public double calculate(Operator operator, double num1, double num2) {
        return calculate(operator, BigDecimal.valueOf(num1), BigDecimal.valueOf(num2)).doubleValue();
    }
    public double calculate(Operator operator, double num1, int num2) {
        return calculate(operator, BigDecimal.valueOf(num1), BigDecimal.valueOf(num2)).doubleValue();
    }
    public double calculate(Operator operator, double num1, long num2) {
        return calculate(operator, BigDecimal.valueOf(num1), BigDecimal.valueOf(num2)).doubleValue();
    }

    public  BigDecimal undo() {
        if (resultStack.isEmpty()) {
            return BigDecimal.ZERO;
        }
        resultStack.pollLast();
        return resultStack.peekLast();
    }

    public  BigDecimal redo() {
        if (resultStack.isEmpty()) {
            return BigDecimal.ZERO;
        }
        resultStack.offerLast(resultStack.peekLast());
        return resultStack.peekLast();
    }
    public BigDecimal getResult() {
        return resultStack.peekLast();
    }

    private BigDecimal calculate(Operator operator, BigDecimal num1, BigDecimal num2) {
        BigDecimal result = ExpFactory.getExp(operator).calculate(num1, num2);
        resultStack.addLast(result);
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(Operator.MUL, 100, 3.23));
        System.out.println(calculator.calculate(Operator.ADD, 1.0, 3.25));
        System.out.println(calculator.getResult());
        System.out.println(calculator.undo());
    }
}

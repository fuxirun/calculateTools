package com.anli.calculate.expression;

import java.math.BigDecimal;

public class AddExp extends CalculateExp {

    @Override
    public BigDecimal calculate(BigDecimal num1, BigDecimal num2) {
        return num1.add(num2);
    }
}

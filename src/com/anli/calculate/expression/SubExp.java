package com.anli.calculate.expression;

import java.math.BigDecimal;

public class SubExp extends CalculateExp {

    @Override
    public BigDecimal calculate(BigDecimal num1, BigDecimal num2) {
        return num1.subtract(num2);
    }
}

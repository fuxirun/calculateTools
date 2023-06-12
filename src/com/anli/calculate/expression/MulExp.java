
package com.anli.calculate.expression;

import com.anli.calculate.expression.CalculateExp;

import java.math.BigDecimal;

public class MulExp extends CalculateExp {
    @Override
    public BigDecimal calculate(BigDecimal num1, BigDecimal num2) {
        return num1.multiply(num2);
    }
}

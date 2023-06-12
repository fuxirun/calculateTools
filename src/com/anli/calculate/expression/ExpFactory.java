package com.anli.calculate.expression;

import com.anli.calculate.common.enums.Operator;

import java.util.HashMap;
import java.util.Map;

public class ExpFactory {
    private static Map<Operator, CalculateExp> map = new HashMap<>();

    static {
        map.put(Operator.ADD, new AddExp());
        map.put(Operator.SUB, new SubExp());
        map.put(Operator.DEV, new DevExp());
        map.put(Operator.MUL, new MulExp());
    }

    public static CalculateExp getExp(Operator operator) {
        if (!map.containsKey(operator)) {
            throw  new RuntimeException("操作类型错误！");
        }
        return map.get(operator);
    }
}

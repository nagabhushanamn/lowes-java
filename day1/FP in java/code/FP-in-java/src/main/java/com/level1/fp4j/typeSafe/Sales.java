package com.level1.fp4j.typeSafe;

public class Sales implements QuantityOfInterest {
    private final FunctionOverTime valueFunction;

    public Sales(FunctionOverTime valueFunction) {
        this.valueFunction = valueFunction;
    }

    public String getName() {
        return "Sales";
    }

    public double valueAt(int time) {
        return valueFunction.valueAt(time);
    }
}

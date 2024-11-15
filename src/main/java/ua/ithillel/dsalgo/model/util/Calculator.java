package ua.ithillel.dsalgo.model.util;

import java.util.function.BinaryOperator;

public class Calculator {
    public <T extends Number> T operate(T a, T b, BinaryOperator<T> operator) {
        return operator.apply(a, b);
    }
}

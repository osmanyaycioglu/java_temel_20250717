package org.example.calculator.oo;

public class MultiplyOperation implements IOperation {
    @Override
    public String getSummary() {
        return "MULTIPLY";
    }

    @Override
    public Long calculate(final Long val1,
                          final Long val2) {
        return val1 * val2;
    }
}

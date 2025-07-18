package org.example.calculator.oo;

public class CalculatorFactory {

    private static final IOperation[] operations = new IOperation[]{
            new AddOperation(),
            new SubsOperation(),
            new MultiplyOperation(),
            new DivideOperation()
    };


    public static IOperation createOperation(int index) {
        return operations[index - 1];
    }

    public static String getMenu() {
        StringBuilder builderLoc = new StringBuilder();

        for (int i = 0; i < operations.length; i++) {
            builderLoc.append(i + 1)
                      .append("-")
                      .append(operations[i].getSummary())
                      .append("\n");
        }
        return builderLoc.toString();
    }

}

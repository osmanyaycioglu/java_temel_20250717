package org.example.calculator.oo;

import java.util.Scanner;

public class CalculatorOO {
    public static void main(String[] args) {
        try (Scanner scannerLoc = new Scanner(System.in)) {
            loop1:
            while (true) {
                System.out.println("Hadi baştan başlayalım");
                loop2:
                while (true) {
                    System.out.println(CalculatorFactory.getMenu());
                    System.out.println("Choice : ");
                    int        iLoc         = scannerLoc.nextInt();
                    IOperation operationLoc = null;
                    try {
                        operationLoc = CalculatorFactory.createOperation(iLoc);
                    } catch (Exception eParam) {
                        continue loop2;
                    }
                    if (operationLoc == null) {
                        continue loop1;
                    }
                    System.out.println("First value : ");
                    long val1 = scannerLoc.nextLong();
                    System.out.println("Second value : ");
                    long val2         = scannerLoc.nextLong();
                    Long calculateLoc = null;

                    try {
                        calculateLoc = operationLoc.calculate(val1,
                                                              val2);
                    } catch (Exception eParam) {
                        System.out.println("Error : " + eParam.getMessage());
                        continue loop2;
                    }
                    System.out.println(operationLoc.getSummary() + " Result : " + calculateLoc);
                    continue loop1;
                }
            }
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }

}

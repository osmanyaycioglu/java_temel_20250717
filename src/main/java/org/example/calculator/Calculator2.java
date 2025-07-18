package org.example.calculator;

import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {
        int ab = CalculatorCommon.INITIAL_VAL;

        ECalculationProcess[] valuesLoc = ECalculationProcess.values();

        for (ECalculationProcess valueLoc : valuesLoc) {
            if (valueLoc.getIndex() != 99){
                System.out.println(valueLoc.getIndexSummary());
            }
        }

        System.out.println("seçiniz");

        Scanner             scannerLoc             = new Scanner(System.in);
        int                 iLoc                   = scannerLoc.nextInt();
        ECalculationProcess eCalculationProcessLoc = ECalculationProcess.getEnumVal(iLoc);
        System.out.println("Index : " + eCalculationProcessLoc);
        if (eCalculationProcessLoc == ECalculationProcess.ERROR) {
            System.out.println(CalculatorCommon.ERROR_STR);
            return;
        }
        System.out.println("İlk değer : ");
        int val1 = scannerLoc.nextInt();
        System.out.println("İkinci değer : ");
        int val2  = scannerLoc.nextInt();
        int sonuc = -1;
        switch (eCalculationProcessLoc) {
            case ADD:
                sonuc = val1 + val2;
                break;
            case SUBS:
                sonuc = val1 - val2;
                break;
            default:
                break;
        }
        System.out.println("Sonuç : " + sonuc);
    }
}

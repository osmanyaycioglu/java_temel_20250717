package org.example.calculator;

import java.util.Scanner;

public class Calculator {

    public static final int ADD_INDEX = 1;
    public static final int SUBS_INDEX = 2;

    public static void main(String[] args) {
        System.out.println(ADD_INDEX + "-toplama");
        System.out.println(SUBS_INDEX + "-çıkartma");
        System.out.println("seçiniz");

        Scanner scannerLoc = new Scanner(System.in);
        int index = scannerLoc.nextInt();
        System.out.println("Index : " + index);
        if (index < 1 || index > 2) {
            System.out.println("Sadece 1,2 seçebilirsiniz.");
            return;
        }
        System.out.println("İlk değer : ");
        int val1 = scannerLoc.nextInt();
        System.out.println("İkinci değer : ");
        int val2 = scannerLoc.nextInt();
        int sonuc = -1 ;
        switch (index){
            case ADD_INDEX:
                sonuc = val1 + val2;
                break;
            case SUBS_INDEX:
                sonuc = val1 - val2;
                break;
            default:
                break;
        }
        System.out.println("Sonuç : " + sonuc);
    }

}

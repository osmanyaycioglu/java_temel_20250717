package org.example.java.exp;

import java.util.Scanner;

public class ExpRun {
    public static void main(String[] args) {
        MyExpTest myExpTestLoc = new MyExpTest();

        // Scanner scannerLoc = new Scanner(System.in);
        try (Scanner scannerLoc = new Scanner(System.in)) {
            myExpTestLoc.method1("test");
        } catch (IllegalArgumentException eParam) {
            System.out.println("Argument error");
        } catch (MyException eParam) {
            eParam.printStackTrace();
        } catch (Exception eParam) {
            System.out.println("Genel error");
        }

    }
}

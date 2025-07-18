package org.example.statics;

import org.example.calculator.Calculator;

public class Statics {
    public static String myStaticStr = "osman";

    private String str;


    public void method1(){
        System.out.println(str);
        System.out.println(myStaticStr);
    }

    public static void method2(){
        System.out.println(myStaticStr);
    }

    public static void main(String[] args) {
        Statics staticsLoc1 = new Statics();
        Statics staticsLoc2 = new Statics();
        Statics staticsLoc3 = new Statics();
        Statics staticsLoc4 = new Statics();
        Class<Calculator> calculatorClassLoc = Calculator.class;

        Statics.myStaticStr = "deneme";

        staticsLoc1.myStaticStr = "test";

    }

}

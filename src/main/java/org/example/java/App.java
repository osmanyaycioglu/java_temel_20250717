package org.example.java;

import org.example.navigation.Car;

import java.lang.annotation.Inherited;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        int a = 100;
        int a1 = a + 10;
        int a2 = 0x83747230;
        Integer oa = 100;
        // Integer oao = new Integer(100);

        long l = 29387129384723L;
        Long ol = 189237192837189237L;

        short s = 12;
        Short os = 12312;

        char c = 'a';
        Character oc = 0x2343;

        byte b = 127;
        Byte ob = -127;

        float f = 2.2F;
        Float of = 2.2F;

        double d = 123.2389645782364;
        Double od = 1.3284672379423;

        String stringLoc = "osman";

        Car carLoc = new Car(100);

        final int aVal = 100;

    }
}

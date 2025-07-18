package org.example.java.abstraction;

import org.example.java.Person;
import org.example.navigation.Car;

import java.util.Scanner;

public class HelloMain {
    public static void main(String[] args) {
        HelloCommon helloCommonLoc = new HelloCommon("xyz");

        Person personLoc = new Person();
        Object personO   = new Person();
        Person pLoc      = (Person) personO;
        // Car carLoc = (Car) personO;
        pLoc = null;
        System.out.println("Person : " + pLoc);

        Scanner scannerLoc = new Scanner(System.in);
        System.out.println(HelloFactory.getMenu());
        System.out.println("Hangi dil : ");
        int    iLoc        = scannerLoc.nextInt();
        IHello helloEngLoc = HelloFactory.createHelloImpl(iLoc);

        // HelloEng helloEngLoc1 = (HelloEng) helloEngLoc;

        System.out.println("isim : ");
        String nameInputLoc = scannerLoc.next();
        System.out.println("soyisim : ");
        String surnameInputLoc = scannerLoc.next();
        System.out.println("Call result : " + helloEngLoc.sayHello(nameInputLoc,
                                                                      surnameInputLoc));

    }
}

package org.example.navigation;

import org.example.java.Person;

public class CarRun {
    public static void main(String[] args) {
        Car carLoc = new Car(100);

        Object carO = new Car(100);



        System.out.println("Car averageSpeed : " + carLoc.getAverageSpeed());

        carLoc.setX(100);
        carLoc.setY(200);

        Person personLoc = new Person();
        personLoc.setName("osman");
    }
}

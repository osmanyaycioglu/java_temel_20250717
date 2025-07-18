package org.example.java.abstraction;

public interface IHello {

    int MY_INDEX = 100;

    String sayHello(String name,
                    String surname);

    String sayGoodbye(String name,
                      String surname);

    String getSummary();

    public static void method() {
        System.out.println("I am static method");
    }

    default public void defaultMethod(String name,
                                      String surname) {
        System.out.println(sayHello(name,
                                    surname) + " ---- " + sayGoodbye(name,
                                                                     surname));
    }

}

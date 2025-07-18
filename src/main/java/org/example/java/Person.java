package org.example.java;

public class Person {

    private   String  name;
    public    String  surname;
    protected Integer age;
    String address;
    int weight;
    int height;
    long stepCount;

    public String sayHello() {
        return "Hello " + name + " " + surname;
    }

    public String getName() {
        return name;
    }
}

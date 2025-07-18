package org.example.java.abstraction;

import java.io.Closeable;
import java.io.IOException;

public class HelloDutch extends AbstractHello implements  Closeable {

    public HelloDutch() {
        super("almanca");
    }

    @Override
    public String sayHello(final String name,
                           final String surname) {
        return "Hallo " + name + " " + surname;
    }

    @Override
    public String sayGoodbye(final String name,
                             final String surname) {
        return "Go " + name + " " + surname;
    }

    @Override
    public void close() throws IOException {
        System.out.println("Closed");
    }

}

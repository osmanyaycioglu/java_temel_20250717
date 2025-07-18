package org.example.java.abstraction;

import java.io.Closeable;
import java.io.IOException;

public class HelloJp extends AbstractHello implements  Closeable {

    public HelloJp() {
        super("japonca");
    }

    @Override
    public String sayHello(final String name,
                           final String surname) {
        return "Ha " + name + " " + surname;
    }

    @Override
    public String sayGoodbye(final String name,
                             final String surname) {
        return "Ho " + name + " " + surname;
    }

    @Override
    public void close() throws IOException {
        System.out.println("Closed");
    }

}

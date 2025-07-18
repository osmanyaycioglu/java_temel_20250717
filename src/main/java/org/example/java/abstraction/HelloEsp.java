package org.example.java.abstraction;

import java.io.Closeable;
import java.io.IOException;

public class HelloTr implements IHello, Closeable {

    @Override
    public String sayHello(final String name,
                           final String surname) {
        return "Merhaba " + name + " " + surname;
    }

    @Override
    public String sayGoodbye(final String name,
                             final String surname) {
        return "Güle güle " + name + " " + surname;
    }

    @Override
    public void close() throws IOException {
        System.out.println("Closed");
    }

}

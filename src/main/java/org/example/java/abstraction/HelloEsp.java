package org.example.java.abstraction;

import java.io.Closeable;
import java.io.IOException;

public class HelloEsp extends AbstractHello  implements Closeable {

    public HelloEsp() {
        super("isponyolca");
    }

    @Override
    public String sayHello(final String name,
                           final String surname) {
        return "Ola " + name + " " + surname;
    }

    @Override
    public String sayGoodbye(final String name,
                             final String surname) {
        return "Adios " + name + " " + surname;
    }

    @Override
    public void close() throws IOException {
        System.out.println("Closed");
    }

}

package org.example.java.abstraction;

import java.io.Closeable;
import java.io.IOException;

public class HelloEng extends AbstractHello implements Closeable {

    private static final String ENG_SUMMARY = "ingilizce";

    private String prefix;

    public HelloEng() {
        super(ENG_SUMMARY);
    }

    @Override
    public String sayHello(final String name,
                           final String surname) {
        return "Hello " + name + " " + surname;
    }

    @Override
    public String sayGoodbye(final String name,
                             final String surname) {
        return "Goodbye " + name + " " + surname;
    }

    @Override
    public void close() throws IOException {
        System.out.println("Closed");
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(final String prefixParam) {
        prefix = prefixParam;
    }
}

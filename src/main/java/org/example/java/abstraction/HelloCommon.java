package org.example.java.abstraction;

public class HelloCommon extends AbstractHello {

    public HelloCommon(final String summaryParam) {
        super(summaryParam);
    }

    @Override
    public String sayHello(final String name,
                           final String surname) {
        return null;
    }

    @Override
    public String sayGoodbye(final String name,
                             final String surname) {
        return "Goodbye : " + name + " " + surname;
    }
}

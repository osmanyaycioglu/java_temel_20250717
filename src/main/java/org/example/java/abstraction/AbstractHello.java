package org.example.java.abstraction;

import java.lang.invoke.StringConcatFactory;

public abstract class AbstractHello implements IHello {
    private String summary;

    public AbstractHello(final String summaryParam) {
        summary = summaryParam;
    }

    @Override
    public String getSummary() {
        return summary;
    }
}

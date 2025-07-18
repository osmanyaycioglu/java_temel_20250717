package org.example.navigation;

import org.example.java.Person;

public class PersonAnotherEx extends Person {
    private String classLocal;

    public PersonAnotherEx() {
        super();
    }

    public void test() {
        System.out.println("Name : " + name);
        System.out.println("Step : " + getStepCount());
        this.classLocal = "testme";
        classLocal = "testone";
        inTest("abc");
    }

    @Override
    public void inTest(final String xyz) {
        System.out.println("Ezdim");
        super.inTest(xyz);
    }

    public void setClassLocal(final String classLocal) {
        this.classLocal = classLocal;
    }
}


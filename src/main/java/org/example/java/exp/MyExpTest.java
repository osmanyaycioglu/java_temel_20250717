package org.example.java.exp;

public class MyExpTest {


    public void method1(String str) throws MyException {
        if (str != null && !str.isEmpty()) {
            System.out.println("Gelen string : " + str);
        } else {
            throw new MyException();
        }
    }

}

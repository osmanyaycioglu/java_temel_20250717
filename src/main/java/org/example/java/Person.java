package org.example.java;

public class Person {

    protected String  name;
    private   String  surname;
    private   Integer age;
    private   String  address;
    private   int     weight;
    private   int     height;
    long    stepCount;

    public void inTest(String xyz){
        System.out.println("prefix : " + xyz + " name : " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(final String nameParam) {
        name = nameParam;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surnameParam) {
        surname = surnameParam;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(final Integer ageParam) {
        age = ageParam;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String addressParam) {
        address = addressParam;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(final int weightParam) {
        weight = weightParam;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(final int heightParam) {
        height = heightParam;
    }

    public long getStepCount() {
        return stepCount;
    }

    public void setStepCount(final long stepCountParam) {
        stepCount = stepCountParam;
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", age=" + age +
               ", address='" + address + '\'' +
               ", weight=" + weight +
               ", height=" + height +
               ", stepCount=" + stepCount +
               '}';
    }
}

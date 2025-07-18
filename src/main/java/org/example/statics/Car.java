package org.example.statics;

// Camel - averageSpeed
// Pascal - CarProcess
// Snake - car_process
// Kebap - car-process

public class Car {
    private final Integer averageSpeed;
    private Integer x;
    private Integer y;
    private Integer maxSpeed;

    public Car(final Integer averageSpeedParam) {
        averageSpeed = averageSpeedParam;
    }

    public void goForward(Integer amount) {

    }

    public void backward(Integer amount) {
    }

    public void turn(Integer direction) {
    }

    public Integer getAverageSpeed() {
        return averageSpeed;
    }

    public void setX(final Integer xParam) {
        if (xParam < 0) {
            x = 0;
        } else {
            x = xParam;
        }
    }

    public void setY(final Integer yParam) {
        y = yParam;
    }
}

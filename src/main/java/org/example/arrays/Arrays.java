package org.example.arrays;

// import org.example.navigation.Car;

public class Arrays {
    public static void main(String[] args) {
        int   i  = 100;
        int[] ia = new int[3];

        ia[0] = 10;
        ia[1] = 20;
        ia[2] = 30;

        int[] iaNew = new int[5];
        System.arraycopy(ia,
                         0,
                         iaNew,
                         0,
                         ia.length);

        ia = iaNew;

        for (int j = 0; j < ia.length; j++) {
            System.out.println(" J : " + j + " eleman : " + ia[j]);
        }

        System.out.println("----------------");

        for (int iLoc : ia) {
            System.out.println("Sıralı : " + iLoc);
        }

        Car[] carsLoc = new Car[3];
        carsLoc[0] = new Car(100);
        carsLoc[1] = new Car(100);
        org.example.navigation.Car[] carsLoc1 = new org.example.navigation.Car[3];

    }
}

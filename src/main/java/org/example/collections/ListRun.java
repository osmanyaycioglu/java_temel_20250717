package org.example.collections;

import java.util.ArrayList;
import java.util.List;

public class ListRun {
    public static void main(String[] args) {
        List<Integer> listLoc2 = List.of(10,
                                        20,
                                        30,
                                        40,
                                        50,
                                        60,
                                        70);

        List<Integer> listLoc = new ArrayList<>();
        listLoc.add(10);
        listLoc.add(20);
        listLoc.add(30);
        listLoc.add(40);
        listLoc.add(50);

        listLoc.add(60);

        for (int i = 0; i < listLoc.size(); i++) {
            System.out.println("i : " + i + " value : " + listLoc.get(i));
        }

        System.out.println("----------------");

        for (Integer integerLoc : listLoc) {
            System.out.println("For each : " + integerLoc);
        }

    }
}

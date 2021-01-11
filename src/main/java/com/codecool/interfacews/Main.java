package com.codecool.interfacews;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flying> animals = new ArrayList();

        animals.add(new Bird("Madárka", true));
        animals.add(new Bird("Vili", false));
        animals.add(new LadyBird("Babóca", true));
        animals.add(new LadyBird("Bubamara", true));

        for (Flying animal: animals){
            animal.fly();
        }

    }
}

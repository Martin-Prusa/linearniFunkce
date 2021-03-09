package com.company;

import java.util.ArrayList;

public class Gui {
    public static void printFunctions() {
        ArrayList<Funkce> funkce = Logic.getFunctions();
        for (Funkce func : funkce) {
            System.out.println("y = "+func.a+"x + "+func.b);
        }

    }
}

package com.company;

import java.util.ArrayList;

public class Gui {
    public static void printFunctions() {
        ArrayList<String[]> funkce = Logic.getFunctions();
        for (String[] strings : funkce) {
            System.out.println("y = "+strings[0]+"x + "+strings[1]);
        }

    }
}

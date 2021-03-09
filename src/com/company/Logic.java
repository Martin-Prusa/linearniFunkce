package com.company;

import java.util.ArrayList;

public class Logic {
    public static ArrayList<Funkce> getFunctions() {
        ArrayList<Funkce> list = Data.readFunctions();
        Data.writeCount(list.size());
        return list;
    }
}

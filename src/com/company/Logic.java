package com.company;

import java.util.ArrayList;

public class Logic {
    public static ArrayList<Funkce> getFunctions() {
        ArrayList<Funkce> list = Data.readFunctions();
        Data.writeCount(list.size(), "count.txt");
        Data.writeCount(countDistinct(list), "count_distinct.txt");
        return list;
    }

    public static int countDistinct(ArrayList<Funkce> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            Funkce funkce = list.get(i);
            boolean unique = true;
            for (int i1 = 0; i1 < list.size(); i1++) {
                Funkce funkce1 = list.get(i1);
                if(funkce.a == funkce1.a && funkce.b == funkce1.b && i != i1) {
                    unique = false;
                }
            }
            if(unique) count++;
        }

        return count;
    }
}

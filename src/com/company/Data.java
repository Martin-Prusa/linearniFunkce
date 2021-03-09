package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Data {
    public static ArrayList<Funkce> readFunctions() {
        ArrayList<Funkce> functions = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("functions.txt"));
            String nextLine = br.readLine();
            while(nextLine != null) {
                String[] arr = nextLine.substring(3).split(" "+(char)42+" ");
                Funkce f = new Funkce();
                f.a = Integer.parseInt(arr[1].substring(0, arr[1].length()-1));
                f.b = Integer.parseInt(arr[3]);
                functions.add(f);
                nextLine = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return functions;
    }

    public static void writeCount(int count) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("count.txt"));
            bw.write(count+"");
            bw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Data {
    public static ArrayList<String[]> readFunctions() {
        ArrayList<String[]> functions = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("functions.txt"));
            String nextLine = br.readLine();
            while(nextLine != null) {
                String[] arr = nextLine.substring(3).split(" "+(char)42+" ");
                functions.add(new String[]{arr[1].substring(0, arr[1].length()-1), arr[3]});
                nextLine = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return functions;
    }
}

package com.weltix.java.tutorial.basicio.iostreams;

import java.io.*;
import java.util.Scanner;

/**
 * Created by ASUS on 27.08.14.
 */
public class ScanXan {
    public static void main(String[] args) throws IOException {

        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("iostreams_xanadu.txt")));

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}
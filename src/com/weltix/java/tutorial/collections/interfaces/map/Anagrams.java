package com.weltix.java.tutorial.collections.interfaces.map;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by ASUS on 03.04.15.
 */
public class Anagrams {
    public static void main(String[] args) {
        int minGroupSize = Integer.parseInt(args[1]);

        // Read words from file and put into a simulated multimap
        Map<String, List<String>> m = new HashMap<>();

        try {
            Scanner s = new Scanner(new File(args[0]));
            while (s.hasNext()) {
                String word = s.next();
                String alpha = alphabetize(word);
//                List<String> l = m.get(alpha);
//                if (l == null)
//                    m.put(alpha, l = new ArrayList<>());
                // lets use lambda expression instead of above code
                List<String> l = m.computeIfAbsent(alpha,
                        stringKey -> new ArrayList<>()
                );
                l.add(word);
            }
        } catch (IOException e) {
            System.err.println(e);
            System.exit(1);
        }

        // Print all permutation groups above size threshold
        for (List<String> l : m.values())
            if (l.size() >= minGroupSize)
                System.out.println(l.size() + ": " + l);
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */

package ex46;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class wordFrequency {
    public void count() throws Exception {
        String line, word = "";
        int count = 0;
        ArrayList<String> words = new ArrayList<String>();

        // Open the file
        FileReader file = new FileReader("src/main/java/ex46/exercise46_input.txt");
        BufferedReader br = new BufferedReader(file);

        // Read each line
        while ((line = br.readLine()) != null) {
            String str[] = line.split(" ");

            for (String s : str) {
                words.add(s);
            }
        }

        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
            Integer n = map.get(w);
            if (n == null) {
                n = 1;
            } else {
                n++;
            }
            map.put(w, n);
        }

        map = map.entrySet().stream().sorted(comparingByValue(Comparator.reverseOrder())).collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + ":\t");
            for (int i = 0; i < entry.getValue(); i++)
                System.out.print("*");
            System.out.println();
        }
        br.close();
    }
}

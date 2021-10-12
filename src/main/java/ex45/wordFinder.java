/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 first_name last_name
 */

package ex45;

import java.io.*;

public class wordFinder {
    static void replaceWord(String inputFile, String outputFile, String oldString, String newString) {
        /* try:
           scan file
           while nextLine:
               names.add(scan)
           close file */
        String old = "";
        BufferedReader br = null;
        FileWriter writer = null;

        try {
            String a;
            br = new BufferedReader(new FileReader(inputFile));
            String line = br.readLine();
            while (line != null) {
                old = old + line + System.lineSeparator();
                line = br.readLine();
            }
            System.out.println(old);
            String newContent = old.replace("utilize", "use");
            System.out.println(newContent);
            writer = new FileWriter(outputFile);
            writer.write(newContent);

            br.close();
            writer.close();
            // catch file not found exception
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

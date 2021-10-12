/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Emilly Wasson
 */

package ex44;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import ex44.Data;

public class productSearch {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = "";
        try {
            json = Files.readString(Path.of("./src/main/java/ex44/exercise44_input.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Data data = gson.fromJson(json, Data.class);

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("What is the product name? ");
            String name = in.nextLine();

            if (data.search(name)) {
                break;
            }
        }
    }
}

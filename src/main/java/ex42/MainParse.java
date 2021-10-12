/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Emilly Wasson
 */

package ex42;
import ex42.parsingData;

public class MainParse {
    public static void main(String[] args) {
        parsingData reader = new parsingData();
        // function main:
        // names = call fileReader;
        reader.fileReader();

        reader.output();

    }
}
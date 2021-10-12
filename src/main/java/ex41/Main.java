/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Emilly Wasson
 */

package ex41;
import ex41.NameReader;

public class Main {
    public static void main(String[] args) {
        NameReader reader = new NameReader();
        // function main:
        // names = call fileReader;
        reader.fileReader();

        // call sort;
        reader.sort();

        reader.output();
    }
}

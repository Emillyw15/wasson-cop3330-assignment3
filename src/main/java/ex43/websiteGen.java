/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Emilly Wasson
 */

package ex43;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class websiteGen {
    String sitepath = "";
    String jspath = "";
    String csspath = "";
    String site = "";
    String name = "";

    public void generateSite() {
        // create website directory
        // create index.html
        // create js directory
        // create css directory
        Scanner in = new Scanner(System.in);

        System.out.print("Site name: ");
        site = in.nextLine();
        sitepath = "./website/" + site;
        System.out.print("Author: ");
        name = in.nextLine();
        System.out.print("Do you want a folder for JavaScript? y/n ");
        String java = in.nextLine();
        // if yes:
        // create directory
        if (java.equals("y")) {
            jspath = sitepath + "/js/";
        }
        System.out.print("Do you want a folder for CSS? y/n ");
        String css = in.nextLine();
        // if yes:
        // create directory
        if (css.equals("y")) {
            csspath = sitepath + "/css/";
        }

        new File(sitepath).mkdirs();
        System.out.println("Created " + sitepath);
        try {
            new File(sitepath + "/index.html").createNewFile();
        } catch (Exception e) {
            System.out.println(e);
        }

        makeIndex();
        System.out.println("Created " + sitepath + "/index.html");
        if (!jspath.isEmpty()) {
            new File(jspath).mkdirs();
            System.out.println("Created " + jspath);
        }
        if (!csspath.isEmpty()) {
            new File(csspath).mkdirs();
            System.out.println("Created " + csspath);
        }
    }

    public void makeIndex() {
        try {
            PrintWriter writer = new PrintWriter("./website/" + site + "/index.html");
            String template = "<!doctype html>\n"
                    + "<head>\n"
                    + "<meta name=\"author\" content=\"" + name + "\"></meta>\n"
                    + "</head>\n"
                    + "<html>\n"
                    + "<head>\n"
                    + "<title>" + site + "</title>\n"
                    + "</head>\n"
                    + "</html>";
            writer.println(template);
            writer.close();
        } catch (IOException e) {
            System.out.println("Could not make index due to exception:\n" + e);
        }
    }
}

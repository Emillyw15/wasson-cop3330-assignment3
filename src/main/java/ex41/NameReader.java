package ex41;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NameReader {
    public List<String> names;

    public NameReader() {
        // array names:
        this.names = new ArrayList<String>();
    }

    //function fileReader:
    public void fileReader() {
        /* try:
           scan file
           while nextLine:
               names.add(scan)
           close file */
        try {
            String file = "src/main/java/ex41/exercise41_input.txt";
            BufferedReader in = new BufferedReader(new FileReader(file));
            String fileRead = in.readLine();

            while (fileRead != null) {
                this.names.add(fileRead);
                fileRead = in.readLine();
            }
            in.close();
            // catch file not found exception
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void sort() {
        /* function sort:
        for each pair:
            compare pair[0], pair[1]
            if not same:
                swap
         */
        for (int i = 0; i < this.names.size(); i++) {
            for (int j = 0; j < this.names.size(); j++) {
                if(this.names.get(i).compareTo(this.names.get(j)) < 0) {
                    String str = this.names.get(i);
                    this.names.set(i, this.names.get(j));
                    this.names.set(j, str);
                }
            }
        }
    }

    public void output() {
        try {
            PrintWriter writer = new PrintWriter("src/main/java/ex41/exercise41_output.txt", "UTF-8");
            // print names to outfile;
            writer.println("Total of " + this.names.size() + " names");
            writer.println("-----------------");

            for (int i = 0; i < this.names.size(); i++) {
                writer.println(this.names.get(i));
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

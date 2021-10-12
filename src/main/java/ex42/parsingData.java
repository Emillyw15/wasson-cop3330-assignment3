package ex42;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class parsingData {
    public List<String> names;

    public parsingData() {
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
            String file = "src/main/java/ex42/exercise42_input.txt";
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

    public void output() {
        try {
            PrintWriter writer = new PrintWriter("src/main/java/ex42/exercise42_output.txt", "UTF-8");
            // print data to outfile;
            writer.println("Last      First     Salary");
            writer.println("--------------------------");

            for (int i = 0; i < this.names.size(); i++) {
                String[] data = this.names.get(i).split(",");
                writer.format("%-10s%-10s%-10s\n", data[0], data[1], data[2]);
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
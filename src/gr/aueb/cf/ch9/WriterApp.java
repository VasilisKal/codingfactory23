package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class WriterApp {

    public static void main(String[] args) {

        try (PrintStream ps = new PrintStream("c:/tmp/test1.txt");
            PrintWriter pw = new PrintWriter("c:/tmp/test2.txt", "Windows-1252")) {
            ps.println("Hello CF! from print stream");
            pw.println("Καλημερα σε ολους");
            pw.flush();
        } catch (IOException e) {
            System.out.println("File path not found");
        }
    }
}

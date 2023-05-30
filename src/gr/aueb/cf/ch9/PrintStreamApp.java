package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Prints with PrintStreamApp
 */
public class PrintStreamApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/f23.txt")) {
            ps.println("Hello World");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

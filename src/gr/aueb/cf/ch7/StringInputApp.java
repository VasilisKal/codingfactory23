package gr.aueb.cf.ch7;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class StringInputApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;

        System.out.println("Please provide a string");
        s = in.next(); // ends with whitespace (spaces, \t, \n)
        // se = in.nextLine();

        System.out.println(s);
    }
}


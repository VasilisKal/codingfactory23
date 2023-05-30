package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ένας μικρός βάτραχος θέλει να περάσει ένα ποτάμι.
 * Ο frog βρίσκεται στη θέση X και θέλει να φτάσει στη
 * θέση Y (ή σε θέση > Y). O frog jumps  fixed distance, D.
 *
 * Βρίσκει τον ελάχιστο αριθμό jumps που ο small frog πρέπει
 * κάνει ώστε να φτάσει στον στόχο του.
 *
 * Π.Χ. αν έχουμε X = 10, Y = 85 και D = 30
 * τότε ο small frog θα χρειαστεί 3 jumps.
 *
 * Τότε ο frog θα χρειαστεί 3 jumps, γιατί:
 * Starts at 10, και μετά το 1ο jump πάει στη θέση 10 + 30 = 40 κτλ
 */
public class FrogApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int jump;
        int counter = 0;

        System.out.println("Please give a starting position, a final position, and a jump");
        x = in.nextInt();
        y = in.nextInt();
        jump = in.nextInt();

        while (x < y) {
            x = x + jump;
            counter++;
        }
        System.out.println(counter);

        // Μπορεί να γίνει και με Math.ceil() στο ( y - x) / jump

    }
}

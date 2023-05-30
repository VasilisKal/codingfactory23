package gr.aueb.cf.ch4;

/**
 * Αέναο for loop.
 */
public class SpecialForCaseApp {

    public static void main(String[] args) {
        int counter = 0;

        for (;;) {  // while true
            System.out.println("Forever ");
            counter++;
            if (counter % 20 == 0) System.out.println();
            if (counter == 10) break;
        }
    }
}

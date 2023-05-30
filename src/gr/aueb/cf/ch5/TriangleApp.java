package gr.aueb.cf.ch5;

import java.util.Scanner;

public class TriangleApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 1.1;
        double b = 1.1;
        double c = 1.1;
        final double EPSILON = 0.00005;

        System.out.println("Παρακαλώ δώστε το μήκος της υποτείνουσας και των δύο πλευρών του τριγώνου");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (Math.abs(a*a - b*b - c*c) <= EPSILON) {
            System.out.println("Ορθογώνιο");
        } else {
            System.out.println("Όχι Ορθογώνιο");
        }

    }
}

package gr.aueb.cf.ch3;

import java.util.Scanner;

public class FactorialApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        int n = 0;
        long facto = 1L;

        System.out.println("Please insert an int");
        n = in.nextInt();

        while (i <= n){
            facto *= i;
            i++;
        }

        System.out.printf("%d! = %d", n, facto);
    }
}

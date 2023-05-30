package gr.aueb.cf.ch2;

public class IntPrintApp {
    public static void main(String[] args) {
        int i = 124;

        System.out.print(i);
        System.out.println(i);
        System.out.printf("%d", i);

        System.out.print("Result = " + i);
        System.out.println("Result = " + i);
        System.out.printf("Result = %d%n", i);

        System.out.printf("%,010d", i); // left padding
    }
}

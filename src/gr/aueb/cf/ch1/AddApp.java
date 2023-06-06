package gr.aueb.cf.ch1;

/**
 * Adds 2 integers
 */
 public class AddApp {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 7;
        int result = 0;

        result = num1 + num2;

        System.out.println("Το αποτέλεσμα είναι: " + result);
    }

    /**
     * Adds 2 ints
     *
     * @param     a the first int
     * @param     b the second add
     * @return    the sum of a, b
     *
     *
     */
    public static int add(int a, int b) {
        return a + b;
    }
}

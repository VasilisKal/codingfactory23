package gr.aueb.cf.ch5;

/**
 * Recursice n!
 */
public class FactorialRecursiveApp {

    public static void main(String[] args) {

        System.out.println(facto(10));
    }

    /**
     * Recursive solution of n!
     * @param n  n of n!
     * @return  n!
     */
    public static int facto(int n) {
//        if (n <= 1) return 1;
//        return n * facto(n-1);
        return (n <= 1) ? 1 : n * facto(n-1);
    }
}

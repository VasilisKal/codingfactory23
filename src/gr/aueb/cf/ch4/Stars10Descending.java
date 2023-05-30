package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 10, 9, 8...
 * αστεράκια σε κάθε γραμμή.
 */
public class Stars10Descending {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

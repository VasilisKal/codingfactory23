package gr.aueb.cf.ch7;

/**
 * Transforms strings.
 */
public class LowerUpperTrimApp {

    public static void main(String[] args) {
        String s = "Athens University";
        String lowercase;
        String uppercase;
        String trim;
        String s2 = "";

        lowercase = s.toLowerCase();
        uppercase = s.toUpperCase();
        trim = s.trim();

        System.out.println("*".repeat(10));

        if (s2.isEmpty()) {
            System.out.println(s2.length());
        }

//        if (s2.isBlank()) {
//            System.out.println("Blank");
//        }
    }
}

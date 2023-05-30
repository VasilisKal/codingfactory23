package gr.aueb.cf.ch8;

public class NullPointerEceptApp {

    public static void main(String[] args) {
        String s = null;

        if (s != null) {
            if (s.equals("Coding")) {
                System.out.println("Bingo");
            } else {
                System.out.println("Not equals");
            }
        } else {
            System.out.println("S is null");
        }
    }
}


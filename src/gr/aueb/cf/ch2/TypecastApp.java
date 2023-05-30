package gr.aueb.cf.ch2;

public class TypecastApp{
    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 20L;
        long result = 0;

        num1 = (int) num2;

        result = num1 + num2; // το αποτέλεσμα μετατρέπεται αυτόματα σε long - παίρνει το type του num2
    }
}

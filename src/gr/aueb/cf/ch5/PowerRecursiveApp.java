package gr.aueb.cf.ch5;


public class PowerRecursiveApp {

    public static void main(String[] args) {
        System.out.println(power(2, -13));
    }

    public static float power(float a, float b) {
        if (b == 0) return 1;
        if (b < 0) {
            return 1 / power(a, -b);
        }
        return a * power(a, b - 1);
    }
}

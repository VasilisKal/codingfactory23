package gr.aueb.cf.ch2;

public class RandomDieApp {
    public static void main(String[] args) {
        int die = (int) (Math.random() * 6) + 1; // η Math.random(), από μόνη της, δίνει float - οπότε κάνουμε typecast
        System.out.println(die);
    }
}

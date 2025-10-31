package loop_for_eg;

public class sum_by_reverse {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 5; i >= 1; i--) {
            sum += i;
        }
        System.out.println("Sum of first 5 natural numbers (reverse loop): " + sum);
    }
}

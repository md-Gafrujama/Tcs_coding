public class ToCheckNumberIsPositive {
    // Function to check if a number is positive or negative
    public static boolean isPositiveOrNegative(int n) {
        if (n > 0) {
            return true; // Positive or zero
        } else {
            return false; // Negative
        }
    }

    public static void main(String[] args) {
        int n = 89;

        // Correct if-else structure
        if (isPositiveOrNegative(n)) {
            System.out.println("+ve"); // Positive number
        } else {
            System.out.println("-ve"); // Negative number
        }
    }
}

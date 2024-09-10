public class ArmstrongNumber {

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int n) {
        int original = n; // Store the original number
        int sum = 0;
        int digits = String.valueOf(n).length(); // Calculate the number of digits

        // Calculate the sum of the digits raised to the power of the number of digits
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits); // Add digit^number of digits to sum
            n /= 10; // Remove the last digit
        }

        // Return true if the sum is equal to the original number
        return sum == original;
    }

    public static void main(String[] args) {
        int number = 153; // You can change this number for testing

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}

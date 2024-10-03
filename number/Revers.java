public class Revers {

    // Function to reverse the digits of a number
    public static int reverseNumber(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return reverse;
    }

    // Function to sum the digits of a number
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;  // Extract the last digit and add it to the sum
            n /= 10;  // Remove the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 145;  // Original number
        int reversedNumber = reverseNumber(n);  // Reverse the number
        int digitSum = sumOfDigits(reversedNumber);  // Sum the digits of the reversed number

        System.out.println("Original Number: " + n);
        System.out.println("Reversed Number: " + reversedNumber);
        System.out.println("Sum of Digits of Reversed Number: " + digitSum);
    }
}

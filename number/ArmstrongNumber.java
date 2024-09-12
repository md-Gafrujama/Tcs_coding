public class ArmstrongNumber {

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int n) {
        int original = n; 
        int sum = 0;
        int digits = String.valueOf(n).length(); // Calculate the number of 
        while (n > 0) {
            int digit = n % 10;//lastv digit
            sum += Math.pow(digit, digits); // Add digit^number of digits to sum
            n /= 10; // Remove the last digsit
        }

        // Return true if the sum is equal to the original number
        return sum == original;
    }

    public static void main(String[] args) {
        int number = 1634 ; // You can change this number for testing

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}


//Example 1:
//Input:N = 153
//Output:True
//Explanation: 13+53+33 = 1 + 125 + 27 = 153
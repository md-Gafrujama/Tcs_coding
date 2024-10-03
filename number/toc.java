import java.util.Scanner;

public class toc {
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false; // Prime numbers are greater than 1
        }
        for (int i = 2; i * i <= n; i++) { 
            if (n % i == 0) {
                return false; // If divisible by any number other than 1 and itself
            }
        }
        return true;
    }

    // Function to compute the sum of prime numbers up to n
    public static int sumOfPrimes(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i; // Add the prime number to the sum
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();  // Take user input
        
        // Compute and print the sum of prime numbers up to n
       // int sum = sumOfPrimes(n); b
       System.out.println(sumOfPrimes(n));

        sc.close(); // Close the scanner
    }
}

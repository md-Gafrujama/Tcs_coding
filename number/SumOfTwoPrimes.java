import java.util.Scanner;

public class SumOfTwoPrimes {

    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
// md gafrujama ansari
    // Function to check if a number can be expressed as the sum of two primes
    static boolean canBeSumOfTwoPrimes(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        // Input the number to check
       // System.out.print("Enter a number: ");
       // int n = scanner.nextInt();

        // Check if the number can be expressed as a sum of two primes
        int n =19;
        if (canBeSumOfTwoPrimes(n)) {
            System.out.println("Yes, it can be expressed as the sum of two primes.");
        } else {
            System.out.println("No, it cannot be expressed as the sum of two primes.");
        }

       // scanner.close();
    }
}

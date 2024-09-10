import java.util.*;

public class perfectNumber {
    public static boolean isPerfectNumber(int n) {
        if (n < 2) {
            return false; 
        }

        int sum = 1; // 1 is always a divisor
        // Find divisors from 2 to n/2
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
    public static void main(String[] args) {
        int n = 28;
        if (isPerfectNumber(n)) {
            System.out.println("Number is perfect");
        } else {
            System.out.println("Not a perfect number");
        }
    }
}

                                
import java.util.ArrayList;

public class printallprimefactor {
    public static ArrayList<Integer> getPrimeFactors(int n) {
        // Declare an ArrayList to store
        // the prime factors of n.
        ArrayList<Integer> primeFactors = new ArrayList<>();

        // Loop from 2 up to n
        for (int i = 2; i <= n; i++) {
            // Check if n is divisible by i
            if (n % i == 0) {
                // If divisible, add i to
                // the primeFactors ArrayList
                primeFactors.add(i);
            }
            // Continue dividing n by i
            // until it's no longer divisible
            while (n % i == 0) {
                n = n / i;
            }
        }
        // Return the ArrayList
        // containing the prime factors of n.
        return primeFactors;
    }

    public static void main(String[] args) {
        int n = 60;
        ArrayList<Integer> ans = getPrimeFactors(n);
        System.out.print("Prime Factors for " + n + ": ");
        for (int factor : ans) {
            System.out.print(factor + " ");
        }
        System.out.println();
    }
}
                                
                            































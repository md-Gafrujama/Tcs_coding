public class gcd {
    public static int findgcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        // Return the non-zero value
        return (a == 0) ? b : a;
    }

    public static void main(String[] args) {
        int n1 = 20, n2 = 15;

        // Find the GCD of n1 and n2
        int gcd = findgcd(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
    }
}

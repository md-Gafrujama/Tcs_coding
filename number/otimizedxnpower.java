public class otimizedxnpower {
    public static int power(int x, int n) {
        // Base case
        if (n == 0)
            return 1;
        
        int halfPower = power(x, n / 2);
        int result = halfPower * halfPower;
        
        // If n is odd, multiply result by x
        if (n % 2 != 0) {
            result *= x;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(power(x, n)); 
    }
}

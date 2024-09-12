import java.util.Scanner;

public class toc {
    public static boolean isprime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) { 
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(isprime(n));
        sc.close();
    }
}

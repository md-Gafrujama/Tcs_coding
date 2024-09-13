import java.util.Scanner;

class fractionAddition {
    // Function to find the GCD (Greatest Common Divisor)
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    public static void addFractions(int num1, int den1, int num2, int den2) {
        int numerator = num1 * den2 + num2 * den1;
        int denominator = den1 * den2;
        int gcdValue = gcd(numerator, denominator);
        numerator /= gcdValue;
        denominator /= gcdValue;
        System.out.println("Sum of fractions: " + numerator + "/" + denominator);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator of first fraction: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter denominator of first fraction: ");
        int den1 = scanner.nextInt();
        System.out.print("Enter numerator of second fraction: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter denominator of second fraction: ");
        int den2 = scanner.nextInt();
        addFractions(num1, den1, num2, den2);

        scanner.close();
    }
}

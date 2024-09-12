import java.util.Scanner;

public class StrongNumber {
    
    // Function to calculate factorial of a digit
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    
    // Function to check if a number is a Strong Number
    public static boolean isStrongNumber(int number) {
        int sum = 0, originalNumber = number;
        
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isStrongNumber(number)) {
            System.out.println(number + " is a Strong Number.");
        } else {
            System.out.println(number + " is not a Strong Number.");
        }
        
        scanner.close();
    }
}
// strong number is factoreial of 
//Explanation: 1! + 4! + 5! = 145. Hence 145 is a strong number. 
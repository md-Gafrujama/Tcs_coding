import java.util.*;

public class leapyear {

    public static boolean isLeapYear(int n) {
        if (n % 400 == 0) {
            return true;
        } else if (n % 100 == 0) {
            return false;
        } else if (n % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int n = sc.nextInt();

        if (isLeapYear(n)) {
            System.out.println(n + " is a leap year.");
        } else {
            System.out.println(n + " is not a leap year.");
        }
    }
}

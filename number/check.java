public class check {
    public static boolean isPalindrome(int n) {
        int reverse = 0;

        while (n != 0) {
            reverse = (reverse * 10) + (n % 10);  // Reverses the digits of the number
            n/=10;
        }
        return (reverse == n);  
    }
    public static void findPalindromesInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
        //System.out.println();  
    }

    public static void main(String[] args) {
        int start = 100;
        int end = 200;

        findPalindromesInRange(start, end);  
    }
}

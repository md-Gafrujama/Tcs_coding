public class check {
    public static boolean isPalindrome(int n) {
        int reverse = 0;
        int temp = n;

        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);  // Reverses the digits of the number
            temp = temp / 10;
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

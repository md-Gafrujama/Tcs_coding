public class checkpa {
    public static boolean isPalindrome(int n) {
        int reverse = 0;
        int temp = n;
        
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);  // Corrected the reverse logic
            temp = temp / 10;
        }
        return (reverse == n);
    }

    public static void main(String[] args) {
        int n = 121;
        
        if (isPalindrome(n)) {  // Corrected method call
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

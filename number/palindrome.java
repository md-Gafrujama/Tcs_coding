
public class palindrome{
    
    public static boolean checkPalindrome(int n)
    {
        int reverse = 0;
        
        int temp = n;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        
        return (reverse == n);
    }

    // Main method (equivalent of Driver code)
    public static void main(String[] args)
    {
        // Sample Input
        int n = 12321;
        if (checkPalindrome(n)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
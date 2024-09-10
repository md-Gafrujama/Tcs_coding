
public class odd {
    public static boolean isNumberEven(int n) {
        return n % 2 == 0;
    }
    public static void main(String[] args) {
        int n = 28;
        if (isNumberEven(n)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

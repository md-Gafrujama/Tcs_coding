public class lcm {
    public static void main(String args[]) {
      int a = 4, b = 8;
      int gcd = 1;
      for (int i = 1; i <= Math.min(a, b); i++) {
        if (a % i == 0 && b % i == 0) {
          gcd = i;
        }
      }
      int lcm = (a * b) / gcd;
      System.out.print("The LCM of the two given numbers is "+lcm);
  
    }
  }
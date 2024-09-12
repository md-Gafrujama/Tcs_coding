public class permutation {
    static int fact(int n) {
      int ans = 1;
      for (int i = 1; i <= n; i++) {
        ans *= i;
      }
      return ans;
    }
    public static void main(String args[]) {
      int n = 6, r = 4;
      int num = fact(n);
      int den = fact(n - r);
      System.out.print(num / den);
    }
  }
  
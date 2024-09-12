public class sumofrange {
    public static void main(String args[]) {
      int l = 2, r = 7;
      int sum = 0;
      for (int i = l; i <= r; i++) {
        sum += i;
      }
      System.out.print("The sum of the numbers in the given range is "+sum);
    }
  }
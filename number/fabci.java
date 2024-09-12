public class fabci {
    public static void main(String args[]) {
      int n = 5;
      if (n == 0) {
        System.out.println(0);
      } else {
        int fib[] = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
          fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.println("The Fibonacci Series up to "+n+"th term:");
        for (int i = 0; i <= n; i++) {
          System.out.print(fib[i] + " ");
        }
      }
    }
  }
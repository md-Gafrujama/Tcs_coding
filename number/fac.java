import java.util.*;
public class fac {
     static void Divisor(int n)
        {
            for (int i=1;i<=n;i++)
                if (n%i==0)
                    System.out.print(i+" ");
        }
        public static void main(String args[])
        {   int n = 16;
            System.out.println("factors are :"+n);
            Divisor(n);
        }
}
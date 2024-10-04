import java.util.Scanner;

public class spped {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int l1,l2,d,s,t;
        // s=d/t
        //t=d/s
        System.out.println("enetr the l1");
        l1=sc.nextInt();
        System.out.println("enter the l2");
        l2=sc.nextInt();
        System.err.println("enetr the speed ");
        s=sc.nextInt();
        d=l1+l2;
        s=s*5/18;// convert speed in to m/s
        t=(d/s);
        System.out.println(t);

        
        

    }
    
}

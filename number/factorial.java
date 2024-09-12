public class factorial {
    public static int Innerfactorial(int n) {
        if(n==0){
            return 1;
        }
        int fm1=Innerfactorial (n-1);
        int fn=n*fm1;
      return fn;
    
        
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(Innerfactorial( n));

    }
    
}

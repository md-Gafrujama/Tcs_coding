public class maxmin {
    public static void maxminuu(int n){
        int d;
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        while(n!=0){
            d=n%10;
            mini=Math.min(mini, d);
            maxi=Math.max(maxi,d);
            n/=10;
        }
        System.out.println("the mini value is:"+mini);
         System.out.println("the maxi value is:"+maxi);
    }
    public static void main(String[] args) {
        int n=2798;
        maxminuu(n);
    }
    
}
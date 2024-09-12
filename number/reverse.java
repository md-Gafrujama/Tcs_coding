public class reverse {

    public static int isrevrese(int n){
        int reverse=0;
        while(n!=0){
            reverse=reverse*10+n%10;
            n/=10;

        }
         return reverse;
        
    }
    public static void main(String[] args) {
        int n=145;
        System.err.println(isrevrese(n));
    }
}

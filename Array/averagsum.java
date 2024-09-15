package Array;

public class averagsum {
    public static void main(String[] args) {
        int array[]={3,5,7,8,5,8};
        int n=6;
        double sum=0;
        for(int i=0;i<array.length;i++){
            sum+=(double)array[i];
        }
        double average =sum/n;
        System.out.println("The average of sum array is:"+average);
    }
    
}

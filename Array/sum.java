package Array;


import java.util.Scanner;


public class sum {

    // Function to calculate the sum of the array
    public static int calculateSum(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = calculateSum(arr, n);
        System.out.println("Sum of the array is: " + sum);
        
        sc.close();
    }
}

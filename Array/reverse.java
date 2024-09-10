package Array;

import java.util.Scanner;

public class reverse {
    public void reverseArray(int[] arr, int N) {
        int start = 0;
        int end = N - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Main method - driver code
    public static void main(String[] args) {
        reverse solution = new reverse(); 
        
        // Predefined test case 1
        System.out.println("Running predefined test case 1:");
        int[] arr1 = {5, 4, 3, 2, 1};
        solution.reverseArray(arr1, arr1.length);
        System.out.println("Reversed array: ");
        for (int num : arr1) {
            System.out.print(num + " ");  // Output: 1 2 3 4 5
        }
        System.out.println("\n");
        
        // Predefined test case 2
        System.out.println("Running predefined test case 2:");
        int[] arr2 = {10, 20, 30, 40};
        solution.reverseArray(arr2, arr2.length);
        System.out.println("Reversed array: ");
        for (int num : arr2) {
            System.out.print(num + " ");  // Output: 40 30 20 10
        }
        System.out.println("\n");

        // Custom test case
        Scanner scanner = new Scanner(System.in);
        System.out.println("Now you can test with custom input:");
        
        System.out.print("Enter the number of elements in the array: ");
        int N = scanner.nextInt();
        
        
        int[] arrUser = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            arrUser[i] = scanner.nextInt();
        }
        solution.reverseArray(arrUser, N);
        System.out.println("Reversed array: ");
        for (int num : arrUser) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}

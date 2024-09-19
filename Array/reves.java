package Array;
import java.util.Scanner;

public class reves {
    // Function to print the array
    static void printArray(int arr[], int n) {
        System.out.print("Reversed array is: \n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to reverse the array
    static void reverseArray(int arr[], int n) {
        int p1 = 0, p2 = n - 1;
        while (p1 < p2) {
            int tmp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = tmp;
            p1++;
            p2--;
        }
        printArray(arr, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Creating the array and taking input for each element
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calling the reverse function
        reverseArray(arr, n);

        sc.close();
    }
}

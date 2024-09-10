package Array;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        if (size < 2) {
            System.out.println("Array doesn't have enough elements.");
            return;
        }
        int[] arrUser = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arrUser[i] = scanner.nextInt();
        }
        printSecondSmallest(arrUser);
        scanner.close();
    }
    public static void printSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No second smallest element.");
        } else {
            System.out.println("Second smallest: " + secondSmallest);
        }
    }
}

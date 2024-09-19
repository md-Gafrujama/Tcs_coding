package Array;
import java.util.Scanner;
public class rotate {
  public static void Reverse(int[] arr, int start, int end) {
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
  public static void Rotateeletoright(int[] arr, int n, int k) {
    k = k % n; 
    Reverse(arr, 0, n - k - 1);
    Reverse(arr, n - k, n - 1);
    Reverse(arr, 0, n - 1);
  }
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter the number of positions to rotate the array to the right: ");
    int k = sc.nextInt();
    Rotateeletoright(arr, n, k);
    System.out.print("After rotating the array " + k + " times to the right: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}

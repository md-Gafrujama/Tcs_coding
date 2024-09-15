package Array;
import java.io.*;
import java.util.Arrays;

public class GET {

    static private void getMedian(int arr[], int n) {
        // Sort the array
     Arrays.sort(arr);

        // Calculate the median
        if (n % 2 != 0) {
            // If odd, return the middle element
            System.out.println("Median is: " + arr[n / 2]);
        } else {
            double median = (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
            System.out.println("Median is: " + median);
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int n = arr.length;
        getMedian(arr, n);
    }
}

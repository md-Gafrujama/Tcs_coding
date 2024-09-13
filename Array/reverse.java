package Array;

public class reverse {
    // Function to reverse an array
    public void reverseArray(int[] arr, int N) {
        int start = 0;          // Starting index
        int end = N - 1;        // Ending index
        while (start < end) {
            int temp = arr[start];   // Temporary variable to hold the current start element
            arr[start] = arr[end];   // Assign end element to start position
            arr[end] = temp;         // Assign stored start element to end position
            start++;                 // Move start pointer towards the center
            end--;                   // Move end pointer towards the center
        }
    }
    public static void main(String[] args) {
        reverse solution = new reverse(); 
        int[] arr1 = {5, 4, 3, 2, 1};  
        solution.reverseArray(arr1, arr1.length);  
        System.out.println("Reversed array: ");
        for (int num : arr1) { 
            System.out.print(num + " "); 
        }
        System.out.println("\n");
    }
}

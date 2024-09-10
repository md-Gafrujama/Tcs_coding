package Array;

public class Solution {

    public int print2smallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
    
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } 
        
            else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        
        return (secondSmallest == Integer.MAX_VALUE) ? -1 : secondSmallest;
    }

    // Main method - driver code
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        System.out.println("Second smallest: " + solution.print2smallest(arr1));  // Output: 10

        // Example 2
        int[] arr2 = {10, 10, 10};
        System.out.println("Second smallest: " + solution.print2smallest(arr2));  // Output: -1
        
        // Example 3
        int[] arr3 = {5, 7, 5, 3, 9, 3};
        System.out.println("Second smallest: " + solution.print2smallest(arr3));  // Output: 5
    }
}

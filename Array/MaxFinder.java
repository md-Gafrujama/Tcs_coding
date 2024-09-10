package Array;

public class MaxFinder {

    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int maxm = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxm) {
                maxm = array[i];
            }
        }
        return maxm;
    }

    public static void main(String[] args) {
        int[] a = {10, 30, 40, 80,0};
        int maxElement = findMax(a);
        System.out.println("The maximum element in the array is: " + maxElement);
    }
}

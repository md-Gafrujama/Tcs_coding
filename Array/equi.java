package Array;
import java.util.Scanner;
class equi {
  public static int findEquilibriumIdx(int nums[], int n) {
    int totalSum = 0;
    for (int i = 0; i < n; i++) {
      totalSum += nums[i];
    }
    int leftSum = 0, rightSum = totalSum;
    for (int i = 0; i < n; i++) {
      rightSum -= nums[i];  
      if (leftSum == rightSum) {
        return i; 
      }

      leftSum += nums[i];  
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int nums[] = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    int equilibriumIdx = findEquilibriumIdx(nums, n);
    if (equilibriumIdx != -1) {
      System.out.println("Equilibrium index is: " + equilibriumIdx);
    } else {
      System.out.println("No equilibrium index found.");
    }
  }
}

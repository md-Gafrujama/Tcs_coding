import java.util.*;  // Import necessary utilities
import java.io.*;

public class sumof {  // Class names should start with uppercase

    
    public static float sum(float a, float n, float d) {
        return (n / 2.0f) * (2.0f * a + (n - 1.0f) * d);
    }

    public static void main(String[] args) {
        // Call the sum method and print the result
        float result = sum(2, 10, 2);  // Using 10 instead of 010 (octal)
        System.out.println("Sum of the arithmetic progression: " + result);
    }
}

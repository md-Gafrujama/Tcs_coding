import java.util.*;
import java.util.*;
import java.util.Scanner;
import java.math.*;
public class threeNumbergrater {
    public static double grtaerthree(double a, double b, double c){
        return Math.max(a,Math.max(b, c));
    }
    public static void main(String[] args) {
        double a=132.66;
        double b=13.66;
        double c=32.66;
        System.out.println("In three number is print the below:"+grtaerthree(a, b, c));
    }
}

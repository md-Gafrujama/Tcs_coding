import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.lang.*;
import java.math.*;
public class grtestoftwonumber {
    public static double gtaterofnum(double num1, double num2){
        return Math.max(num1,num2);

    }
    public static void main(String[] args) {
        double num1=123.45;
        double num2=3434.7;

        System.out.println("The gratest of number is:"+gtaterofnum(num1,num2));
    }
    
}

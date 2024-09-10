import java.util.*;
import java.io.*;
import java.util.Scanner;
public class rangeprime{
  public static  boolean isprime(int n){
    if(n<2){
      return false;
    }
    for(int i=2;i*i<=n;i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
}
public static void PrintPrimesbwrange(int a,int b){
  for(int i=a;i<=b;i++){
    if(isprime(i)){
      System.out.println(i+" ");
    }
    
  }
}
public static void main (String args[]){
//Scanner sc=new Scanner(System.in);
  //int a=sc.nextInt();
  //int b=sc.nextInt();
  //System.out.println();
  int a=10;
  int b=80;
  PrintPrimesbwrange(a,b);

}
}
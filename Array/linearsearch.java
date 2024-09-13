package Array;
import java.util.*;
import java.io.*;
// Finding the linear search using java ..
public class linearsearch {
    public static int search(int num[], int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={2,4,7,9,10,77,8,};
        int key=4;
        int index=search(num, key);
        if(index==-1){
            System.out.println("key is not found");
        }else{
            System.err.println(" key is found at:"+index);
        }
    }
}

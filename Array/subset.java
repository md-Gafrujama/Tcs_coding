package Array;

public class subset {

    public static boolean issubset(int arr1[], int arr2[]){
        for(int i=0; i<arr1.length;i++){
            boolean found =false;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    found =true;
                    break;

                }

            }
            if(!found){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 4, 5};
     if(issubset(arr1, arr2)){
        System.out.println("arr1 is a subset of arr2");
     }
     else{
        System.out.println("not subset of an arry");
     }
    }
    
}

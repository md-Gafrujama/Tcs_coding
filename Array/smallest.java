 package Array;

class smallest {
public static  void main (String args[]){
    int a[]={10,20,39,0,59};
    int minm=a[0];
    for(int i=0;i<a.length;i++){
        if(a[i]<minm){
            minm=a[i];

        }
    }
    System.out.println("smallest number:"+minm);
}
    
}
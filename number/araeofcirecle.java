class areaOfCircle121 {

    public static void areaOfCircle(int n) {
  
      double ans = 3.14 * n * n; // Area of circle = πr2
      System.out.print("Area of circle is : " + ans);
  
    }
    public static void main(String args[]) {
      int n = 5;
      areaOfCircle(n);
    }
  }
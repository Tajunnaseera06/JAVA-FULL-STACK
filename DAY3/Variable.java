 public class Variable {
     public static void main(String[] args) {
        int a=20,b=30;
        System.out.println(a +" " +b);
        //with third variable
        // int temp = a;
        // a=b;
        // b=temp;
        // System.out.println(a+" "+b);
    //without third variable
      a=a+b;
      b=a-b;
      a=a-b;
   System.out.println(a+" "+b);
    }
}
//swappping the variable
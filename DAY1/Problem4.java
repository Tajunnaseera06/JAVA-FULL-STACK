 import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
         if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) 
             {
            System.out.println(" Leap Year");
        } else {
            System.out.println("not a Leap Year");
        }
    }
    
}
// leap year or not
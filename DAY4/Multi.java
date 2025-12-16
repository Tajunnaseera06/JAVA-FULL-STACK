 import java.util.Scanner;
public class Multi {
   public static void main(String[] args) {
    int [][]a={
        {1,2,3},
         {4,5,6},
        {7,8,9}
     };
     int rowLen = a.length;
     int colLen = a[0].length;
      
     int n=5;
     int row = 3,col=2; 
       Scanner sc = new Scanner(System.in);
     for (int i=0;i<a.length;i++)
         {
             for (int j=0;j<a[i].length;j++)
             {
                System.out.print(a[i][j]+" ");
             }
        System.out.println();
     }
    

   }
}
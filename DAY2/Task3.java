public class Task3 {
     
    public static void main(String args[]) 
    {
        int  n=1253;
        int count=0;

          for(int i=n;i>0;i=i/10)
        {
            count++;
        } 
        System.out.println(count);
    }
} 
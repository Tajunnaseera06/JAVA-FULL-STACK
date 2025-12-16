 public class Frequency {
    public static void main(String[] args) {
        int a[] = { 1, 2, 5, 3, 3, 6, 2, 5, 5, 7, 7 };
  
       int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max){
                max=a[i];
            }
        }
        int dp[]= new int[max+1];
        for(int i=0;i<a.length;i++)
        {
            dp[a[i]]++;
        }
        for(int i=0;i<dp.length;i++)
        {
            if(dp[i]>0){
                System.out.println(i+" "+dp[i]);
            }
        }
    }
}
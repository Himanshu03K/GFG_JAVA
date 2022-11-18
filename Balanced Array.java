import java.io.*;
import java.util.*;

class Solution
{
    long minValueToBalance(long a[] ,int n)
    {
        int i=0,j=n-1;
        long sum1=0,sum2=0;
        while(i<j){
            sum1+=a[i++];
            sum2+=a[j--];
        }
        return Math.abs(sum1-sum2);
    }
}

class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            int n=Integer.parseInt(br.readLine());

            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[]=new long[n];
            for(int  i=0;i<n;i++)
            {
                a[i]=Long.parseLong(a1[i]);
            }
            Solution ob=new Solution();
            
            long ans=ob.minValueToBalance(a,n);
            System.out.println(ans);
        }
    }
}

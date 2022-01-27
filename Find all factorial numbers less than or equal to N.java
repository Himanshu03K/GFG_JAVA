import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            long N=sc.nextLong();
			
            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for(long num : ans){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}


class Solution{
    static long fact(long n){
        if(n==0 || n==1)
        return 1;
        
        return n*fact(n-1);
    }
    static ArrayList<Long> factorialNumbers(long N){
        // code here
        ArrayList<Long> ans= new ArrayList<Long>();
        for(long i=1;i<=N;i++){
            if(fact(i)<=N)
            ans.add(fact(i));
            else
            break;
        }
        return ans;
    }
}

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
            long ans  = ob.jumpyBall(N);
            System.out.println(ans);
        }
    }
}


class Solution{
    static long jumpyBall(long N){
        // code here
        long sum=N*2;;
        while(N>0){
            N=N/2;
            sum+=N*2;
        }
        return sum;
    }
}

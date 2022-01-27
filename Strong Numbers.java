import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.is_StrongNumber(n);
            System.out.println(ans);
        }
    }
}


class Solution
{
    static int fact(int x){
        if(x==0 || x==1)
        return 1;
        
        return x*fact(x-1);
    }
    public int is_StrongNumber(int n)
    {
        // Code here
        int x=n,sum=0;
        while(n>0){
            sum+=fact(n%10);
            n/=10;
        }
        if(x==sum)
        return 1;
        return 0;
    }
}

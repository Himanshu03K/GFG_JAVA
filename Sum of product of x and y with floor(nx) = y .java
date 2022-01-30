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
            long ans = ob.sumofproduct(n);
            System.out.println(ans);
        }
    }
}


class Solution
{
    public long sumofproduct(int n)
    {
        // code here
        int p=0;;
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=n;j++)
            {
                if((n/i)==j)
                p+=(i*j);
            }
        }
        return p;
    }
}

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.onesComplement(N));
        }
    }
}


class Solution{
    static int onesComplement(int N){
        //code here
        int n=N,i=0;
        int ans=0;
        while(N>0){
            ans += (1<<i); 
            i++;
            N=N>>1;
        }
        return ans^n;
    }
}

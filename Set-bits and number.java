//Initial Template for Java

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
            System.out.println(ob.bitMultiply(N));
        }
    }
}


class Solution{
    static int bitMultiply(int N){
        
        int x=N,c=0;
        while(x>0){
            if((x&1)==1)
            c++;
            x=x>>1;
        }
        return N*c;
    }
}

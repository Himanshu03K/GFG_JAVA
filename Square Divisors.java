import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            long N = Long.parseLong(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.squareFactor(N));
        }
    }
}

class Solution{
    static int squareFactor(long N){
        // code here
        int c=0;
       for(int i=1;i<=Math.sqrt(N);i++){
           if(N%(i*i)==0){
               c++;
           }
       }
        return c;
        
    }
}

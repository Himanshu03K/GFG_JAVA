
import java.io.*;
import java.util.*;

class Solution{
    static int orGate(int arr[] , int N){
       //code here
       int ans = arr[0];
       for(int i=0;i<N;i++){
           ans |=arr[i];
       }
       return ans;
    }
}


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String S[] = read.readLine().trim().split(" ");
            int arr[] = new int[N];
            for(int i =0;i<N;i++)
            {
                arr[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            System.out.println(ob.orGate(arr,N));
        }
    }
}  

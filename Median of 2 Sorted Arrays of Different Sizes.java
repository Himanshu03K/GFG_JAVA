//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
       
        int[] res = new int[n + m];  //resultant array of size first array and second array  
        System.arraycopy(a, 0, res, 0, n);  
        System.arraycopy(b, 0, res,n, m); 
        Arrays.sort(res);
        
        if((m+n)%2!=0){
            return res[(m+n)/2];
        }
        else
        {
            int mid =(m+n)/2;
            double c= res[mid];
            double c1=res[mid-1];
            double x =(c+c1)/2;
            return x;
        }
    }
}

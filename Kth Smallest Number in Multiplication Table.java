import java.io.*;
import java.util.*;


class Array {
	public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int k = sc.nextInt();
            Solution ob = new Solution();
            
            System.out.println(ob.KthSmallest(m,n, k));
        }
        
	}
}

class Solution {
    public int KthSmallest(int m, int n, int k) {
        int low=1,high=m*n;
        while(low<high){
            int mid=(low+high)/2;
            if(smaller(mid,m,n,k))
                high=mid;
            else
                low=mid+1;
        }
        return low;
    }
    
    public boolean smaller(int num,int m,int n,int k){
        int count=0;
        for(int i=1;i<=m;i++)
            count+=Math.min(num/i,n);
        return count>=k;
    }
}

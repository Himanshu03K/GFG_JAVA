import java.io.*;
import java.util.*;

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int c=0,on=0;
        for(int i=0;i<n;i++){
            if(a[i]==0)
            c++;
            else if(a[i]==1)
            on++;
        }
        for(int i=0;i<n;i++){
            if(i<c)
            a[i]=0;
            else if(i<(c+on))
            a[i]=1;
            else
            a[i]=2;
        }              
     }
}


class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

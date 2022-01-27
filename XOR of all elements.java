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
            
            int N = sc.nextInt();
            ArrayList<Integer> A = new ArrayList<>();
            for(int i=0;i<N;i++){
                A.add(sc.nextInt());
            }

            Solution ob = new Solution();
            ArrayList<Integer> B = ob.getXor(A,N);
            for(int i=0;i<N;i++){
                System.out.print(B.get(i)+" ");
            }
            System.out.println();
        }
    }
}


class Solution{
    static ArrayList<Integer> getXor(ArrayList<Integer> A,int N){
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int x=0;
        for(int i=0;i<N;i++){
                x=x^A.get(i);
            }
        for(int i=0;i<N;i++){
            
            ans.add(x^A.get(i));
        }
        return ans;
    }
}

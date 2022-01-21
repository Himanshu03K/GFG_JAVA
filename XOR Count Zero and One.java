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
            int ans = ob.find_xor(n);
            System.out.println(ans);
        }
    }
}



class Solution
{
    public int find_xor(int n)
    {
        // Code here
        int x=0,y=0;
        while(n>0){
            if((n&1) ==1)
            x++;
            else
            y++;
            n=n>>1;
        }
        return x^y;
    }
}

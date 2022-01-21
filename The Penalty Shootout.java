import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String s = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.penaltyScore(s));
                }
        }
}

class Solution
{
    public int penaltyScore(String S)
    {
        // Your code goes here
        int c=0;
        for(int i=1;i<S.length();i++){
            char ch = S.charAt(i-1);
            char ch1 = S.charAt(i);
            if(ch1=='1'&& ch=='2')
            c++;
        }
        return c;
    }
}

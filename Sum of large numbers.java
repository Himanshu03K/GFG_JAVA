import java.util.*;
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
            String s1 = br.readLine().trim();
            String s2 = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.add(s1, s2);
            System.out.println(ans);
        }
    }
}

class Solution
{
    public String add(String s1, String s2)
    {
        // code here
        int n1=s1.length()-1;
        int n2=s2.length()-1;
        int carry=0;
        StringBuffer str=new StringBuffer();
        while(n1>=0 || n2>=0){
            int sum=carry;
            if(n1>=0)
            sum+=s1.charAt(n1--)-'0';
            if(n2>=0)
            sum+=s2.charAt(n2--)-'0';
            
            str.append(sum%10);
            carry=sum/10;
        }
        if(carry>0)
        str.append(carry);
        
        return str.reverse().toString();
    }
}

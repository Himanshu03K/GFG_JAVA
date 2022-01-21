import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeDups(s);
            
            System.out.println(result);
        }
    }
}

class Solution {
    String removeDups(String S) {
        // code here
        LinkedHashSet<Character>hs = new LinkedHashSet<>();
        for(int i =0 ; i<S.length(); i++)
            hs.add(S.charAt(i));

        StringBuilder ans =new StringBuilder();

        for(Character x : hs)
            ans.append(x);

        return ans.toString();
    }
}

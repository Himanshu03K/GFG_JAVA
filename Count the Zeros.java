import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().countZeroes(arr, n);
            System.out.println(ans);
        }
    }
}

class Solution {
    int countZeroes(int[] arr, int n) {
        // code here
        int i=0,c=0;
        n=n-1;
        while(i<=n){
            if(i==n){
                if(arr[i++]==0)
                c++;
                break;
            }
            if(arr[i++]==0)
            c++;
            if(arr[n--]==0)
            c++;
        }
        return c;
    }

}


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            

            Solution ob = new Solution();
            
            System.out.println(ob.minxorpair(N,arr));
            
            
        }
    }
}

class Solution{

    static int minxorpair(int N, int arr[]){
        // code here
        
        if(N==1)
        return 1;
        else if(N==2)
        return arr[0]^arr[1];
        else{
            int minXOR=arr[0]^arr[1];
            Arrays.sort(arr);
            for (int i=1; i < N; i++)
                minXOR = Math.min(arr[i-1] ^ arr[i] , minXOR);
            return minXOR;
        
         }
    }
}

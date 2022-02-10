
class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		int c=0;
        for(int i=1; i<=x; i++)
        {
            if(i*i==x)
            {
                c=i;
                break;
            }
            else if( i*i>x)
            {
                c=i-1;
                break;
            }
        }
        return c;
	 }
}

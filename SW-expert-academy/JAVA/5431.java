import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n, m;
			n = sc.nextInt();
			m = sc.nextInt();
	        boolean arr[] = new boolean[101];
	 
	        for (int i = 0;i < m;i++)
	        {
	            int a;
	            a = sc.nextInt();
	            arr[a] = true;
	        }
	        System.out.print("#" + test_case + " ");
	       
	        for (int i = 1;i <= n;i++)
	            if (!arr[i])
	                System.out.print(i + " ");
	        System.out.println();
		}
	}
}

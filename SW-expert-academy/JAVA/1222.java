import java.util.Scanner;

public class Solution{
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int n = sc.nextInt();
			String s = sc.next();
			int ans = 0;
			for(int i=0;i<=n/2;i++) {
				ans += s.charAt(2*i) - '0';
			}
			System.out.println("#" + test_case + " " + ans);
		}
	}
}

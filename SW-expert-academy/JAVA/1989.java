import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String text = sc.next();
			int ans = 1;
			for(int i=0;i<=text.length()/2;i++) {
				if(text.charAt(i) != text.charAt((text.length()-(1+i)))) {
					ans = 0;
					break;
				}
			}
			System.out.println("#"+test_case+" " + ans);
		}
	}
}


	

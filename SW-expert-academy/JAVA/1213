import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		int T;

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			T=sc.nextInt();
			
			String query = sc.next();
			String text = sc.next();
			int ans = 0;
			for(int i=0;i<=text.length() - query.length();i++) {
				boolean flag = true;
				for(int j=0;j<query.length();j++) {
					char a = text.charAt(i+j);
					char b = query.charAt(j);
					if(a != b)
						flag = false;						
				}
				if(flag)
					ans++;
			}
			System.out.println("#"+test_case+" " + ans);
		}
	}
}

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
			
			System.out.println("#" + test_case + " " + (text.split(query,-1).length-1));
			/*
			int ans = 0;
			for(int i=0;i<=text.length() - query.length();i++) 
				if(text.substring(i,i+query.length()).equals(query))
					ans++;
			
			System.out.println("#"+test_case+" " + ans);
			*/
		}
	}
}

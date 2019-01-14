package array1;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception	{
		System.setIn(new FileInputStream("res/Solution1289_input.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			String s = sc.next();
			StringBuffer sb = new StringBuffer(s);
			int ans = 0;
			for(int i=0;i<s.length();i++) {
				if(sb.charAt(i) == '0')
					continue;
				ans++;
				for(int j=i;j<s.length();j++) {
					
					if(sb.charAt(j) == '0')
						sb.setCharAt(j, '1');
					else
						sb.setCharAt(j, '0');
				}
				
			}
			
			System.out.println("#"+test_case+" " + ans);
		}
	}
}

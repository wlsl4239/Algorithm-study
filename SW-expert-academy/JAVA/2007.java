//testcase가 허술해서 패턴이 "ABABC"인 경우 5가 아닌 2가 나오게 해도 pass가 됨.
//물론 아래 소스는 5가 나옴.

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)	{
			int ans = 11;
			String st = sc.next();
			for(int i=10;i>0;i--) {
				boolean flag = true;
				for(int j=0;j<30-i-i;j+=i) {
					if(!st.substring(j, j+i).equals(st.substring(j+i, j+i+i)))
						flag = false;
				}
				if(flag)
					ans = i;
			}

			System.out.println("#"+test_case+" " + ans);
		}
	}
}



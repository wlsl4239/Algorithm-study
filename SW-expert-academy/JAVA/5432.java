import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Stack;
public class Solution {


	public static void main(String args[]) throws Exception	{
		System.setIn(new FileInputStream("res/input5432.txt"));

		Scanner sc = new Scanner(System.in);

		int T;		
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int num = 0;
			String str = sc.next();
			int ans = 0;

			for(int i=0;i<str.length()-1;i++) {
				if(str.charAt(i) == '(') {
					if(str.charAt(i+1) == ')') {
						ans += num;
						i++;
					}
					else {
						num++;
						ans++;
					}
				}
				else {
					num--;
				}

			}


			System.out.println("#"+test_case+" "+ans);	
		}
	}	
}

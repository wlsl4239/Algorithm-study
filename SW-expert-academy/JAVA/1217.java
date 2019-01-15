import java.io.FileInputStream;
import java.util.Scanner;
public class Solution {	
	public static int func(int a,int b) {
		if(b==1)
			return a;
		return a*func(a,b-1);
	}
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		int T;		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			T=sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("#" + test_case + " "+ + func(a,b));
		}
	}	
}

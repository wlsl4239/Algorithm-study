import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
	public static int ans;
	public static boolean map[][];
	
	public static boolean empty(boolean[] arr) {
		for(int i=0;i<arr.length;i++)
			if(arr[i])
				return false;
		return true;
	}
	
	public static void dfs(int now) {
		if(now == 99) {
			ans = 1;
			return;
		}
		if(empty(map[now]))
			return;
		
		for(int i=0;i<map[now].length;i++) {
			if(map[now][i])
				dfs(i);
		}
	}
	
	public static void main(String args[]) throws Exception	{		
		Scanner sc = new Scanner(System.in);
		int T;		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			map = new boolean [100][100];
			ans = 0;
			T=sc.nextInt();
			int len = sc.nextInt();
			
			for(int i=0;i<len;i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				map[a][b] = true;
			}
			dfs(0);
			System.out.println("#"+test_case+" "+ans);	
		}
	}	
}

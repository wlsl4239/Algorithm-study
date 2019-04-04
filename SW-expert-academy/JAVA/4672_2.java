import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int test=1;test<=t;test++) {
			int ans = 0;
			int[] cnt = new int [26];
			String s = sc.next();
			for(int i=0;i<s.length();i++)
				cnt[s.charAt(i)-'a'] ++;
			
			for(int i=0;i<26;i++)
				ans+=(cnt[i] * (cnt[i]+1) / 2);
			
			System.out.println("#"+test+" "+ans);
		}		
	}
}


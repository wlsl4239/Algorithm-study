import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int test=1;test<=t;test++) {
			int n = sc.nextInt();
			int[] arr = new int [26];
			
			for(int i=0;i<n;i++) {
				String s = sc.next();
				arr[s.charAt(0)-'A']++;
			}
			int ans = 0;
			for(int i=0;i<26;i++) {
				if(arr[i]==0)
					break;
				ans++;
			}
			System.out.println("#"+test+" "+ans);
		}
		
	}
}

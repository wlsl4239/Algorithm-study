import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int test = 1;test<=t;test++) {
			long n = sc.nextLong();
			int ans = 0;
			while(true) {
				if(n==2) break;
				n = (Math.pow((long)Math.sqrt(n),2) == n) ? (long) Math.sqrt(n) : n+1;
				ans++;
			}
			System.out.println("#"+test + " "+ans);
		}
	}
}

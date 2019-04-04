import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int test=1;test<=t;test++) {
			int ans = 0;
			char[] temp = sc.next().toCharArray();
			Arrays.sort(temp);
			String s = new String(temp);
			
			for(int i=1;i<=s.length();i++) 
				for(int j=0;j<=s.length()-i;j++) {
					if(s.substring(j,j+i).equals(new StringBuilder(s.substring(j,j+i)).reverse().toString()))
						ans++;
				}
			
			System.out.println("#"+test+" "+ans);
		}		
	}
}

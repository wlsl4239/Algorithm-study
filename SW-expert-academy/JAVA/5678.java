import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int test = 1;test<=t;test++) {
			String s = sc.next();
			int ans = 1;
			
			for(int i=s.length();i>1;i--) {
				if(ans!=1)
					break;
				for(int j=0;j<s.length()-i+1;j++) {
					StringBuilder sb = new StringBuilder(s.substring(j, j+i));
	
					if(sb.toString().equals(sb.reverse().toString())) {
						ans = i;
						break;
					}
						
				}
			}
			
			System.out.println("#" + test + " " + ans);
			
		}
	}
}

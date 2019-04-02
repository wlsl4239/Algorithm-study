import java.util.Scanner;

public class Solution {
	
	static long change(long num) {
		StringBuilder temp = new StringBuilder(Long.toString(num));
		
		for(int i=0;i<temp.length();i++) {
			if(temp.charAt(i) == '4') temp.setCharAt(i, '3');
			if(temp.charAt(i) == '5') temp.setCharAt(i, '4');
			if(temp.charAt(i) == '6') temp.setCharAt(i, '5');
			if(temp.charAt(i) == '7') temp.setCharAt(i, '6');
			if(temp.charAt(i) == '8') temp.setCharAt(i, '7');
			if(temp.charAt(i) == '9') temp.setCharAt(i, '8');
		}		
		
		return Long.parseLong(temp.toString());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int test=1;test<=t;test++) {
			
			long a = change(sc.nextLong());
			long b = change(sc.nextLong());
			long tempa = 0;
			long tempb = 0;
			int cnt = 0;
			long ans = (a<0 && b>0) ? -1 : 0;
			
			while(Math.abs(a)>0) {
				tempa+=(a%10) * Math.pow(9, cnt);
				a/=10;
				cnt++;
			}
			cnt = 0;
			while(Math.abs(b)>0) {				
				tempb+=(b%10) * Math.pow(9, cnt);
				b/=10;
				cnt++;
			}
			ans += tempb-tempa;
			System.out.println("#"+test+" "+ans);
		}		
	}	
}

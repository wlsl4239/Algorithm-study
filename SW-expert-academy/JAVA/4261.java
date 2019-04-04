import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for(int test=1;test<=t;test++){
			String s = sc.next();
			int n = sc.nextInt();

			int ans = 0;

			for(int j=0;j<n;j++){
				StringBuilder num = new StringBuilder("");
				String str = sc.next();
				for(int i=0;i<str.length();i++){
					if(str.charAt(i) == 'a' || str.charAt(i) == 'b' || str.charAt(i) == 'c')
						num.append('2');
					if(str.charAt(i) == 'd' || str.charAt(i) == 'e' || str.charAt(i) == 'f')
						num.append('3');
					if(str.charAt(i) == 'g' || str.charAt(i) == 'h' || str.charAt(i) == 'i')
						num.append('4');
					if(str.charAt(i) == 'j' || str.charAt(i) == 'k' || str.charAt(i) == 'l')
						num.append('5');
					if(str.charAt(i) == 'm' || str.charAt(i) == 'n' || str.charAt(i) == 'o')
						num.append('6');
					if(str.charAt(i) == 'p' || str.charAt(i) == 'q' || str.charAt(i) == 'r' || str.charAt(i)=='s')
						num.append('7');
					if(str.charAt(i) == 'v' || str.charAt(i) == 't' || str.charAt(i) == 'u')
						num.append('8');
					if(str.charAt(i) == 'w' || str.charAt(i) == 'x' || str.charAt(i) == 'y' || str.charAt(i) == 'z')
						num.append('9');
				}
				if(s.equals(num.toString()))
					ans++;
			}
			
			System.out.println("#"+test+" "+ans);

		}
	}
}

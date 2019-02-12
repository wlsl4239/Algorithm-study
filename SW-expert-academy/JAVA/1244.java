import java.util.Scanner;

public class Solution{
	static int k,ans;
	static StringBuffer s;

	static void cal(int cnt, int now) {
		if (cnt == k) {
			ans = Math.max(ans, Integer.parseInt(s.toString()));
			return;
		}

		for (int i = now; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				if (i == j)
					continue;

				if (s.charAt(i) <= s.charAt(j)) {
					swap(i,j);
					cal(cnt + 1, i);
					swap(i,j);
				}
			}
		}
	}

	private static void swap(int i,int j) {
		char temp = s.charAt(i);
		s.setCharAt(i, s.charAt(j));
		s.setCharAt(j, temp);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();

		for(int test=1;test<=t;test++) {
			ans = 0;
			s = new StringBuffer(sc.next());
			k = sc.nextInt();
			cal(0, 0);
			System.out.println("#"+test+" "+ans);
		}
	}
}

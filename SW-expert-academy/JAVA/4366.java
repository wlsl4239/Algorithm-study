import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static long[] binary = new long[40];
	static long[] trinary = new long[40];
	static int cnt = 0;

	static long btod(String bnum) {
		long btod = 0;
		cnt = 0;
		for(int i=bnum.length()-1;i>=0;i--) {
			btod += (bnum.charAt(cnt)-'0')*binary[i];
			cnt++;
		}
		return btod;
	}

	static long ttod(String tnum) {
		long ttod = 0;
		cnt=0;
		for(int i=tnum.length()-1;i>=0;i--) {
			ttod += (tnum.charAt(cnt)-'0')*trinary[i];
			cnt++;
		}
		return ttod;
	}

	public static void main(String[] args) {
		binary[0] = 1;
		trinary[0] = 1;
		for(int i=1;i<40;i++) {
			binary[i] = binary[i-1]*2;
			trinary[i] = trinary[i-1]*3;
		}
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int test=1;test<=t;test++) {
			String bnum = sc.next();
			String tnum = sc.next();

			long[] bnums = new long[bnum.length()];
			long[] tnums = new long[tnum.length()*2];

			for(int i=0;i<bnum.length();i++) {
				StringBuilder sb = new StringBuilder(bnum);
				if(bnum.charAt(i)=='1') sb.setCharAt(i, '0');
				else sb.setCharAt(i, '1');
				bnums[i] = btod(sb.toString());
			}
			for(int i=0;i<tnum.length();i++) {
				StringBuilder sb1 = new StringBuilder(tnum);
				StringBuilder sb2 = new StringBuilder(tnum);

				if(tnum.charAt(i)=='0') {
					sb1.setCharAt(i, '1');
					sb2.setCharAt(i, '2');
				}
				else if(tnum.charAt(i)=='1') {
					sb1.setCharAt(i, '0');
					sb2.setCharAt(i, '2');
				}
				else {
					sb1.setCharAt(i, '0');
					sb2.setCharAt(i, '1');
				}
				tnums[2*i] = ttod(sb1.toString());
				tnums[2*i+1] = ttod(sb2.toString());
			}

			long ans = -1;
			for(int i=0;i<bnums.length;i++) {
				if(ans!=-1) break;
				for(int j=0;j<tnums.length;j++) {
					if(bnums[i] == tnums[j]) {
						ans = bnums[i];
						break;
					}
				}
			}
			System.out.println("#"+test+" "+ans);
		}
	}
}

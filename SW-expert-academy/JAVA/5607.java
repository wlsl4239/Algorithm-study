import java.math.BigInteger;
import java.util.Scanner;

public class Solution5607_조합_서울9반_김경수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int test=1;test<=t;test++) {	
			int n = sc.nextInt();
			int r = sc.nextInt();
			int p = 1234567891;
			
			long factorial[] = new long[n+1];
			factorial[0] = 1;
			for(int i=1;i<=n;i++) factorial[i] = (factorial[i-1]*i)%p;
			
			BigInteger P = BigInteger.valueOf(p);
			BigInteger a = BigInteger.valueOf(factorial[n]);
			BigInteger b = BigInteger.valueOf(factorial[n-r]).modPow(BigInteger.valueOf(p-2), P);
			BigInteger c = BigInteger.valueOf(factorial[r]).modPow(BigInteger.valueOf(p-2), P);
			BigInteger ans = a.multiply(b).multiply(c).mod(P);
			
			System.out.println("#" + test + " " + ans);
		}

	}
}

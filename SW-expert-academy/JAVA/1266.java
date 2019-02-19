import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		int[] Prime = {2,3,5,7,11,13,17};
		int[] notPrime = {0,1,4,6,8,9,10,12,14,15,16,18};
		int[] Comb18 = {1,18,153,816,3060,8568,18564,31824,43758,48620,43758,31824,18564,8568,3060,816,153,18,1};
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int test = 1;test<=t;test++) {
			int skillOfMasterA = sc.nextInt();
			int skillOfMasterB = sc.nextInt();
			
			double a = 0;
			double b = 0;
			
			for(int i=0;i<notPrime.length;i++) {
				a += Comb18[notPrime[i]] * Math.pow((double)skillOfMasterA/100, notPrime[i]) * Math.pow((100-(double)skillOfMasterA)/100, 18-notPrime[i]); 
				b += Comb18[notPrime[i]] * Math.pow((double)skillOfMasterB/100, notPrime[i]) * Math.pow((100-(double)skillOfMasterB)/100, 18-notPrime[i]);
			}
			double ans = 1-a*b;
			System.out.format("#%d %.6f\n",test,ans);
		}
	}
}

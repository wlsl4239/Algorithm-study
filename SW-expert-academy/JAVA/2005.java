import java.util.Scanner;

public class Solution {
		
		public static int bino(int n,int k) {
			if(k==0|| k==n)return 1;
			return bino(n-1,k-1)+bino(n-1,k);
		}

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int test=1;test<=t;test++) {
			int n = sc.nextInt();
			
			System.out.println("#"+test);
			for(int i=0;i<n;i++) {
				for(int j=0;j<=i;j++){
					System.out.print(bino(i,j)+" ");
				}
				System.out.println();
			}
		}
	}
}

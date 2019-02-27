import java.util.Scanner;

public class Solution{
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int test=1;test<=t;test++) {
			int n = sc.nextInt();
			int ans = 0;
			int[] corri = new int[400];
			for(int i=0;i<n;i++) {
				
				int a = sc.nextInt();
				int b = sc.nextInt();
				if(a%2==1) a++;
				if(b%2==1) b++;
				if(a>b) {
					int temp=a;
					a=b;
					b=temp;
				}
				for(int j=a/2;j<=b/2;j++) 
					corri[j]++;
			}
			
			for(int i=0;i<corri.length;i++)
				ans = Math.max(ans,corri[i]);
			
			System.out.println("#"+test+" "+ans);
			
		}
	}
}

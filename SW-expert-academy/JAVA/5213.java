import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		long [] arr=new long[1000001];
		long [] arr2=new long[1000001];
		
		for(int i=1;i<1000001;i+=2) 
			for(int j=i;j<1000001;j+=i)
				arr[j] += i;
		arr2[0] = arr[0];
		
		for(int i=1;i<1000001;i++)
			arr2[i] = arr2[i-1]+arr[i];
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int test=1;test<=t;test++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			long ans = arr2[r]-arr2[l-1];
			
			System.out.println("#"+test+" "+ans);
		}
	}
}

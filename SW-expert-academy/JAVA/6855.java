import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int test = 1;test<=t;test++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int ans = 0;
			
			int[] arr=new int[n];
			int[] arr2=new int[n-1];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			for(int i=1;i<n;i++) {
				arr2[i-1] = arr[i]-arr[i-1];
			}
			Arrays.sort(arr2);
			
			for(int i=0;i<n-k;i++) {
				ans+=arr2[i];
			}
			
			System.out.println("#" + test + " " + ans);
		}
		
	}
}

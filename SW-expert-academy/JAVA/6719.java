import java.util.Arrays;
import java.util.Scanner;

public class Solution{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for(int test = 1;test<=t;test++) {
			int n = sc.nextInt();
			int k = sc.nextInt(); 
			int arr[] = new int [n];
			double ans = 0;
			
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			
			Arrays.sort(arr);
			
			for(int i=arr.length-k;i<arr.length;i++) {
				ans += arr[i];
				ans/=2;
			}
			System.out.println("#" + test + " " + ans);
		}
	}
}

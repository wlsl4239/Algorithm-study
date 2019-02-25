import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int test=1;test<=t;test++) {
			int n = sc.nextInt();
			int q = sc.nextInt();
			int[][]arr = new int [n+1][4];
			for(int i=1;i<=n;i++) {
				int a = sc.nextInt();
				arr[i][1] = arr[i-1][1];
				arr[i][2] = arr[i-1][2];
				arr[i][3] = arr[i-1][3];
				arr[i][a]++;
				
			}
			
			System.out.println("#"+test);
			for(int i=0;i<q;i++) {
				int s = sc.nextInt();
				int e = sc.nextInt();
				System.out.println((arr[e][1]-arr[s-1][1])+" "+(arr[e][2]-arr[s-1][2])+" "+(arr[e][3]-arr[s-1][3])+" ");
			}
		}
	}
}

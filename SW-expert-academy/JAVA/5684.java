//가장 짧은 사이클 길이 찾기.

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int test = 1;test<=t;test++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int ans = Integer.MAX_VALUE;
			int [][] arr = new int [n+1][n+1];
			
			for(int i=0;i<m;i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				arr[a][b] = c;
			}
			
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(arr[i][j] == 0)
						continue;
					
					for(int k=1;k<=n;k++) {
						if(arr[j][k] == 0)
							continue;
						if(arr[i][k] == 0) {
							arr[i][k] = arr[i][j]+arr[j][k];
						}
						else {
							arr[i][k] = Math.min(arr[i][k], arr[i][j]+arr[j][k]);
						}
					}
					
				}
			}
			
			
			for(int i=1;i<=n;i++)
				ans = (arr[i][i] != 0 && ans > arr[i][i])? arr[i][i] : ans;
				
			System.out.println("#" + test + " " + ans);
		}
	}
}

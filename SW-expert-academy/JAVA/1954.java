

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception	{
		System.setIn(new FileInputStream("res/input1954.txt"));

		int[] dy = {0,1,0,-1};
		int[] dx = {1,0,-1,0};		//우 하 좌 상

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			int cnt = 1;

			for(int i=0;i<n;i++)
				arr[0][i] = cnt++;

			int nowx = n-1;
			int nowy = 0;
			int dir = 1;
			int num = n-1;
			
			while(cnt < n*n) {
				for(int i=0;i<num;i++) {
					nowy+=dy[dir];
					nowx+=dx[dir];
							
					arr[nowy][nowx] = cnt;
					cnt++;
				}
				dir ++;
				dir %= 4;
				for(int i=0;i<num;i++) {
					nowy+=dy[dir];
					nowx+=dx[dir];
							
					arr[nowy][nowx] = cnt;
					cnt++;
				}
				dir ++;
				dir %= 4;
				num--;
			}
		
			System.out.println("#" + test_case);
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++)
					System.out.print(arr[i][j] + " ");
				System.out.println();
			}
		}

	}
}
//n n-1 n-1 n-2 n-2 n-3 n-3 n-4 n-4 n-5 n-5 ... 1 1

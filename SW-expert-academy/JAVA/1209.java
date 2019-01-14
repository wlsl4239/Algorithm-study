package array2;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution1209_Sum_서울9반_김경수 {
	public static void main(String args[]) throws Exception	{
		System.setIn(new FileInputStream("res/input1209.txt"));

		Scanner sc = new Scanner(System.in);
		int T;

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			T=sc.nextInt();
			int [][] arr = new int[100][100];
			int ans = 0;
			int sum = 0;
			
			for(int i=0;i<100;i++)
				for(int j=0;j<100;j++)
					arr[i][j] = sc.nextInt();
			
			sum = 0;
			for(int i=0;i<100;i++) 
				sum += arr[i][99-i];
			ans = (ans>sum)?ans:sum;
			
			sum = 0;
			for(int i=0;i<100;i++) 
				sum += arr[99-i][i];
			ans = (ans>sum)?ans:sum;
			
			for(int i=0;i<100;i++) {
				sum = 0;
				for(int j=0;j<100;j++) {
					sum += arr[i][j];
				}
				ans = (ans>sum)?ans:sum;
			}
			
			for(int i=0;i<100;i++) {
				sum = 0;
				for(int j=0;j<100;j++) {
					sum += arr[j][i];
				}
				ans = (ans>sum)?ans:sum;
			}
			

			System.out.println("#" + T + " " + ans);
		}

	}

}

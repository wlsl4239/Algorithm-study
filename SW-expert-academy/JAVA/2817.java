package array2;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception	{
		System.setIn(new FileInputStream("res/input2817.txt"));

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int ans = 0;
			int n = sc.nextInt();
			int k = sc.nextInt();
			int arr[] =	new int [n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			
			for(int i=1;i<(1<<n);i++) {
				int sum = 0;
				
				for(int j=0;j<n;j++) {
					if(((1<<j) & i) != 0) {
						sum += arr[j];
					}
				}
				
				if(sum==k) {
					ans ++;
				}	
			}
			
			System.out.println("#" + test_case + " " + ans);
		}

	}

}
